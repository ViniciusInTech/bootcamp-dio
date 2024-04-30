package br.com.viniciusintech.entities.implementations;

import br.com.viniciusintech.entities.Cliente;
import br.com.viniciusintech.entities.enums.TipoMaioridadeEnum;

public class ClienteImplementation extends Cliente {
    @Override
    public void validarRequisitos() {
        if(!maiorDeIdade(this.getIdade())){
            System.out.println("Cliente menor de idade...");
        }
    }

    private Boolean maiorDeIdade(Integer idade){
        if(idade >= TipoMaioridadeEnum.MAIORIDADE_CIVIL.getActualValue()){
            return true;
        }
        return false;
    }
}
