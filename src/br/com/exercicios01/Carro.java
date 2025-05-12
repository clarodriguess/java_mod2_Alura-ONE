package br.com.exercicios01;
//4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

import java.time.Year;

public class Carro {
    String modelo;
    String cor;
    int ano;
    int idade;


    void exibeFichaTecnica(){
        String ficha = """
                Modelo do carro: %s
                Cor: %s
                Ano: %d
                Idade: %d
                """.formatted(modelo,cor,ano, idade);
        System.out.println(ficha);
    }

    int idadeCarro(){
        int anoAtual = Year.now().getValue();
        return idade = anoAtual - ano;
    }
}
