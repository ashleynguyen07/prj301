/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.StudentModel;

public class StudentServlet extends HttpServlet {

    public StudentServlet(int i, String par, boolean par1, Date date) {
    }
    private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numStudents = Integer.parseInt(request.getParameter("numStudents"));
        List<StudentServlet> students = generateStudents(numStudents);
        request.setAttribute("students", students);
        request.getRequestDispatcher("student.jsp").forward(request, response);
    }

    private List<StudentServlet> generateStudents(int numStudents) {
        List<StudentServlet> students = new ArrayList<>();
        for (int i = 1; i <= numStudents; i++) {
            StudentServlet student = new StudentServlet(i, "Student " + i, i % 2 == 0, new Date());
            students.add(student);
        }
       

        return students;
    }
}
