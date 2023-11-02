package com.afis;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Convertor extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    String valutaRon = req.getParameter("ron");
	    String valutaEur = req.getParameter("eur");

	            int ron = Integer.parseInt(valutaRon);
	            int eur = Integer.parseInt(valutaEur);

	            int sum = (ron / 5 + eur);
	            req.setAttribute("rezultat", sum);
	       

	    req.getRequestDispatcher("Afisare.jsp").forward(req, res);
	    }
	}
	


