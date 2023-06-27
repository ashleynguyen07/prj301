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
import java.util.ArrayList;
import model.Name;
/**
 *
 * @author tramy
 */
@WebServlet(name = "NameListServlet", urlPatterns = {"/NameListServlet"})

public class NameListServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    ArrayList<Name> names = new ArrayList<Name>();
    names.add(new Name("Bao", "Phan"));
    names.add(new Name("My", "Nguyen"));
    names.add(new Name("Tu", "Phan"));
    request.setAttribute("names", names);
    request.getRequestDispatcher("namelist.jsp").forward(request, response);
  }
}

