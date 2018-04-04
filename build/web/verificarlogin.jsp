<%@page import="br.ifmt.dcom.Usuarios"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<!DOCTYPE HTML>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>JSP PAGE</title>
    </head>
    <body>
        <%
            Usuarios c = new Usuarios();
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            int idusuario = c.verificarUsuario(login, senha);
            if (idusuario > 0) {
                out.println("Login correto. idusuario: " + idusuario);
            } else {
                out.println("Login incorreto");
            }
        %>
    </body>
</html>

