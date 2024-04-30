package br.com.viniciusintech.entities.factories;

import br.com.viniciusintech.entities.Banco;
import br.com.viniciusintech.entities.ContaCorrente;
import br.com.viniciusintech.entities.implementations.BancoImplementation;
import br.com.viniciusintech.entities.implementations.ContaCorrenteImplementation;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ContaCorrenteFactory {
    public static ContaCorrente makeNewInstance(){return new ContaCorrenteImplementation();
    }
}
