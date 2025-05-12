package br.com.exercicios01;
//hora da pratica 1.5
// Crie uma classe Aluno com atributos nome, idade, e um metodo para exibir informações.
// Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o metodo para exibir as informações.

public class Aluno {
    String nomeAluno;
    int idadeAluno;

    void exibeAluno(){
        String fichaAluno = """
                Nome do Aluno : %s
                Idade : %d
                """.formatted(nomeAluno, idadeAluno);
        System.out.println(fichaAluno);
    }
}
