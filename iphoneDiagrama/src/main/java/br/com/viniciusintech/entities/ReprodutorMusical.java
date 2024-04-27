package br.com.viniciusintech.entities;

import br.com.viniciusintech.entities.commons.ReprodutorMusicalFuncoes;
import br.com.viniciusintech.entities.commons.ValidarFuncionamento;

import java.util.List;

public abstract class ReprodutorMusical implements ReprodutorMusicalFuncoes {

    protected Long id;
    protected List<String> musicasCurtidas;
    protected Double albuns;

}
