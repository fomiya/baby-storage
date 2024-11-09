package com.omiya.takeshi.storage.port;

import com.omiya.takeshi.storage.domain.model.Item;

import java.util.List;

public interface ItemRepository {
    Item save(Item item);

    void deleteById(String id);

    Item findById(String id);

    List<Item> findAll();

    List<Item> findByProduto(String produto);
}
