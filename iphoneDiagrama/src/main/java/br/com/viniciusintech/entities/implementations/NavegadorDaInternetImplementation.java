package br.com.viniciusintech.entities.implementations;

import br.com.viniciusintech.entities.NavegadorDaInternet;
import br.com.viniciusintech.entities.commons.NavegadorDaInternetFuncoes;

public class NavegadorDaInternetImplementation extends NavegadorDaInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void fechaPagina() {
        System.out.println("Fechando página...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void fazerPesquisa() {
        System.out.println("Realizando pesquisa...");
    }
}
