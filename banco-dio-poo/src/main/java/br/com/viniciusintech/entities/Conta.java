package br.com.viniciusintech.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta{

    protected Integer agencia;
    protected Integer numero;
    protected Double saldo;
    protected Cliente cliente;
    protected Double tarifa;

    public void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
