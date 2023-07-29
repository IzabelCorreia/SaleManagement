package Dominio;

import java.math.BigDecimal;

public class VendasItem {

    private int vendaid;
    private Long produtoId;
    private int quantidade;
    private BigDecimal total;
    private BigDecimal desconto;

    public VendasItem(){}

    public int getVendaId(){
        return vendaid;
    }
    public void setVendaId(int vendaId){
        this.vendaid = vendaId;
    }
    public Long getProdutoId(){
        return produtoId;
    }
    public void setProdutoId(Long produtoId){
        this.produtoId = produtoId;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public BigDecimal getTotal(){
        return total;
    }
    public void setTotal(BigDecimal total){
        this.total = total;
    }
    public BigDecimal getDesconto(){
        return desconto;
    }
    public void setDesconto(BigDecimal desconto){
        this.desconto = desconto;
    }
}
