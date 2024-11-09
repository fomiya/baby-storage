package com.omiya.takeshi.storage.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "item")
public class Item {
    @Id
    private String id;
    private String produto;
    private String marca;
    private String tamanho;
    private int quantidadePorPacote;
    private int pacote;
    private String dataValidade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public int getPacote() {
        return pacote;
    }

    public void setPacote(int pacote) {
        this.pacote = pacote;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidadePorPacote() {
        return quantidadePorPacote;
    }

    public void setQuantidadePorPacote(int quantidadePorPacote) {
        this.quantidadePorPacote = quantidadePorPacote;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
