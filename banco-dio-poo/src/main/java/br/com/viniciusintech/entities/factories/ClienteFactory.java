package br.com.viniciusintech.entities.factories;

import br.com.viniciusintech.entities.Cliente;
import br.com.viniciusintech.entities.implementations.ClienteImplementation;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteFactory {
    public static Cliente makeNewInstance(){
        return new ClienteImplementation();
    }
}
