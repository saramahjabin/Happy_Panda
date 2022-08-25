package com.controller;

import com.model.*;
import com.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Controller
@RequestMapping("/api/start")
public class HomeController {
    @Autowired
    ProductService productService;
    @Autowired
    UserService userService;
    @Autowired
    ShipingInfoService shipingInfoService;
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
    @RequestMapping("/Order")
    public String Order(Model m){
        List<Cart>  cart = cartService.fetchCart();
        System.out.println("This is order URL");
        m.addAttribute("cart",cart);
        return "Order";
    }
    @RequestMapping("/Cart")
    public String cart(Model m){
        List<Cart>  carts = cartService.fetchCart();
        System.out.println(carts);
        System.out.println(carts.isEmpty());
        if (carts.isEmpty()) {
            return "NoDataFound";
        } else {
            System.out.println("This is cart URL");
            m.addAttribute("carts", carts);
            return "Cart";
        }
    }
    @RequestMapping(path="/addToCart", method= RequestMethod.POST)
    public String Addtocart(@ModelAttribute Cart cart, Model model){
        System.out.println(cart);
        model.addAttribute("cart",cart);
        this.cartService.createCart(cart);
        return "home";
    }
    @RequestMapping(path="/OrderProcess", method= RequestMethod.POST)
    public String OrderProcess(@RequestParam("description") String description,@RequestParam("totalprice") String totalprice,@RequestParam("PaymentMethod") String PaymentMethod,@RequestParam("address") String address,@RequestParam("username") String username, Model model){
        User user = userService.fetchUserByUsername(username);

        System.out.println("Order process URL");
        System.out.println(PaymentMethod);
        if(PaymentMethod.equals("Online Payment")){

    return "onlinePayment";
    }
    else {
        this.cartService.deleteCart();
        ShipingInfo shipingInfo= new ShipingInfo();
        shipingInfo.setDescription(description);
            shipingInfo.setTotalprice(totalprice);
            shipingInfo.setAddress(address);
            shipingInfo.setPaymentMethod(PaymentMethod);
            shipingInfo.setCustomerid(user.getId());
            shipingInfo.setPhone(user.getPhone());
            model.addAttribute("shipingInfo",shipingInfo);
            this.shipingInfoService.createShipingInfo(shipingInfo);

        return "OrderConform";
    }
    }

    @RequestMapping(path="/FoodList", method= RequestMethod.POST)
    public String searchFoodform(@RequestParam("foodName") String foodName, Model model) {
        Product product = productService.fetchProductByName(foodName);
        System.out.println(product);
        System.out.println(product == null);
        if (product == null) {
            return "NoDataFound";
        } else {
            System.out.println(product.getRestaurant_id());
            Restaurant restaurant = restaurantService.fetchRestaurantById(product.getRestaurant_id());
            System.out.println(restaurant);
            model.addAttribute("product", product);
            model.addAttribute("restaurant", restaurant);
            return "FoodList";
        }
    }

}
