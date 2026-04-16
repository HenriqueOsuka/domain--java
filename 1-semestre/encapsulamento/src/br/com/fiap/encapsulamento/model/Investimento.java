package br.com.fiap.encapsulamento.model;

public class Investimento {
    private double valor;
    private String tipo;

    public Investimento(double valor, String tipo){
        this.valor = valor;
        this.tipo = tipo;
    }
    public double getValor(){return valor;}
    public String getTipo(){return tipo;}

    public void setValor(double valor){this.valor = valor;}
    public void setTipo(String tipo){this.tipo = tipo;}

    public double correcao() {
        if (tipo.equalsIgnoreCase("Poupança")) {
            return valor * 1.03;
        } else if (tipo.equalsIgnoreCase("Fundos de renda Fixa")) {
            return valor * 1.04;
        } else {
            return valor;
        }
    }
}
