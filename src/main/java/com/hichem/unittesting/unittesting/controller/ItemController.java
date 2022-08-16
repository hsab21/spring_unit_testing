package com.hichem.unittesting.unittesting.controller;


import com.hichem.unittesting.unittesting.business.ItemBusinessService;
import com.hichem.unittesting.unittesting.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {


    @Autowired
    private ItemBusinessService businessService ;

    @GetMapping("/dummy-item")
    public Item dummyItem(){
        return new Item(1,"ball",10,100);
    }

    @GetMapping("/item-from-business-service")
    public Item itemFromBusinessService(){
        Item item = businessService.retreiveHardcodedItem();
        return item ;
    }
    @GetMapping("/all-items-from-database")
    public List<Item> retreiveAllItems(){
         return businessService.retrieveAllItems();
    };

}
