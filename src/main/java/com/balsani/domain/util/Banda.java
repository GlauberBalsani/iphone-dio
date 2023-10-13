package com.balsani.domain.util;

import java.util.Objects;

public class Banda {
    private final String nomeDaBanda;
    private final String nomeDaMusica;

    private Banda(String nomeDaBanda, String nomeDaMusica) {
        this.nomeDaBanda = nomeDaBanda;
        this.nomeDaMusica = nomeDaMusica;
    }

    public static Banda getInstance(String nomeDaBanda, String nomeDaMusica) {
        Objects.requireNonNull(nomeDaBanda);
        Objects.requireNonNull(nomeDaMusica);

        return new Banda(nomeDaBanda, nomeDaMusica);
    }

    public String getNome() {
        return nomeDaBanda;
    }

    public String getNomeDaMusica() {
        return nomeDaMusica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banda banda = (Banda) o;
        return Objects.equals(nomeDaBanda, banda.nomeDaBanda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDaBanda);
    }

    @Override
    public String toString() {
        return "Banda{" +
                "nomeDaBanda='" + nomeDaBanda + '\'' +
                ", nomeDaMusica='" + nomeDaMusica + '\'' +
                '}';
    }
}
