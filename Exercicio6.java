package com.example.trabalho;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Exercicio6")
public class Exercicio6 extends HttpServlet {
    public Exercicio6(){
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</body>");
        out.println("<meta charset=\"ISO-8859-1\">");
        out.println("<title>Exercicio 6</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Exercicio 6</h1>");

        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String endereco = request.getParameter("endereco");
        String cidade = request.getParameter("cidade");

        out.println("<ul>");
        out.println("<li>Nome: " + nome + "</li>");
        out.println("<li>Sobrenome: " + sobrenome + "</li>");
        out.println("<li>Endereço: " + endereco + "</li>");
        out.println("<li>Cidade: " + cidade + "</li>");

        String[] lista = request.getParameterValues("categoria");


        out.println("<li>Categorias preferidas:</li>");
        out.println("<ul>");
        for (String item : lista) {
            out.println("<li>" + item + "</li>");
        }
        out.println("</ul>");

        out.println("</ul>");

        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
