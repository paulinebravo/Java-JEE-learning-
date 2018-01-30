package com.mytest.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mytest.beans.Auteur;


@WebServlet("/Test")
public class Test extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String [] titres = {"Des yeux de soie" , " Un peu de soleil dans l'eau froide", " Un certain sourire"};
       request.setAttribute("titres", titres);
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
    }


}
