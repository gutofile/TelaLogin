package br.ifmt.dcom;

public class TesteUsuarios {

    public static void main(String[] args) {

        Usuarios c = new Usuarios();
        String login = "admin";
        String senha = "admin";
        int idusuario = c.verificarUsuario(login, senha);
        System.out.println("idusuario:" + idusuario);
    }
}
