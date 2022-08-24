package com.controller;

import com.model.*;
import com.service.*;
import com.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.servlet.annotation.HandlesTypes;
import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {
    @Autowired
    private UserService userService;
    @Autowired
    userRoleService userRoleService;
    @Autowired
    ProductService productService;
    @Autowired
    RestaurantService restaurantService;
    @Autowired
    CartService cartService;

    @RequestMapping("/home")
    public String home(){
       System.out.println("This is home URL");
        return "home";
    }
    @RequestMapping("/login")
    public String login(){
        System.out.println("This is login URL");
        return "login";
    }
    @RequestMapping("/About")
    public String about(){
        System.out.println("This is about URL");
        return "About";
    }
    @RequestMapping("/Cart")
    public String cart(Model m){
        List<Cart>  carts = cartService.fetchCart();
        System.out.println("This is cart URL");
        m.addAttribute("carts",carts);
        return "Cart";
    }
    @RequestMapping(path="/addToCart", method= RequestMethod.POST)
    public String Addtocart(@ModelAttribute Cart cart, Model model){
        System.out.println(cart);
        model.addAttribute("cart",cart);
        this.cartService.createCart(cart);
        return "home";
    }
    @RequestMapping("/registration")
    public String registration(){
        System.out.println("This is registration URL");
        return "registration";
    }
    //@GET @Path("/processor")

    @RequestMapping(path="/processform", method= RequestMethod.POST)
    //@GetMapping(path="/processform")
    public String processform(@RequestParam("name") String name,@RequestParam("phone") String phone,@RequestParam("address") String address,@RequestParam("username") String username,@RequestParam("pass") String pass, Model model){
        UserRole role = userRoleService.getRoleUser();
        System.out.println(role);
        List<UserRole> roles = new ArrayList<>();
        roles.add(role);
        System.out.println(roles);
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        user.setAddress(address);
        user.setUsername(username);
        user.setPass(Util.encodePassword(pass));
        user.setRoles(roles);
        model.addAttribute("user",user);
        System.out.println(user);
        this.userService.createUser(user);
        return "redirect:/login";

    }

    @RequestMapping(path="/FoodList", method= RequestMethod.POST)
    public String searchFoodform(@RequestParam("foodName") String foodName, Model model){
        Product product = productService.fetchProductByName(foodName);
        System.out.println(product);
        System.out.println(product.getRestaurant_id());
        Restaurant restaurant = restaurantService.fetchRestaurantById(product.getRestaurant_id());
        System.out.println(restaurant);
        model.addAttribute("product",product);
        model.addAttribute("restaurant",restaurant);
        return "FoodList";
    }

}
