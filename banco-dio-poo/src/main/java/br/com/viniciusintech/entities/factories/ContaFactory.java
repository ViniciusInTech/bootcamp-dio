package br.com.viniciusintech.entities.factories;

import br.com.viniciusintech.entities.Banco;
import br.com.viniciusintech.entities.Conta;
import br.com.viniciusintech.entities.implementations.BancoImplementation;
import br.com.viniciusintech.entities.implementations.ContaImplementation;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ContaFactory {
    public static Conta makeNewInstance(){return new ContaImplementation();
    }
}
