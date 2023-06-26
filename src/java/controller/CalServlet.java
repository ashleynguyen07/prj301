/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "CalServlet1", urlPatterns = {"/calservlet"})
public class CalServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculator</title>");
            out.println("</head>");
            out.println("<body>");

            String firstStr = request.getParameter("first");
            String secondStr = request.getParameter("second");
            String operator = request.getParameter("operator");

            int result = 0;

            if (firstStr != null && secondStr != null) {
                try {
                    int num1 = Integer.parseInt(firstStr);
                    int num2 = Integer.parseInt(secondStr);
                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                        default:
                            result = 0;
                    }
                } catch (NumberFormatException e) {
                    out.println("<br>");
                    out.println("Invalid input! Please enter valid numbers.");
                    out.println("<br>");
                }
            }

            out.println("<form action=\"calservlet\" method=\"post\">");
            out.println("First: <input type=\"text\" name=\"first\" value=\"" + (firstStr != null ? firstStr : "") + "\"><br>");
            out.println("Second: <input type=\"text\" name=\"second\" value=\"" + (secondStr != null ? secondStr : "") + "\"><br>");
            out.println("Operator: ");
            out.println("<select name=\"operator\">");
            out.println("<option value=\"+\"" + (operator != null && operator.equals("+") ? " selected" : "") + ">+</option>");
            out.println("<option value=\"-\"" + (operator != null && operator.equals("-") ? " selected" : "") + ">-</option>");
            out.println("<option value=\"*\"" + (operator != null && operator.equals("*") ? " selected" : "") + ">*</option>");
            out.println("<option value=\"/\"" + (operator != null && operator.equals("/") ? " selected" : "") + ">/</option>");
            out.println("</select>");
            out.println("</select><br>");
            out.println("<input type=\"submit\" value=\"Compute\">");
            out.println("</form>");

            out.println("Result: <input type=\"text\" name=\"result\" value=\"" + result + "\" disabled");

            out.println("</body>");
            out.println("</html>");

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
