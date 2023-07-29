package Dominio;

import java.time.LocalDateTime;


public class Usuario {
    private Long id;
    private String nome;
    private String usuario;
    private String senha;
    private boolean estado;
    private LocalDateTime data_criacao;
    private LocalDateTime ultimo_login;

    public Usuario(){
        this.estado = true;
    }
    public Usuario(Long id, String nome, String usuario, String senha, boolean estado, LocalDateTime data_criacao, LocalDateTime ultimo_login){
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
        this.estado = estado;
        this.data_criacao = data_criacao;
        this.ultimo_login = ultimo_login;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String user){
        this.usuario = user;
    }

    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

    public boolean getEstado(){
        return estado;
    }
    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public LocalDateTime getDataCriacao(){
        return data_criacao;
    }
    public void setDataCriacao(LocalDateTime data_criacao){
        this.data_criacao = data_criacao;
    }
    public LocalDateTime getUltimoLogin(){
        return ultimo_login;
    }
    public void setUltimoLogin(LocalDateTime ultimo_login){
        this.ultimo_login = ultimo_login;
    }

    public void reset(){
        this.estado = true;
    }
    public void mudaEstado(){
        this.estado = !this.estado;
    }

}
