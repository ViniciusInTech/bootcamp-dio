package br.com.viniciusintech.entities.factories;

import br.com.viniciusintech.entities.NavegadorDaInternet;
import br.com.viniciusintech.entities.implementations.NavegadorDaInternetImplementation;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NavegadorDaInternetFactory {
    public static NavegadorDaInternet makeNewInstance(){
        return new NavegadorDaInternetImplementation();
    }
}
