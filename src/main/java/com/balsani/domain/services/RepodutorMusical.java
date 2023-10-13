package com.balsani.domain.services;

import com.balsani.domain.entities.Iphone;

public interface RepodutorMusical {
    void tocar(String musica);
    void pausar(String musica);
    void selecionarMusica( String musica);
    void adicionarMusica(String artista, String musica);
    void mostrarPlaylist();




}
