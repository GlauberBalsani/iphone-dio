package com.balsani;


import com.balsani.domain.entities.Iphone;
import com.balsani.domain.entities.Iphone14;
import com.balsani.domain.services.IphoneCallService;
import com.balsani.domain.services.ItunesService;
import com.balsani.domain.services.RepodutorMusical;



public class App {

    public static void main( String[] args ) {
        Iphone iphone = Iphone14.getInstance("Iphone do Glauber", "Modelo 1", "IOS 15",
                "A15 Bionic", "12 MP");
        IphoneCallService iphoneCallService = new IphoneCallService(iphone);

        iphoneCallService.adicionarContato("Samira", 45183506L);
        iphoneCallService.adicionarContato("Glauber", 66555848L);
        iphoneCallService.selecionarContato("Glauber");


    }
}
