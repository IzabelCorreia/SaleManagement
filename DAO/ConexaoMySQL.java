package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL implements Conexao{

    private final String USUARIO = "root";
    private final String SENHA = "34615207belPP@";
    private final String URL = "C:\\Users\\Izabel\\Documents\\Estudos\\Dados.mwb";
    private Connection conectar;

    public Connection obterConexao() throws SQLException {
        //throw new UnsupportedOperationException("Unimplemented method 'obterConexao'");
        
        if(conectar == null){
            conectar = DriverManager.getConnection(URL, USUARIO, SENHA);
        }
        return conectar;
    }
    
}
