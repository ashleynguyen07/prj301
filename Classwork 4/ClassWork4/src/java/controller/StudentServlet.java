/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

/**
 *
 * @author tramy
 */
@WebServlet(name = "StudentServlet", urlPatterns = {"/StudentServlet"})
public class StudentServlet extends HttpServlet {
  
  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    
    String action = request.getPathInfo();
    
    if (action == null) {
      // Display student list
      try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Student", "sa", "someThingComplicated1234");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
        request.setAttribute("students", rs);
        request.getRequestDispatcher("/studentList.jsp").forward(request, response);
        rs.close();
        stmt.close();
        con.close();
      } catch (Exception e) {
        throw new ServletException(e);
      }
    } else if ("/create".equals(action)) {
      // Display create student form
      request.getRequestDispatcher("/createStudent.jsp").forward(request, response);
    } else if ("/update".equals(action)) {
      // Display update student form
      int id = Integer.parseInt(request.getParameter("id"));
      try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Student", "sa", "someThingComplicated1234");
        PreparedStatement ps = con.prepareStatement("SELECT * FROM Student WHERE Id=?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        request.setAttribute("student", rs);
        request.getRequestDispatcher("/updateStudent.jsp").forward(request, response);
        rs.close();
        ps.close();
        con.close();
      } catch (Exception e) {
        throw new ServletException(e);
      }
    } else if ("/delete".equals(action)) {
      // Delete student
      int id = Integer.parseInt(request.getParameter("id"));
      try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Student", "sa", "someThingComplicated1234");
        PreparedStatement ps = con.prepareStatement("DELETE FROM Student WHERE Id=?");
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        con.close();
        response.sendRedirect(request.getContextPath() + "/student");
      } catch (Exception e) {
        throw new ServletException(e);
      }
    }
    
  }
  
  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    
    String action = request.getPathInfo();
    
    if ("/create".equals(action)) {
      // Create new student
      String name = request.getParameter("name");
      String gender = request.getParameter("gender");
      Date dob = Date.valueOf(request.getParameter("dob"));
      try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Student", "sa", "someThingComplicated1234");
        PreparedStatement ps = con.prepareStatement("INSERT INTO Student (FullName, Gender, DOB) VALUES (?, ?, ?)");
        ps.setString(1, name);
        ps.setString(2, gender);
        ps.setDate(3, dob);
        ps.executeUpdate();
        ps.close();
        con.close();
        response.sendRedirect(request.getContextPath() + "/student");
      } catch (Exception e) {
        throw new ServletException(e);
      }
    } else if ("/update".equals(action)) {
      // Update student
      int id = Integer.parseInt(request.getParameter("id"));
      String name = request.getParameter("name");
      String gender = request.getParameter("gender");
      Date dob = Date.valueOf(request.getParameter("dob"));
      try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Student", "sa", "someThingComplicated1234");
        PreparedStatement ps = con.prepareStatement("UPDATE Student SET FullName=?, Gender=?, DOB=? WHERE Id=?");
        ps.setString(1, name);
        ps.setString(2, gender);
        ps.setDate(3, dob);
        ps.setInt(4, id);
        ps.executeUpdate();
        ps.close();
        con.close();
        response.sendRedirect(request.getContextPath() + "/student");
      } catch (Exception e) {
        throw new ServletException(e);
      }
    }
    
  }
  
}



