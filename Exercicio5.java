package com.example.trabalho;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Exercicio5")
public class Exercicio5 extends HttpServlet {
    public Exercicio5(){

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String prato = request.getParameter("prato");
        String sobremesa = request.getParameter("sobremesa");
        String bebida = request.getParameter("bebida");

        int calorias = 0;

        if(prato == "vegetariano"){
            calorias =+ 180;
        }else if(prato == "peixe"){
            calorias =+ 230;
        }else if(prato == "frango"){
            calorias =+ 250;
        }else if(prato == "carne"){
            calorias =+ 350;
        }

        if(sobremesa == "abacaxi"){
            calorias =+ 75;
        }else if(sobremesa == "sorvete"){
            calorias =+ 110;
        }else if(sobremesa == "mousse"){
            calorias =+ 170;
        }else if(sobremesa == "torta"){
            calorias =+ 200;
        }

        if (bebida == "cha") {
            calorias =+20;
        } else if (bebida == "sucolaranja") {
            calorias =+70;
        } else if(bebida == "refrigerante"){
            calorias =+100;
        }else if(bebida == "sucomelao"){
            calorias =+65;
        }

        out.println("<h1>Quantidade total de calorias: "+calorias +"</h1>");
    }
}
