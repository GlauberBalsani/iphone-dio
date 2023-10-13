package com.balsani.domain.services;

import com.balsani.domain.entities.Iphone;

public interface AparelhoTelefonico {
    void ligar(Iphone iphone, int numero);
    void atender(Iphone iphone);
    void iniciarCorreioDeVoz(Iphone iphone);
}
