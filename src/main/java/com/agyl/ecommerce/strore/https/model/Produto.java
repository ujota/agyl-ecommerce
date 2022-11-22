package com.agyl.ecommerce.strore.https.model;

import javax.persistence.*;

@Entity(name="ecommerce")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idProduto")
    private Long idProduto;

    private String urlImagem;

    private String descricao;
    private Double preco;



    public Produto() {
    }

    public Produto(Long idProduto, String urlImagem, String descricao, Double preco) {
        this.idProduto = idProduto;
        this.urlImagem = urlImagem;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Long getIdCliente() {
        return idProduto;
    }

    public void setIdCliente(Long idCliente) {
        this.idProduto = idCliente;
    }

    public String getUrlImagem(){
        return urlImagem;
    }

    public void setUrlImagem(){
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
