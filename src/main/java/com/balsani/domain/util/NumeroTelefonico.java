package com.balsani.domain.util;

import java.util.Objects;

public class NumeroTelefonico {
    private final Long numero;

    private NumeroTelefonico(Long numero) {
        this.numero = numero;
    }

    public static NumeroTelefonico getInstance(Long numero) {
        Objects.requireNonNull("Informe o Número: " + numero);

        return new NumeroTelefonico(numero);
    }

    public Long getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroTelefonico that = (NumeroTelefonico) o;
        return Objects.equals(numero, that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "NumeroTelefonico{" +
                "numero=" + numero +
                '}';
    }
}
