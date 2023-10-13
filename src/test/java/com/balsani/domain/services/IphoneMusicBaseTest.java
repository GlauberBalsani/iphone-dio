package com.balsani.domain.services;

import com.balsani.domain.entities.Iphone;
import com.balsani.domain.entities.Iphone14;
import com.balsani.domain.services.ItunesService;
import org.junit.jupiter.api.BeforeEach;

public class IphoneMusicBaseTest {
    protected ItunesService itunesService;
    protected Iphone iphone;

    @BeforeEach
    public void setUp() {
        iphone = Iphone14.getInstance("Iphone do Glauber", "Iphone 14","IOS 16",
                "A15 Bionic","12 mp");

        itunesService = new ItunesService(iphone);

        itunesService.adicionarMusica("The Beatles", "Twist and Shout");
        itunesService.adicionarMusica("Echo & the Bunnymen", "The Killing Moon");
        itunesService.adicionarMusica("Radiohead", "Creep");


    }

}
