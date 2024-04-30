package br.com.viniciusintech.entities;

import br.com.viniciusintech.entities.commons.ValidacaoRegular;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ContaCorrente extends Conta implements ValidacaoRegular {
    protected String cartaoDeCredito;
    protected String propostasDeInvestimento;
}
