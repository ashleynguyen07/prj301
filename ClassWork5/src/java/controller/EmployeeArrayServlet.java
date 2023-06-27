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
//import model.Address;
//import model.Employee;
import model.Name;
//import java.util.jar.Attributes.Name;
import model.Address;
import model.Employee;



/**
 *
 * @author tramy
 */
@WebServlet(name = "EmployeeArrayServlet", urlPatterns = {"/EmployeeArrayServlet"})

public class EmployeeArrayServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    Employee[] employees = {new Employee(new Name("My", "Nguyen"), new Address("", "", "12345")),
                            new Employee(new Name("Bao", "Phan"), new Address("", "", "67890")),
                            new Employee(new Name("Hang", "Phan"),new Address("", "", "45678"))};
    request.setAttribute("employees", employees);
    request.getRequestDispatcher("employee_array.jsp").forward(request, response);
  }
}
