package br.com.viniciusintech.entities.factories;

import br.com.viniciusintech.entities.ContaPoupanca;
import br.com.viniciusintech.entities.implementations.ContaPoupancaImplementation;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ContaPoupancaFactory {
    public static ContaPoupanca makeNewInstance(){return new ContaPoupancaImplementation();
    }
}
