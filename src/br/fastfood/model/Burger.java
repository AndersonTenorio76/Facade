package br.fastfood.model;

public class Burger implements ItemCombo {
    private final String nome;
    private final double preco;

    public Burger(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Burger doubleBacon() {
        return new Burger("Double Bacon", 22.90);
    }

    public static Burger veganSupreme() {
        return new Burger("Vegan Supreme", 20.00);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
