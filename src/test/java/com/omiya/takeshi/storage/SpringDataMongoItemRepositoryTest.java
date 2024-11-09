package com.omiya.takeshi.storage;

import com.omiya.takeshi.storage.adapter.repository.SpringDataMongoItemRepository;
import com.omiya.takeshi.storage.domain.model.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class SpringDataMongoItemRepositoryTest {

    @Autowired
    private SpringDataMongoItemRepository repository;

    @Test
    public void testFindByProduto() {
        Item item1 = new Item();    
        item1.setProduto("A");
        repository.save(item1);

        Item item2 = new Item();
        item2.setProduto("b");
        repository.save(item2);

        List<Item> items = repository.findByProduto("b");
        assertEquals(1, items.size());
    }
}