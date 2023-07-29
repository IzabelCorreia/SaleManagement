package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Dominio.Usuario;

public class UsuarioDAO {

    private final Conexao conexao;

    public UsuarioDAO(){
        this.conexao = new ConexaoMySQL();
    }

    public void inserir (Usuario usuario){
        try{
            String sql = "INSERT INTO usuario(id, nome, usuario, senha, estado) VALUES(?,?,?,?,?)";
            PreparedStatement ps = conexao.obterConexao().prepareStatement(sql);
            ps.setLong(1, usuario.getId());
            ps.setString(2, usuario.getNome());
            ps.setString(3, usuario.getUsuario());
            ps.setString(4, usuario.getSenha());
            ps.setBoolean(5, usuario.getEstado());
            
            ps.close();
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        
    }
    // obter dados por ID
    // obter dados por critério
    // total de registro
    // listar 
    // remover 
    // atualizar 
    public void atualizarDados(Usuario usuario) {
        try{
            String sql = "UPDATE usuario SET (nome = ?, usuario = ?, senha = ?, estado = ?)";
            PreparedStatement ps = conexao.obterConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
}
