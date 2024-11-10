package com.omiya.takeshi.storage.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jdk.jfr.Description;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "item")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {
    @Id
    @Description("Id do item")
    private String id;
    @Description("Nome do produto ex: Fralda, sabonete, etc.")
    private String produto;
    @Description("Marca do produto")
    private String marca;
    @Description("Tamanho do produto. Se aplica somente a fraldas e roupas")
    private String tamanho;
    @Description("intervalo de peso do bebe")
    private String kg;
    private String quantidadePorPacote;
    private int pacote;
    private String dataValidade;
    @Description("Meses de vida do bebe que o produto se aplica. Somente para roupas")
    private String mesesDeVida;
    @Description("Conteudo do produto. ex: ml, kg, barra")
    private String conteudo;
    @Description("Quantidade do produto. Só se aplica se o conteudo for preenchido")
    private String quantidade;
    private String categoria;

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

    public String getQuantidadePorPacote() {
        return quantidadePorPacote;
    }

    public void setQuantidadePorPacote(String quantidadePorPacote) {
        this.quantidadePorPacote = quantidadePorPacote;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getKg() {
        return kg;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }

    public String getMesesDeVida() {
        return mesesDeVida;
    }

    public void setMesesDeVida(String mesesDeVida) {
        this.mesesDeVida = mesesDeVida;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
