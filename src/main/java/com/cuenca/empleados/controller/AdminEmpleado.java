/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cuenca.empleados.controller;

import com.cuenca.empleados.dao.EmpleadoDAO;
import com.cuenca.empleados.model.Empleado;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 59598
 */
@WebServlet("/adminEmpleado")
public class AdminEmpleado extends HttpServlet{
    
    EmpleadoDAO empleadoDAO; 
    
    public void init(){
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
        
        try {
            empleadoDAO = new EmpleadoDAO(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException ex) {
            Logger.getLogger(AdminEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public AdminEmpleado(){
        super();
    }
    
    protected void  doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        String action = request.getParameter("action"); 
        
        try{
        switch (action){
            case "index":
                index(request, response);
                break; 
            case "nuevo":
                nuevo(request, response);
                break;
            case "register":
               registrar(request, response);
                break;
        }
        }catch(SQLException e){
            e.printStackTrace();
        }
    
}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        doGet(request, response);
    }
    
    private void index(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
        
    }
    
    private void nuevo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("/vistas/register.jsp");
        dispatcher.forward(request, response); 
    }
    
    private void registrar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException{
        Empleado empl = new Empleado(0, Integer.parseInt(request.getParameter("codigo")),
                request.getParameter("nombre"), request.getParameter("apellido"),
                request.getParameter("email"),
                Double.parseDouble(request.getParameter("salario")));
        empleadoDAO.insertar(empl);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
        
        
    }

