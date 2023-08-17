package DAO;

import Dominio.Usuario;

import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//   usuário é a classe destinada aos funcionários 

public class UsuarioDAO {

    private final Conexao conexao;

    public UsuarioDAO(){
        this.conexao = new ConexaoMySQL();
    }

    public void addUser (Usuario usuario){
        try{
            String sql = "INSERT INTO usuario( nome, usuario, senha, estado) VALUES(?,?,?,?)";
            PreparedStatement ps = conexao.obterConexao().prepareStatement(sql);

            //BCryptPassworsEncode password = new BCryptPassworsEncode();
            //Script passwordHash = password.encode(usuario.getSenha());
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getUsuario());
            ps.setString(3, usuario.getSenha());
            ps.setBoolean(4, usuario.getEstado());
            ps.close();

            System.out.println("Usuário adicionado com sucesso!");
            
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        
    }

    public void saveUser(Usuario usuario){
        
    }

    public void updateDataUser(Usuario usuario) {
        try{
            String sql = "UPDATE usuario SET (nome = ?, usuario = ?, senha = ?, estado = ?)";
            PreparedStatement ps = conexao.obterConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }

    public void deleteUser(){

    }

    /*listar através do ID 

    public List<Usuario> listUser(){
        String sql = "SELECT * FROM usuario";
        List<Usuario> users = new ArrayList<>();
        try{
            ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
            while(result.next()){
                users.add(getUsuario(result));
            }
        }catch(SQLException e){
            System.out.println(String.format("erro: %s", e.getMessage()));
        }
        return users;
    }
    */

}
