package com.example.SpringbootAPI.SpringAPI.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID_PRODUTO")
    private Long id;

    @Column(name = "NOME_PRODUTO")
    private String nome;

    @Column(name = "VALOR_PRODUTO")
    private String valor;

    public Long getId() {
        return id;
    }

    public ProductModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public ProductModel setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getValor() {
        return valor;
    }

    public ProductModel setValor(String valor) {
        this.valor = valor;
        return this;
    }
}
