package com.example.demo.service;

import java.util.Set;

public interface CartService {
    void addProduct(Set<Integer> ids);

    Set<Integer> getProduct();
}
