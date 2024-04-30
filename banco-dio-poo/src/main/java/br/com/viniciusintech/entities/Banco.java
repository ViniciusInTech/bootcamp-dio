package br.com.viniciusintech.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class Banco {

    protected String nome;
    protected List<Conta> contas;



}
