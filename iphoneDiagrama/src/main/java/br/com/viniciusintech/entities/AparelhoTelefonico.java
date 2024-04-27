package br.com.viniciusintech.entities;

import br.com.viniciusintech.entities.commons.AparelhoTelefonicoFuncoes;
import br.com.viniciusintech.entities.commons.ValidarFuncionamento;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class AparelhoTelefonico implements AparelhoTelefonicoFuncoes {

    protected Long id;
    protected Boolean vivaVoz;
    protected List<String> contatos;

}
