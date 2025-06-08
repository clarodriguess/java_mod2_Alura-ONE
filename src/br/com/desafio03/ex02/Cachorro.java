package br.com.desafio03.ex02;

public class Cachorro extends Animal {
    @Override
    public void emitirSom(){
        System.out.println("Aun Aun");
    }

    public void abanarRabo(){
        System.out.println("Cachorro abanando rabo");
    }
}
