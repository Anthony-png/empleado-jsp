/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cuenca.empleados.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CDE-LAB3-PC28
 */
public class Conexion {
    private Connection jdbcConnection;
    private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
      
    public Conexion(){
        
    }
public Conexion (String url, String userName, String password){
     this.jdbcURL = url;
     this.jdbcUsername = userName;
     this.jdbcPassword = password;
}
  public void conectar() throws SQLException{
      if(jdbcConnection == null || jdbcConnection.isClosed()){
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
      }catch (ClassNotFoundException e){
          throw new SQLException(e);
      }
      jdbcConnection =DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }
  }
  public void desconectar()throws SQLException{
      if(jdbcConnection != null && !jdbcConnection.isClosed() ){
          
      }
  }
  public Connection getJdbcConnection(){
      return jdbcConnection;
  }
}
    
