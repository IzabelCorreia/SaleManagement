package Dominio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Vendas {
    private int id;
    private BigDecimal total_vendas;
    private BigDecimal troco;
    private BigDecimal desconto;
    private int clientesId;
    private Long usuarioId;
    private LocalDateTime data_hora_venda;
    private LocalDateTime ultima_atualizacao;

    public Vendas(){}


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public BigDecimal getTotalVendas(){
        return total_vendas;
    }
    public BigDecimal getTroco(){
        return troco;
    }
    public void setTroco(BigDecimal troco){
        this.troco = troco;
    }
    public BigDecimal getDesconto(){
        return desconto;
    }
    public void setDesconto(BigDecimal desconto){
        this.desconto = desconto;
    }
    public int getclientesId(){
        return clientesId;
    }
    public void setClientesId(int clientesId){
        this.clientesId = clientesId;
    }
    public Long getUsuarioId(){
        return usuarioId;
    }
    public void setUsuarioId(Long usuarioId){
        this.usuarioId = usuarioId;
    }
    public LocalDateTime getDataHoraVenda(){
        return data_hora_venda;
    }
    public void setDataHoraVenda(LocalDateTime data_hora_venda){
        this.data_hora_venda = data_hora_venda;
    }
    public LocalDateTime getUltimaAtualizacao(){
        return ultima_atualizacao;
    }
    public void setUltimaAtualização(LocalDateTime ultima_atualizacao){
        this.ultima_atualizacao = ultima_atualizacao;
    }
}
