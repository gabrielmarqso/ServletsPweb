package com.example.trabalho;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Exercicio3")
public class Exercicio3 extends HttpServlet {

    public Exercicio3(){
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</body>");
        out.println("<meta charset=\"ISO-8859-1\">");
        out.println("<title>Exercicio 3</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Exercicio 3 - Tabuada</h1>");
        int numero = Integer.parseInt(request.getParameter("numero"));

        out.println("<table>");
        for(int i = 1; i <= 10; i++){
            out.println("<tr>");
            out.println("<td>" + numero + "</td>");
            out.println("<td> X </td>");
            out.println("<td>" + i + "</td>");
            out.println("<td> = </td>");
            out.println("<td>"+ numero*i +" </td>");
            out.println("</tr>");
        }
        out.println("</table>");



        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
