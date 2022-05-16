package com.example.trabalho;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/exercicio1")
public class exercicio1 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("init(config)");
        super.init();
    }
    public exercicio1(){
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
        out.println("<title>Insert title here</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>Exercicio 1</h1>");

        int anoNascimento = Integer.parseInt(request.getParameter("ano"));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        int anoAtual = Integer.parseInt(dtf.format(LocalDateTime.now()));
        int idadeAnos = anoAtual - anoNascimento;
        int idadeDias = idadeAnos * 365;


        out.println("<p> Voce tem  "+ idadeAnos +" anos de idade, ou seja "+ idadeDias +" dias de idade.</p>");

        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
