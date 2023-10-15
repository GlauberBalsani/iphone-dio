package com.balsani.domain.services;

import com.balsani.domain.entities.Iphone;
import com.balsani.domain.entities.Iphone14;
import org.junit.jupiter.api.BeforeEach;

public class IphoneCallServiceBaseTest {
    protected IphoneCallService iphoneCallService;
    protected Iphone iphone;

    @BeforeEach
    public void setUp() {
        iphone = Iphone14.getInstance("Iphone do Glauber", "Iphone 14","IOS 16",
                "A15 Bionic","12 mp");

        iphoneCallService = new IphoneCallService(iphone);

        iphoneCallService.adicionarContato("Zé da Manga",1199545454L);
        iphoneCallService.adicionarContato("Naldo Benny",2199555555L);
        iphoneCallService.adicionarContato("Mike Baguncinha",11958848484L);
    }



}
