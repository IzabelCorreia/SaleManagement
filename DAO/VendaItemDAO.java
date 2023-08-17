package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Dominio.Vendas;

public class VendaItemDAO {

    private final Conexao conect;

    public VendaItemDAO(){
        this.conect = new ConexaoMySQL();
    }

    public void addVenda(Vendas vendas){
        try{
            String sql = "INSERT INTO vendas (total_vendas, troco, desconto, clientesId, usuarioId) VALUES (?,?,?,?,?)";
            PreparedStatement ps = conect.obterConexao().prepareStatement(sql);
            ps.setBigDecimal(1, vendas.getTotalVendas());
            ps.setBigDecimal(2, vendas.getTroco());
            ps.setBigDecimal(3, vendas.getDesconto());
            ps.setInt(4, vendas.getclientesId());
            ps.setLong(5, vendas.getUsuarioId());
        }catch(SQLException e){
            e.printStackTrace();
        }
    }


}
