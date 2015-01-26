package com.lysenko.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lysenko.model.ChampionsModel;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result = request.getParameter("country");
		ChampionsModel chM = new ChampionsModel();
		String champion = chM.getChampion(result);
		
		// setting attributes for jsp
		request.setAttribute("country", result);
	    request.setAttribute("champion", champion);
	    RequestDispatcher view = request.getRequestDispatcher("response.jsp");
	    view.forward(request, response); 
	}

}
