<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<!DOCTYPE html>

    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Tela de Login</title>
        </head>
        <body>
            <form method="post" action="verificarlogin.jsp">
                <table border="0" align="center">
                    <tr>
                        <td align="right">Login:</td>
                        <td align="left"><input type="text" name="login"></td>
                    </tr>
                    <tr>
                        <td align="right">Senha:</td>
                        <td align="left"><input type="password" name="senha"></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="Entrar"></td>
                    </tr>

                </table>
            </form>
        </body>
    </html>

