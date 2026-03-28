package br.com.fiap.loja.model;

public class Produto {
    public double preco;
    public int codigo;
    public boolean disponivel;
    public Fornecedor Fornecedor;
    public String nome;
    public String quantidade;


    public double calcularDesconto(){
        double desconto = preco * 0.2;
        return desconto;
    }

    public void aumentarPreco(double porcentagem){
        preco += preco * porcentagem /100;



        //criar um método para calcular o valor total da compra
        //dado a quantidade, calcular o valor da compra


        }
    public double calcularValorTotal(int quantidade){
        return preco * quantidade;
    }

}
