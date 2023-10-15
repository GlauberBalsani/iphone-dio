package com.balsani.domain.services;

import com.balsani.domain.entities.Iphone;
import com.balsani.domain.util.Contato;
import com.balsani.domain.util.NumeroTelefonico;

import java.util.HashMap;
import java.util.Map;

public class IphoneCallService implements AparelhoTelefonico{
    private static final Map<Contato, NumeroTelefonico> CONTATOS = new HashMap<Contato, NumeroTelefonico>();
    private final Iphone iphone;
    public IphoneCallService(Iphone iphone) {
        this.iphone = iphone;
    }

    @Override
    public void ligarParaContato(String nome) {
        selecionarContato(nome);
        System.out.println(iphone.getNome()+ " Ligando para: " + nome);
    }

    @Override
    public void atender() {
        System.out.println(iphone.getNome()+ " Atendendo");


    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Deixe seu recado após o sinal");

    }

    @Override
    public void adicionarContato(String nome, Long numero) {
        var contato = Contato.getInstance(nome);
        var numeroTelefonico = NumeroTelefonico.getInstance(numero);
        CONTATOS.put(contato, numeroTelefonico);
    }

    @Override
    public void selecionarContato(String nome) {
        for (Map.Entry<Contato, NumeroTelefonico> entry : CONTATOS.entrySet()) {
            Contato contato = entry.getKey();
            if (contato.getNome().equals(nome)) {
                NumeroTelefonico numero = entry.getValue();
                System.out.println("Contato: " + contato.getNome() + ", Número: " + numero.getNumero());
                return;
            }
        }
        throw new BusinessException("Contato não existente");
    }
}
