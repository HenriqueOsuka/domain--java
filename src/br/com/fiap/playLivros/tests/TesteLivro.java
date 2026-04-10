package br.com.fiap.playLivros.tests;


import br.com.fiap.playLivros.enums.VersaoEnum;
import br.com.fiap.playLivros.model.Editora;
import br.com.fiap.playLivros.model.Livro;

import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {

        Editora editora = new Editora("Novatec");
        editora.nome = "Novatec";


        //Instanciar um objeto
        //Tipo nomeObjeto   Construtor
        Livro livro = new Livro("Java 6.0");
        System.out.println(livro.titulo);
        livro.editora = editora;
        livro.versao = VersaoEnum.INTEGRAL;

        System.out.println("O livro " + livro.titulo + " foi publicado pela editora " + livro.editora.nome);
        Livro livroPreferido = new Livro("UML", 50);
        System.out.println("Digite 1-Integral\t2-Resumida\t3-Estendida");
        Scanner leitor = new Scanner(System.in);
        int op = leitor.nextInt();
        if (op == 1) {
            livroPreferido.versao = VersaoEnum.INTEGRAL;
        } if (op == 2) {
            livroPreferido.versao = VersaoEnum.RESUMIDA;
        } else {
            livroPreferido.versao = VersaoEnum.ESTENDIDA;
        }
    }
}
