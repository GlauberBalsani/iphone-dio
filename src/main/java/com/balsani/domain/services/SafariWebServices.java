package com.balsani.domain.services;

public class SafariWebServices implements NavegadorDeInternet{
    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo: " + pagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova página");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada");
    }
}
