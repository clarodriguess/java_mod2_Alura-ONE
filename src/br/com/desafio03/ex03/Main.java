package br.com.desafio03.ex03;

//3.Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo().
// Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria.
// Adicione um metodo específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ContaCorrente conta01 = new ContaCorrente();
//        conta01.depositar(1000);
//        conta01.sacar(542.47);
//        conta01.sacar(670.5);
//        conta01.consultarSaldo();
//        conta01.cobrarTarifaMensal();
        int opcao = 0;

        while (opcao != 4) {
            String operacoes = """
                    ***********************
                    Operações:
                       1- Consultar Saldo
                       2- Depositar
                       3- Sacar
                       4- Encerrar
                    ***********************
                    Digite a opção:
                    """;
            System.out.println(operacoes);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    conta01.consultarSaldo();
                    break;

                case 2:
                    System.out.println("Digite o valor a ser depositado:");
                    double deposito = leitura.nextDouble();
                    conta01.depositar(deposito);
                    break;

                case 3:
                    System.out.println("Digite o valor a ser sacado:");
                    double saque = leitura.nextDouble();
                    conta01.sacar(saque);
                    break;

                case 4:
                    conta01.cobrarTarifaMensal();
                    break;

                default:
                    System.out.println(operacoes);
                    break;
            }
        }

    }
}
