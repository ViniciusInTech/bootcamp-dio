package br.com.viniciusintech.entities.implementations;

import br.com.viniciusintech.entities.Iphone;
import br.com.viniciusintech.entities.commons.ValidarFuncionamento;

public class IphoneImplementation extends Iphone {
    @Override
    public void validate() {
        System.out.println("Testando funcionamento");
    }
}
