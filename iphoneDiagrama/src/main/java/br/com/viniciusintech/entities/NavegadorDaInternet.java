package br.com.viniciusintech.entities;

import br.com.viniciusintech.entities.commons.NavegadorDaInternetFuncoes;
import br.com.viniciusintech.entities.commons.ValidarFuncionamento;

public abstract class NavegadorDaInternet implements NavegadorDaInternetFuncoes {

    protected Long id;
    protected String navegadorTitulo;
    protected String buscadorPreferido;

}
