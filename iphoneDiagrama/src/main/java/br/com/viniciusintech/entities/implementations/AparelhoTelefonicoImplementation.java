package br.com.viniciusintech.entities.implementations;

import br.com.viniciusintech.entities.AparelhoTelefonico;

public class AparelhoTelefonicoImplementation extends AparelhoTelefonico {
    @Override
    public void iniciarNovaChamada() {
        System.out.println("Iniciando nova chamada...");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void desligarChamada() {
        System.out.println("Desligando chamada...");
    }

    @Override
    public void porChamadaEmEspera() {
        System.out.println("Colocando chamada em espera...");
    }
}