package com.omiya.takeshi.storage.adapter.repository;

import com.omiya.takeshi.storage.domain.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface SpringDataMongoItemRepository extends MongoRepository<Item, String> {
    List<Item> findByProduto(String produto);

}
