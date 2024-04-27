package br.com.viniciusintech.entities;

import br.com.viniciusintech.entities.commons.ValidarFuncionamento;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Iphone implements ValidarFuncionamento {
    protected Long id;
    protected Double bateria;
    protected AparelhoTelefonico aparelhoTelefonico;
    protected NavegadorDaInternet navegadorDaInternet;
}
