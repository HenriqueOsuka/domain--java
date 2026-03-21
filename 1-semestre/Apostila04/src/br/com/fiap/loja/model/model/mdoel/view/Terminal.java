package br.com.fiap.loja.model.model.mdoel.view;

import br.com.fiap.loja.model.model.mdoel.model.Produto;
import br.com.fiap.loja.model.model.mdoel.model.Fornecedor;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        //ler as informações do Produto (sem fornecedor por enquanto)
        Scanner camisa1=new Scanner(System.in);

        System.out.println("Qual o nome do produto?");
        String nome=camisa1.nextLine() + camisa1.nextLine();

        System.out.println("Qual o código d oproduto?");
        int codigo =  camisa1.nextInt();

        System.out.println("Qual é o preço do produto?");
        double valor = camisa1.nextDouble();

        System.out.println("Está disponível?");
        boolean disponivel = camisa1.nextBoolean();

        //Intanciar a classe produto
        Produto produto =new Produto();


        //Colocar as informações no objeto produto
        produto.codigo=codigo;
        produto.nome=nome;
        produto.preco=valor;
        produto.disponivel=disponivel;


        //Exibir as informações do objeto produto
        System.out.println();
    }
}
