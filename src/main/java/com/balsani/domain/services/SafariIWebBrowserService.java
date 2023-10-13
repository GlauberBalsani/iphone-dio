package com.balsani.domain.services;

public class SafariIWebBrowserService implements NavegadorDeInternet{
    @Override
    public void exibirPagina(String pagina) {
        System.out.println(pagina);

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página");

    }
}
