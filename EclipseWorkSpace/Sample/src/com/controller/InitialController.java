package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DBConnection;
import com.pojo.Premium;

/**
 * Servlet implementation class InitialController
 */
@WebServlet("/InitialController")
public class InitialController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitialController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Premium> premiums=null;
		try {
			premiums = DBConnection.select();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		double amount =0.0;
		int year=0;
				
		if (null != request.getParameter("amount") && request.getParameter("amount").equals("") && null != request.getParameter("year")&& request.getParameter("year").equals("")) {
			amount = Double.parseDouble(request.getParameter("amount"));
			year = Integer.parseInt(request.getParameter("year"));
		}

		String selection = request.getParameter("selectBox");
		System.out.println("Selection="+selection);
		int premiumValue = 0;
		for(Premium premium : premiums) {
			if(premium.getPolicy().equals(selection)) {
				premiumValue=premium.getPremium();
			}
		}
		request.setAttribute("premium", premiumValue);
		request.setAttribute("amount", "00");
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
