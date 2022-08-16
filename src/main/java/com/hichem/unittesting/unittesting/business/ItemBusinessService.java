package com.hichem.unittesting.unittesting.business;

import com.hichem.unittesting.unittesting.data.ItemRepository;
import com.hichem.unittesting.unittesting.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ItemBusinessService {
   @Autowired
   private ItemRepository repository;

    public Item retreiveHardcodedItem() {

        return new Item(1,"Ball",10,100);
    }

    public List<Item> retrieveAllItems(){
        List<Item> items = repository.findAll();
        items.stream()
                .forEach((item -> item.setValue(item.getPrice() * item.getQuantity())));
        return items;
    }
}
