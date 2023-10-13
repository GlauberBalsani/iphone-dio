package com.balsani;


import com.balsani.domain.entities.Iphone;
import com.balsani.domain.entities.Iphone14;
import com.balsani.domain.services.ItunesService;
import com.balsani.domain.services.RepodutorMusical;



public class App {

    public static void main( String[] args ) {
        Iphone iphone = Iphone14.getInstance("Iphone do Glauber", "Modelo 1", "IOS 15",
                "A15 Bionic", "12 MP");
        RepodutorMusical itunes = new ItunesService(iphone);

        itunes.adicionarMusica("The Beatles", "Twist and Shout");
        itunes.adicionarMusica("Echo & the Bunnymen", "The Killing Moon");
        itunes.adicionarMusica("Radiohead", "Creep");

        itunes.mostrarPlaylist();

        System.out.println();


        itunes.tocar("Creep");



    }
}
