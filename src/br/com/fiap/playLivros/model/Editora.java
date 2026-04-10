package br.com.fiap.playLivros.model;

public class Editora {
    public String nome;
    public String site;
    public String contato;

    public Editora(String nome){
        this.nome  = nome;

    }

    public Editora(String nome, String site, String contato) {
        this.nome = nome;
        this.site = site;
        this.contato = contato;
    }
}
