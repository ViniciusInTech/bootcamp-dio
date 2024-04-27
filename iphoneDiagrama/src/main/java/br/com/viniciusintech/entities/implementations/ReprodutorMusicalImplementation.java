package br.com.viniciusintech.entities.implementations;

import br.com.viniciusintech.entities.ReprodutorMusical;
import br.com.viniciusintech.entities.commons.ReprodutorMusicalFuncoes;

public class ReprodutorMusicalImplementation extends ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando volume...");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo volume...");
    }

    @Override
    public void proximaMusica() {
        System.out.println("Próxima música...");
    }
}

