package com.example.trabalho;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Exercicio4")
public class Exercicio4 extends HttpServlet {
    public Exercicio4(){
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h1>Formulário</h1>");
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");


        if((usuario == "IFG") && (senha == "123")){
            out.println("<h1>Login com sucesso</h1>");
        }else{
            out.println("<h1>Login sem sucesso</h1>");
        }

    }
}
