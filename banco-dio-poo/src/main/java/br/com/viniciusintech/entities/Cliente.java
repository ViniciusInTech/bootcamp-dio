package br.com.viniciusintech.entities;

import br.com.viniciusintech.entities.commons.ValidacaoRegular;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Cliente implements ValidacaoRegular {

    protected String nome;
    protected Boolean eCasado;
    protected String endereco;
    protected Double rendaMensal;
    protected Integer idade;
}
