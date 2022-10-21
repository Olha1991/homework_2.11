package com.example.demo.service;

import com.example.demo.model.Cart;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import java.util.Set;

@Service
@SessionScope
public class CartServiceImpl implements CartService {
    private Cart cart;
    public CartServiceImpl(Cart cart){
        this.cart = cart;
    }
    @PostConstruct
    public void init(){
        System.out.println("Service created");
    }

    @Override
    public void addProduct(Set<Integer> ids){
        if(cart ==null){
            Cart cart = new Cart();
        }
        cart.add(ids);
    }
    @Override
    public Set<Integer> getProduct(){
        return cart.getIds();

    }
}
