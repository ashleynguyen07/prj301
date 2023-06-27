/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Name;

/**
 *
 * @author tramy
 */
@WebServlet(name = "NameArrayServlet", urlPatterns = {"/NameArrayServlet"})

public class NameArrayServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Name[] names = {new Name("My", "Nguyen"), new Name("Bao", "Phan"), new Name("Tu", "Nguyen")};
        request.setAttribute("names", names);
        request.getRequestDispatcher("name_array.jsp").forward(request, response);
    }
}

