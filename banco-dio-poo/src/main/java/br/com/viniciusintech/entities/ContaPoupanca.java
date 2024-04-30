package br.com.viniciusintech.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ContaPoupanca extends Conta{
    protected String beneficios;
}
