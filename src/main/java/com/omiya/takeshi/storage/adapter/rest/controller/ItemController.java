package com.omiya.takeshi.storage.adapter.rest.controller;

import com.omiya.takeshi.storage.domain.model.Item;
import com.omiya.takeshi.storage.domain.model.QuantitySearch;
import com.omiya.takeshi.storage.domain.usecase.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public Item inserirItem(@RequestBody Item item) {
        return itemService.inserirItem(item);
    }

    @PutMapping("/{id}")
    public Item alterarItem(@PathVariable String id, @RequestBody Item item) {
        return itemService.alterarItem(id, item);
    }

    @DeleteMapping("/{id}")
    public void excluirItem(@PathVariable String id) {
        itemService.excluirItem(id);
    }

    @GetMapping("/{id}")
    public Item buscarItem(@PathVariable String id) {
        return itemService.buscarItem(id);
    }

    @GetMapping
    public List<Item> listarItens() {
        return itemService.listarItens();
    }

    @GetMapping("/produto")
    public List<Item> listarItensPorProduto(@RequestParam("produto") String produto) {
        return itemService.listarItensPorProduto(produto);
    }

    @GetMapping(value = "/quantidade", produces = MediaType.APPLICATION_JSON_VALUE)
    public QuantitySearch quantidadeDeProduto(@RequestParam("produto") String produto, @RequestParam(value = "tamanho", required = false) String tamanho) {
       return itemService.quantidadeDeProdutos(produto, tamanho);
    }
}
