package com.hichem.unittesting.unittesting.data;

import com.hichem.unittesting.unittesting.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
