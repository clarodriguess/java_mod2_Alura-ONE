package br.com.exercicios02;

public class Main {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("João Paulo");
        pessoa.setIdade(17);
        pessoa.verificarIdade(pessoa.getIdade());

        System.out.println("Nome: " +pessoa.getNome()+ " e tem " +pessoa.getIdade()+ " anos");

    }
}
