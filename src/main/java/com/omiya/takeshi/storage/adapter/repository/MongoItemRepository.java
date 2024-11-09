package com.omiya.takeshi.storage.adapter.repository;

import com.omiya.takeshi.storage.domain.model.Item;
import com.omiya.takeshi.storage.port.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class MongoItemRepository implements ItemRepository {
    @Autowired
    private SpringDataMongoItemRepository repository;

    @Override
    public Item save(Item item) {
        return repository.save(item);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public Item findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Item> findAll() {
        return repository.findAll();
    }
    @Override
        public List<Item> findByProduto(String produto) {
        return repository.findByProduto(produto);

    }
}
