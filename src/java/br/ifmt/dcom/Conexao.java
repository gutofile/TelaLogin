package br.ifmt.dcom;

import java.sql.Connection;
import java.sql.*;

public class Conexao {

    public static String status = "";

    public static Connection obterConexao() {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            String url = "jdbc:postgresql://localhost:5433/SistemasParaInternet";
            String user = "postgres";
            String pass = "root";

            con = DriverManager.getConnection(url, user, pass);
            status = "Conexão aberta";
        } catch (SQLException e) {
            status = e.getMessage();
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            status = e.getMessage();
            e.printStackTrace();
        } catch (Exception e) {
            status = e.getMessage();
            e.printStackTrace();
        }
        return con;
    }

}
