package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Dominio.Produto;

public class ProdutoDAO {
    private final Conexao conect;

    public ProdutoDAO(){
        this.conect = new ConexaoMySQL();
    }

    public void addProduto(Produto produto){
        try{
            String sql =  "INSERT INTO produto (nome, descricao, preco, quantidade, categoriaId, usuarioId) VALUE (?,?,?,?,?,?)" ;
            PreparedStatement ps = conect.obterConexao().prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getDescricao());
            ps.setBigDecimal(3, produto.getPreco());
            ps.setInt(4, produto.getQuantidade());
            ps.setInt(5, produto.getCategoriaId());
            ps.setLong(6, produto.getUsuarioId());
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
