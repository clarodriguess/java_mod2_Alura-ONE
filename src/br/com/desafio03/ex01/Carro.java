package br.com.desafio03.ex01;

public class Carro {
    protected String modelo;
//    private double precoAno1;
//    private double precoAno2;
//    private double precoAno3; -- atualizedo para array:
    protected double[] precos = new double[3];

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

//    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
//        this.precoAno1 = precoAno1;
//        this.precoAno2 = precoAno2;
//        this.precoAno3 = precoAno3;
//    } --- atualizado:
    public void setPrecos(double ano1, double ano2, double ano3) {
        precos[0] = ano1;
        precos[1] = ano2;
        precos[2] = ano3;
    }

//    private double calcularMenorPreco() {
//        double menorPreco = precoAno1;
//        if (precoAno2 < menorPreco) {
//            menorPreco = precoAno2;
//        }
//        if (precoAno3 < menorPreco) {
//            menorPreco = precoAno3;
//        }
//        return menorPreco;
//    } ---------------------------- atualizado:
    public double menorPreco() {
        double menor = precos[0];
        for (double preco : precos) {
            if (preco < menor) menor = preco;
        }
        return menor;
    }

//    private double calcularMaiorPreco() {
//        double maiorPreco = precoAno1;
//        if (precoAno2 > maiorPreco) {
//            maiorPreco = precoAno2;
//        }
//        if (precoAno3 > maiorPreco) {
//            maiorPreco = precoAno3;
//        }
//        return maiorPreco;
//    } ---------------------------- atualizado:
    public double maiorPreco() {
        double maior = precos[0];
        for (double preco : precos) {
            if (preco > maior) maior = preco;
        }
        return maior;
    }

    public void exibirInformacoes() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Modelo: " + modelo);
        System.out.println("\nPreços: ");
        for (int i = 0; i < precos.length; i++) {
            System.out.println(String.format("Ano " + (i + 1) + ": R$%.2f", precos[i]));
        }
        System.out.println(String.format("\nMenor preço: R$%.2f", menorPreco()));
        System.out.println(String.format("Maior preço: R$%.2f", maiorPreco()));
    }

}
