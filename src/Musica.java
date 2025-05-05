// hora da pratica
//1.3 Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
// e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacao;
    int numAvaliacoes;
    double mediaAvaliacao;

    void exibeFicha(){
        String ficha = """
                Música: %s
                Artista: %s
                Ano de Lançamento: %d
                Nota: %.1f
                
                """.formatted(titulo, artista, anoLancamento, mediaAvaliacao);
        System.out.println(ficha);
    }

    void avaliaMusica(double nota){
        somaAvaliacao += nota;
        numAvaliacoes ++;
    }

    double mediaMusica(){
        mediaAvaliacao = somaAvaliacao/numAvaliacoes;
        return mediaAvaliacao;
    }
}
