package Dominio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private int quantidade;
    private int categoriaId;
    private Long usuarioId;
    private LocalDateTime data_hora_criacao;


    public Produto(){}

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
    public String getDescricao(){
        return descricao;
    }
    public void setDescriacao(String descricao){
        this.descricao = descricao;
    }

    public BigDecimal getPreco(){
        return preco;
    }
    public void setPreco(BigDecimal preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getCategoriaId(){
        return categoriaId;
    }
    public void setCategoriaId(int categoriaId){
        this.categoriaId = categoriaId;
    }

    public Long getUsuarioId(){
        return usuarioId;
    }
    public void setUsuarioId(Long usuarioId){
        this.usuarioId = usuarioId;
    }

    public LocalDateTime getDataHoraCriacao(){
        return data_hora_criacao;
    }
    public void setDataHoraCriacao(LocalDateTime data_hora_criacao){
        this.data_hora_criacao = data_hora_criacao;
    }

}
