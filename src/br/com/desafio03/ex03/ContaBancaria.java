package br.com.desafio03.ex03;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito de R$" + valor +" efetuado.\n --> Saldo atual: R$" +saldo);
    }

    protected void sacar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " efetuado.\n --> Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    protected void consultarSaldo(){
        System.out.println("Seu saldo atual é R$" +saldo);
    }
}
