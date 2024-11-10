package com.omiya.takeshi.storage.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuantitySearch {

    @JsonProperty("produto")
    private final String  produto;
    @JsonProperty("quantidade")
    private final Integer quantidade;

    public QuantitySearch(String produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
