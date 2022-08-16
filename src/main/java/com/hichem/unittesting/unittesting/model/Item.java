package com.hichem.unittesting.unittesting.model;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


@Data
@Entity
public class Item {

    @Id
    private int id;
    private String name ;
    private int price ;
    private int quantity ;

    @Transient
    private int value;

    protected Item(){

    }
    public Item(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

}
