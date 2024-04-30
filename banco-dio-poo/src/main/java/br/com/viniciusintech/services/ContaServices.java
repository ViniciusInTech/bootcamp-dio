package br.com.viniciusintech.services;

import br.com.viniciusintech.entities.Conta;

public class ContaServices {

    public void sacar(Double valor, Conta conta){
        if(valor <= conta.getSaldo()){
            conta.setSaldo(conta.getSaldo()- valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(Double valor, Conta conta){
        conta.setSaldo(valor);
        System.out.println("Deposito realizado");

    }

    public void transferir(Double valor, Conta contaDestino, Conta contaSaida){
        if (contaSaida.getSaldo() >= valor){
            contaDestino.setSaldo(valor);
            contaSaida.setSaldo(contaSaida.getSaldo()-valor);
            System.out.println("Transferencia realizada");

        }
        else{
            System.out.println("Não foi possivel realizar transferencia");
        }



    }

    public void imprimirExtrato(Conta conta){
        System.out.println("=== Extrato Conta Corrente ===");
        conta.imprimirInfosComuns();
    }
}
