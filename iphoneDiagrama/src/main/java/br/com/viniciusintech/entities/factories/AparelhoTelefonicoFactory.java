package br.com.viniciusintech.entities.factories;

import br.com.viniciusintech.entities.AparelhoTelefonico;
import br.com.viniciusintech.entities.implementations.AparelhoTelefonicoImplementation;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AparelhoTelefonicoFactory {

    public static AparelhoTelefonico makeNewInstance(){
        return new AparelhoTelefonicoImplementation();
    }
}
