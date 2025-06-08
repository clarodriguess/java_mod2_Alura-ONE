package br.com.desafio01;

public class Main {
    public static void main(String[] args) {
        //ex 1.1
        Pessoa pessoa = new Pessoa();
        pessoa.mansagem();

        //ex 1.2
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobro(2);
        System.out.println(resultado);

        //ex 1.3
        Musica minhaMusica = new Musica();
        minhaMusica.artista = "David Bowie";
        minhaMusica.titulo = "Heroes";
        minhaMusica.anoLancamento = 1979;

        //notas
        minhaMusica.avaliaMusica(10);
        minhaMusica.avaliaMusica(9);
        minhaMusica.avaliaMusica(7);

        minhaMusica.mediaMusica();
        minhaMusica.exibeFicha();

        //ex 1.4
        Carro meuCarro= new Carro();
        meuCarro.modelo = "Fusca";
        meuCarro.cor = "Bege";
        meuCarro.ano = 1977;

        meuCarro.idadeCarro();
        meuCarro.exibeFichaTecnica();

        //ex 1.5
        Aluno novoAluno1 = new Aluno();
        novoAluno1.nomeAluno= "Benedito Perez";
        novoAluno1.idadeAluno=11;

        Aluno novoAluno2 = new Aluno();
        novoAluno2.nomeAluno= "Bicudo Rodrigues";
        novoAluno2.idadeAluno=10;

        novoAluno1.exibeAluno();
        novoAluno2.exibeAluno();
    }
}
