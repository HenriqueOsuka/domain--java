package br.com.fiap.loja.view;

import br.com.fiap.loja.model.aluno;
import java.util.Scanner;


public class TerminalNota {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        aluno Aluno =new aluno();

        // ler os dados do aluno

        System.out.println("Digite o nome");
        aluno.nome =leitor.next()+ leitor.nextLine();

        System.out.println("Digite a nota da cp1");
        double cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da cp2");
        double cp2 = leitor.nextDouble();

        System.out.println("Digite a nota do seu primeiro challenge");
        double primeiroChallenge = leitor.nextDouble();

        System.out.println("Digite a nota do seu segundo challenge");
        double segundoChallenge = leitor.nextDouble();

        System.out.println("Digite a nota da gs");
        double gs = leitor.nextDouble();



        double media =aluno.calcularMedia();





    }
}
