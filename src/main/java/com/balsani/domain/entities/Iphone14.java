package com.balsani.domain.entities;

import java.util.Objects;

public class Iphone14 implements Iphone{
    private final String nome;
    private final String modelo;
    private final String sistemaOperacional;
    private final String processador;
    private final String fotoResolucao;


    private Iphone14(String nome,String modelo, String sistemaOperacional, String processador, String fotoResolucao) {
        this.nome = nome;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.processador = processador;
        this.fotoResolucao = fotoResolucao;
    }

    public static Iphone14 getInstance(String nome, String modelo, String sistemaOperacional, String processador, String fotoResolucao) {
        Objects.requireNonNull(nome, "Informe o nome do telefone");
        Objects.requireNonNull(modelo,"Informe o modelo");
        Objects.requireNonNull(sistemaOperacional,"Informe a versão do IOS");
        Objects.requireNonNull(processador,"Informe o prcessador");
        Objects.requireNonNull(fotoResolucao,"Informe o a resolução da câmera");

        return new Iphone14(nome,modelo, sistemaOperacional, processador, fotoResolucao);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    @Override
    public String getSistemaOperacional() {
        return this.sistemaOperacional;
    }

    @Override
    public String getProcessador() {
        return this.processador;
    }

    @Override
    public String getFotoResolucao() {
        return fotoResolucao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Iphone14 iphone14 = (Iphone14) o;
        return Objects.equals(modelo, iphone14.modelo) && Objects.equals(sistemaOperacional, iphone14.sistemaOperacional) && Objects.equals(processador, iphone14.processador) && Objects.equals(fotoResolucao, iphone14.fotoResolucao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, sistemaOperacional, processador, fotoResolucao);
    }

    @Override
    public String toString() {
        return "Iphone14{" +
                "modelo='" + modelo + '\'' +
                ", sistemaOperacional='" + sistemaOperacional + '\'' +
                ", processador='" + processador + '\'' +
                ", fotoResolucao='" + fotoResolucao + '\'' +
                '}';
    }
}
