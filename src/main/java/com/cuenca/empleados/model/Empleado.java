/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cuenca.empleados.model;

/**
 *
 * @author CDE-LAB3-PC28
 */
public class Empleado {
    private int id;
    private int codigo;
    private String nombre;
    private String apellido;
    private String email;
    private double salario;
    public Empleado (int id, int codigo, String nombre, String apellido, String email, double salario){
         this.id = id;
         this.codigo = codigo;
         this.nombre = nombre;
         this.apellido = apellido;
         this.email = email; 
         this.salario=  salario;
    }
    public int getId(){
        return id;
    }
    public void setId(int ident){
        this.id = ident;
    }
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigorecibido){
        this.codigo = codigorecibido;
                
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombreRecibido){
        this.nombre = nombreRecibido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellidoRecibido){
        this.apellido = apellidoRecibido;
    }
     public String getEmail(){
        return email;
    }
    public void setEmail(String emailRecibido){
        this.email = emailRecibido;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario= salario;
    }
            
}
