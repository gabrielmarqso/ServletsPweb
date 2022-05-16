package com.example.trabalho;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/exercicio2")
public class exercicio2 extends HttpServlet {
    public exercicio2(){
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

        out.println("<h1>Exercicio 2</h1>");



        String nomeTime1 = request.getParameter("nome1");
        String nomeTime2= request.getParameter("nome2");
        int  placar1 = Integer.parseInt(request.getParameter("placar1"));
        int  placar2 = Integer.parseInt(request.getParameter("placar2"));

        if(placar1 > placar2){
            out.println("<p> O time " + nomeTime1 + " ganhou do time " + nomeTime2+"</p>");
        }else if(placar2 > placar1){
            out.println("<p> O time" + nomeTime2 + " ganhou do time " + nomeTime1+"</p>");
        }else{
            out.println("<p>Os times empataram </p>");
        }


        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
