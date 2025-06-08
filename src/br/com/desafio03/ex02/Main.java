package br.com.desafio03.ex02;
//2.Crie uma classe Animal com um metodo emitirSom().
// Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal.
// Adicione o metodo emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o metodo.
// Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.

public class Main {
    public static void main(String[] args) {

    Cachorro cao = new Cachorro();
        cao.emitirSom();
        cao.abanarRabo();

    Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
