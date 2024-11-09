package com.omiya.takeshi.storage.adapter.rest.feign;

import com.omiya.takeshi.storage.domain.model.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "itemService", url = "http://localhost:8080")
public interface FeignItemClient {
    @PostMapping("/itens")
    Item inserirItem(@RequestBody Item item);

    @PutMapping("/itens/{id}")
    Item alterarItem(@PathVariable("id") String id, @RequestBody Item item);

    @DeleteMapping("/itens/{id}")
    void excluirItem(@PathVariable("id") String id);

    @GetMapping("/itens/{id}")
    Item buscarItem(@PathVariable("id") String id);
}
