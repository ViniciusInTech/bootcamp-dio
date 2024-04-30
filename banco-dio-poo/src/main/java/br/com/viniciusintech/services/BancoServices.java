package br.com.viniciusintech.services;

import br.com.viniciusintech.entities.Cliente;
import br.com.viniciusintech.entities.Conta;
import br.com.viniciusintech.entities.ContaCorrente;
import br.com.viniciusintech.entities.factories.ClienteFactory;
import br.com.viniciusintech.entities.factories.ContaCorrenteFactory;
import br.com.viniciusintech.entities.factories.ContaFactory;

public class BancoServices {
    private Integer contadorDeContas = 1;

    public void aberturaDeContaCorrente(String nomeCliente, Integer idadeCliente){
        var cliente = ClienteFactory.makeNewInstance();
        cliente.setNome(nomeCliente);
        cliente.setIdade(idadeCliente);

        var conta = ContaCorrenteFactory.makeNewInstance();
        conta.setAgencia(1);
        conta.setSaldo(0.0);
        conta.setCliente(cliente);
    }

}
