package com.balsani.domain.services;

import com.balsani.domain.entities.Iphone;
import com.balsani.domain.entities.Iphone14;
import com.balsani.domain.util.Banda;

import java.util.*;

public class ItunesService implements  RepodutorMusical{

    private static final List<Banda> BANDAS = new ArrayList<>();
    private final Iphone iphone;

    public ItunesService(Iphone iphone) {
        this.iphone = iphone;
    }



    @Override
    public void tocar( String musica) {
        if (!BANDAS.contains(musica)) {
            throw new BusinessException("Música não adicionada a playlist");
        }
        selecionarMusica(musica);
        System.out.println(iphone.getNome() + " Tocando: " + musica);
    }

    @Override
    public void pausar(String musica) {
        System.out.println( iphone.getNome() + " Pausando: " + musica);

    }

    @Override
    public void selecionarMusica(String musica) {
        BANDAS.stream().filter(m -> m.getNomeDaMusica().equals(musica)).forEach(m -> System.out.println(m + "Selecionada"));


    }

    @Override
    public void adicionarMusica(String artista, String musica) {
        var banda = Banda.getInstance(artista, musica);
        BANDAS.add(banda);

    }

    @Override
    public void mostrarPlaylist() {
        BANDAS.forEach(System.out::println);
    }

}
