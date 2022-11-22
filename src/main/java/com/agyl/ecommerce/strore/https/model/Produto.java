package com.agyl.ecommerce.strore.https.model;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity(name="produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private Long idCliente;
    private String descricao;
    private Double preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Produto() {
    }

    public Produto(Long idCliente, String descricao, Double preco) {
        this.idCliente = idCliente;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
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
