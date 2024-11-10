package com.omiya.takeshi.storage.domain.usecase;

import com.omiya.takeshi.storage.domain.model.Item;
import com.omiya.takeshi.storage.domain.model.QuantitySearch;
import com.omiya.takeshi.storage.port.ItemRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item inserirItem(Item item) {
        return itemRepository.save(item);
    }

    public Item alterarItem(String id, Item item) {
        item.setId(id);
        return itemRepository.save(item);
    }

    public void excluirItem(String id) {
        itemRepository.deleteById(id);
    }

    public Item buscarItem(String id) {
        return itemRepository.findById(id);
    }

    public List<Item> listarItens() {
        return itemRepository.findAll();
    }

    public List<Item> listarItensPorProduto(String produto) {
        return itemRepository.findByProduto(produto);
    }

    public QuantitySearch quantidadeDeProdutos(String produto, String tamanho){
        List<Item> itens = itemRepository.findByProduto(produto);
        int quantidade = 0;
        for (Item item : itens) {
            if (!StringUtils.isEmpty(tamanho) && item.getTamanho().equals(tamanho)){
            quantidade += Integer.parseInt(item.getQuantidadePorPacote()) * item.getPacote();
            }else if (StringUtils.isEmpty(tamanho)){
                quantidade += Integer.parseInt(item.getQuantidadePorPacote()) * item.getPacote();
            }
        }
        return new QuantitySearch(produto, quantidade);
    }
}
