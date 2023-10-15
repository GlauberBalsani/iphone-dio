package com.balsani.domain.util;

import java.util.Objects;

public class Contato {
    private final String nome;


    private Contato(String nome) {
        this.nome = nome;

    }

    public static Contato getInstance(String nome) {
        Objects.requireNonNull(nome, "Informe o nome do contato!!");

        return new Contato(nome);
    }

    public String getNome() {
        return nome;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
