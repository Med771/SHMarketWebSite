package com.example.market.module;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> items = new ArrayList<>();

    // Add method
    public void addItems(List<Integer> items) {
        this.items.addAll(items);
    }

    // Get method
    public List<Integer> getItems() {
        return items;
    }
}
