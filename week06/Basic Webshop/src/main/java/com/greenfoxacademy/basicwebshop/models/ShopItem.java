package com.greenfoxacademy.basicwebshop.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShopItem {

    private String name;
    private String description;
    private Double price;
    private Integer quantityOfStock;


}
