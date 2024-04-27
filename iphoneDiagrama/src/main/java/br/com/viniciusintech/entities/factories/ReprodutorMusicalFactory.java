package br.com.viniciusintech.entities.factories;

import br.com.viniciusintech.entities.ReprodutorMusical;
import br.com.viniciusintech.entities.implementations.ReprodutorMusicalImplementation;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ReprodutorMusicalFactory {
    public static ReprodutorMusical makeNewInstance(){
        return new ReprodutorMusicalImplementation();
    }
}
