package com.balsani.domain.services;

import com.balsani.domain.entities.Iphone;
import com.balsani.domain.util.Contato;
import com.balsani.domain.util.NumeroTelefonico;

public interface AparelhoTelefonico {
    void ligarParaContato(String nome);
    void atender();
    void iniciarCorreioDeVoz();
    void adicionarContato(String nome, Long numero);

    void selecionarContato(String contato);

}
