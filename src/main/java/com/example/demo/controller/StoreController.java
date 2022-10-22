package com.example.demo.controller;

import com.example.demo.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RequestMapping("/order")
@RestController
public class StoreController {
    private final CartService cartService;

    public StoreController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping(path = "/add")
    public void addProduct(@RequestParam (value = "ID") Set<Integer> ids){
        cartService.addProduct(ids);
    }

    @GetMapping(path = "/get")
    public Set<Integer> getProduct(){
        return cartService.getProduct();
    }
}
