package br.com.ada.americanas.cadastrocliente;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadatroCliente", value = "/cadastrar")
public class CadatroCliente extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");

        PrintWriter out = response.getWriter();
        out.println("<html><body>O cliente: " + nome + " e CPF: " + cpf + " foi cadastrado com sucesso </body></html>");

    }
}
