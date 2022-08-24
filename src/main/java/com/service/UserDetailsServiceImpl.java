package com.service;

import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;


@Service("UserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserService userService;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User appUser = userService.fetchUserByUsername(s);

        if (appUser !=null){
            Collection<GrantedAuthority> authorities = appUser.getRoles()
                    .stream()
                    .map(userRole -> new SimpleGrantedAuthority(userRole.getRoleName()))
                    .collect(Collectors.toCollection(ArrayList::new));

            return new org.springframework.security.core.userdetails.
                    User(s,appUser.getPass(),true,true,true,true,authorities);
        }else {
            throw new UsernameNotFoundException("User Not found");
        }




    }
}
