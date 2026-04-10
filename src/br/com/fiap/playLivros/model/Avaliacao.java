package br.com.fiap.playLivros.model;

import java.time.LocalDateTime;

public class Avaliacao {
    public int estrelas;
    public String comentario;
    public String titulo;
    public LocalDateTime dataComentario;
    public Usuario usuario;
    public boolean aprovado;

}
