package com.afis;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Laptop extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String laptopBrand=req.getParameter("brand");
		///String laptopBrand="Dell";
		req.setAttribute("laptopAlias", laptopBrand);
		String paritate = null;
		int caracters=0;
		 if (laptopBrand != null) {
            caracters = laptopBrand.length();
            if(caracters%2==0) {
            	paritate="par";
            }
            else {
            	paritate="impar";
            }
        }
		 
		req.setAttribute("result", caracters);
		req.setAttribute("paritate", paritate);
		
		
		req.getRequestDispatcher("Afisare.jsp").forward(req,res);
		
		}

}
