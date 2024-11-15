package com.example.market.service;

import com.example.market.module.Basket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    private final Basket basket;

    @Autowired
    public BasketService(Basket basket) {
        this.basket = basket;
    }

    // Add method
    public void addItems(List<Integer> items) {
        basket.addItems(items);
    }

    // Get method
    public List<Integer> getItems() {
        return basket.getItems();
    }
}
