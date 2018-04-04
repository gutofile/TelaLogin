package br.ifmt.dcom;

import java.sql.*;

public class Usuarios {
    public int verificarUsuario(String login, String senha){
    int idusuario = 0;
    String q="";
    q+="select idusuario from usuarios ";
    q+="where login = '"+login+"' and senha ='"+senha+"'";
    Connection con=Conexao.obterConexao();
    try{
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(q);
    if(rs.next()){
        idusuario=rs.getInt("idusuario");
    }
    }catch (SQLException e){
    }return idusuario;
    
    }
    
}
