package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Fornecedor;
import br.com.fiap.loja.model.Produto;


import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        //ler as informações do Produto (sem fornecedor por enquanto)
        Scanner entrada=new Scanner(System.in);

        System.out.println("Qual o nome do produto?");
        String nome=entrada.nextLine() + entrada.nextLine();

        System.out.println("Qual o código d oproduto?");
        int codigo =  entrada.nextInt();

        System.out.println("Qual é o preço do produto?");
        double valor = entrada.nextDouble();

        System.out.println("Está disponível?");
        boolean disponivel = entrada.nextBoolean();

        //Intanciar a classe produto
        Produto produto =new Produto();


        //Colocar as informações no objeto produto
        produto.codigo=codigo;
        produto.nome=nome;
        produto.preco=valor;
        produto.disponivel=disponivel;

        //ler os dados do fornecedor
        //será inserido novos dados para o fornecedor

        System.out.println("Digite o cnpj do fornecedor");
        String cnpj = entrada.next() + entrada .nextLine();

        System.out.println("Digite o nome do fornecedor");
        String nomeFornecedor = entrada.next() + entrada.nextLine();

        //Instanciar o fornecedor

        Fornecedor vendedor =new Fornecedor();
        //neste caso será feito uma nova variável neste caso tudo que será escrito no fornecedor será escrito no vendedor


        //Adicionar valores ao fornecedor

        vendedor.cnpj = cnpj;
        vendedor.nome =nomeFornecedor;

        //Colocar o fornecedor no produto
        produto.Fornecedor = vendedor;
        //agora o fornecedor ou produto está dentro produto


        //Exibir os dados do fornecedor do produto
        System.out.println("Nome do fornecedor é " + produto.Fornecedor.nome);
        System.out.println("cnpj do fornecedor é " + produto.Fornecedor.cnpj);
        //será exibido o nome do fornecedor junto com o que foi escrito


        //Exibir as informações do objeto produto
        System.out.println(produto.nome);
        System.out.println(produto.codigo);
        System.out.println(produto.preco);
        System.out.println(produto.disponivel);

        double pechincha = produto.calcularDesconto();
        System.out.println("Desconto: "+pechincha);

        System.out.println("Qual a % de aumento?");
        double porcentagem = entrada.nextDouble();
        produto.aumentarPreco(porcentagem);

        System.out.println("Novo preço: " + produto.preco);



    }
}
