package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class HomeController {
    List<ShopItem> itemList;

    HomeController(){
        itemList = new ArrayList<>(Arrays.asList(
                new ShopItem("Running shoes", "Nike running shoes for every day sport", 30D, 5),
                new ShopItem("Printer", "Some HP printer that will print pages", 120D, 2),
                new ShopItem("Coca cola", "0.5l standard coke", 1.2D, 0),
                new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 15D, 100),
                new ShopItem("T-shirt", "Blue with a corgi on a bike", 10D, 1)
        ));
    }

    @GetMapping("/webshop")
    public String index(Model model){
        model.addAttribute("itemList", itemList);
        model.addAttribute("currency", "€");
        return "index";
    }

    @GetMapping("/only-available")
    public String getAvailable(Model model){
        List<ShopItem> filteredList = itemList
                .stream()
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
        model.addAttribute("currency", "€");
        model.addAttribute("itemList", filteredList);
        return "index";
    }

    @GetMapping("/cheapest-first")
    public String getCheapestFirst(Model model){
        List<ShopItem> filteredList = itemList
                .stream()
                .sorted(Comparator.comparingDouble(ShopItem::getPrice))
                .collect(Collectors.toList());
        model.addAttribute("currency", "€");
        model.addAttribute("itemList", filteredList);
        return "index";
    }

    @GetMapping("/contains-nike")
    public String getNike(Model model){
        List<ShopItem> filteredList = itemList
                .stream()
                .filter(shopItem -> shopItem.getName().toLowerCase(Locale.ROOT).contains("nike") ||
                        shopItem.getDescription().toLowerCase(Locale.ROOT).contains("nike"))
                .collect(Collectors.toList());
        model.addAttribute("currency", "€");
        model.addAttribute("itemList", filteredList);
        return "index";
    }

    @GetMapping("/average-stock")
    public String getAverage(Model model){
        Double item = itemList
                .stream()
                .collect(Collectors.averagingDouble(ShopItem::getPrice));
        model.addAttribute("currency", "€");
        model.addAttribute("item", "Average stock of items is: "
                + String.format("%.2f",item));
        return "index";
    }

    @GetMapping("/most-expensive")
    public String getMostExpensive(Model model){
        ShopItem item = itemList
                .stream()
                .filter(shopItem -> shopItem.getQuantityOfStock() > 0)
                .max(Comparator.comparingDouble(ShopItem::getPrice))
                .orElseThrow(NoSuchElementException::new);
        model.addAttribute("currency", "€");
        model.addAttribute("item", item.getName());
        return "index";
    }

    @PostMapping("/search")
    public String searchTable(@RequestParam String searchword, Model model){
        List<ShopItem> filteredList = itemList
                .stream()
                .filter(shopItem -> shopItem.getName().toLowerCase(Locale.ROOT).contains(searchword.toLowerCase(Locale.ROOT)) ||
                        shopItem.getDescription().toLowerCase(Locale.ROOT).contains(searchword.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
        model.addAttribute("currency", "€");
        model.addAttribute("itemList", filteredList);
        return "index";
    }


}
