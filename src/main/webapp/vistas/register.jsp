<%-- 
    Document   : register
    Created on : 12 oct. 2022, 19:33:11
    Author     : CDE-LAB3-PC28
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Empleado</title>
    </head>
    <body>
        <h1>Registrar Empleado</h1>
        <<form action="adminEmpleado?action=register" method="post">
            <table border="1" align="center">
                <tr>
                    <td><a href="#">codigo:</a></td>
                    <td><input type="text" name="codigo"/></td>
                </tr>
                
                <tr>
                    <td><a href="#">nombre:</a></td>
                    <td><input type="text" name="nombre"/></td>
                </tr>
                
                <tr>
                    <td><a href="#">apellido:</a></td>
                    <td><input type="text" name="apellido"/></td>
                </tr>
                
                <tr>
                    <td><a href="#">email:</a></td>
                    <td><input type="text" name="email"/></td>
                </tr>
                
                <tr>
                    <td><a href="#">salario:</a></td>
                    <td><input type="text" name="salario"/></td>
                </tr>
            </table>
            <br>
            <table> 
                <tr>
                <td><input type="submit" value="agregar" name="agregar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
