package br.com.desafio03.ex03;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal = 10.5;

    public void cobrarTarifaMensal() {
        if (saldo >= tarifaMensal) {
            saldo -= tarifaMensal;
            System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. \n --> Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para cobrança de tarifa mensal.");
        }
    }
}
