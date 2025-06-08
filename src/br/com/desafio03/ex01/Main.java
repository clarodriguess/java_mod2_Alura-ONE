package br.com.desafio03.ex01;
//1.Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
// Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
// Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.


public class Main {
    public static void main(String[] args) {

//        ModeloCarro carro01 = new ModeloCarro();
//        carro01.definirModelo("Fiat Sedan");
//        carro01.definirPrecos(30000, 32000, 35000);
//        carro01.exibirInfo(); ----------------atualizado:
        ModeloCarro carro1 = new ModeloCarro("Civic", 85000, 87000, 89000);
        ModeloCarro carro2 = new ModeloCarro("March", 35000, 42000, 44000);
        carro1.exibirInformacoes();
        carro2.exibirInformacoes();

    }
}
