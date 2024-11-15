package com.example.market.controller;

import com.example.market.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam("items") List<Integer> items) {
        basketService.addItems(items);

        return "<h1>Успешно</h1>";
    }

    @GetMapping(path = "/get")
    public List<Integer> get() {
        return basketService.getItems();
    }
}
