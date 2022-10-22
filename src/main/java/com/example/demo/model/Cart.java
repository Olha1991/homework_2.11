package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class Cart {
    private Set<Integer> ids;
    public Cart (){
        this.ids = new HashSet<>();
    }

    @PostConstruct
    public void init(){
        System.out.println("Cart class created");
    }
    public void add( Set<Integer> ids){
        for(Integer id : ids){
            this.ids.add(id);
        }
    }
    public  Set<Integer> getIds(){
        return ids;
    }
}
