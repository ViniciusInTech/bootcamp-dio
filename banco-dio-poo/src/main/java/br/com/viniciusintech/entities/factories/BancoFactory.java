package br.com.viniciusintech.entities.factories;

import br.com.viniciusintech.entities.Banco;
import br.com.viniciusintech.entities.implementations.BancoImplementation;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BancoFactory {

    public static Banco makeNewInstance(){return new BancoImplementation();
    }
}
