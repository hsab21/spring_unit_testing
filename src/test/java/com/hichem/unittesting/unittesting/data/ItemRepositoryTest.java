package com.hichem.unittesting.unittesting.data;


import com.hichem.unittesting.unittesting.model.Item;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository repository ;

    @Test
    public void testFindAll(){
        List<Item> items = repository.findAll();
        Assert.assertEquals(3,items.size());

    }
}
