package br.com.viniciusintech.entities.factories;

import br.com.viniciusintech.entities.Iphone;
import br.com.viniciusintech.entities.implementations.IphoneImplementation;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IphoneFactory {
    public static Iphone makeNewInstance(){
        return new IphoneImplementation();
    }
}
