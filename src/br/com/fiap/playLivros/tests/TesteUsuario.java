package br.com.fiap.playLivros.tests;

import br.com.fiap.playLivros.model.Usuario;

public class TesteUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setNome("Andres");
        usuario.exibirDados();
        System.out.println("Usuário :" + usuario.getNome() );
    }
}
