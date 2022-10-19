/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cuenca.empleados.dao;

import com.cuenca.empleados.model.Conexion;
import com.cuenca.empleados.model.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author CDE-LAB3-PC1
 */
public class EmpleadoDAO {
    private Conexion con;
    private Connection connection;
    
    
    public EmpleadoDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException{
    con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
    
}
    public boolean insertar(Empleado empl) throws SQLException{
        String sql = "INSERT INTO empleados(id, codigo, nombre,apellido, email, salario)VALUES(?,?,?,?,?,?)";
        con.conectar();
        connection = con.getJdbcConnection();
        
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, null);
        ps.setInt(2, empl.getCodigo());
        ps.setString(3, empl.getNombre());
        ps.setString(4, empl.getApellido());
        ps.setString(5, empl.getEmail());
        ps.setDouble(6, empl.getSalario());
        
        
        boolean filaInsertada = ps.executeUpdate() > 0;
        ps.close();
        con.desconectar();
        return filaInsertada;
        
        
        
        
  }  
} 

