package br.com.desafio03.ex02;

public class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Miau");
    }

    public void arranharMoveis(){
        System.out.println("Gato arranhando sofa");
    }
}
