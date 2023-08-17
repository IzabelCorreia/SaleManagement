package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Dominio.Categoria;

public class CategoriaDAO {
    private final Conexao conect;

    public CategoriaDAO(){
        this.conect = new ConexaoMySQL();
    }

    public void addCategoria(Categoria categoria){
        try{
            String sql = "INSET INTO categoria(nome, descricao) VALUES (?,?)";
            PreparedStatement ps = conect.obterConexao().prepareStatement(sql);
            ps.setString(1, categoria.getNome());
            ps.setString(2, categoria.getDescricao());
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void updateCategoria(){
        
    }




}
