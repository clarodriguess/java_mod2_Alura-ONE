package br.com.exercicios02;

public class Main {
    //ex02 - IdadePessoa
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Benedito Perez");
        pessoa.setIdade(11);
        pessoa.verificarIdade(pessoa.getIdade());

    //ex03 - Produto
        Produto produto = new Produto();
        produto.setNome("Chocolate");
        produto.setPreco(10.99);

        produto.aplicarDesconto(10);

    //ex04 - aluno
        Aluno aluno1 = new Aluno("Bendito Perez", 5, 8, 9);
        Aluno aluno2 = new Aluno("Mangue Hernandez", 9, 4, 7);

        System.out.println("Nome do aluno: " +aluno1.getNome());
        System.out.println("Media " +aluno1.calcularMedia());

        System.out.println("Nome do aluno: " +aluno2.getNome());
        System.out.println("Media " +aluno2.calcularMedia());

    //ex05 -Livro
        Livro livro1 = new Livro("1984", "George Orwell");
        Livro livro2 = new Livro("Metamorfose","Kafka");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
