package com.hippocampus.java.web.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hippocampus.fromzdktosgbd.engine.ZSgbdConnexion;

/**
 * Servlet implementation class Login
 */
@WebServlet("/log")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session;
		session = request.getSession(true);
		//session.setAttribute("user", "NotOk");
	//getServletContext().getRequestDispatcher(request.getContextPath()+"/login.jsp").forward(request,response);
		ZSgbdConnexion connexion = ZSgbdConnexion.getInstance();
		
		////must login and pwd true + user has a project (3 conditions)
		boolean verif = connexion.verifAuthentification(request.getParameter("login"),request.getParameter("pwd"));
		
		
		RequestDispatcher rd= null;
		if(verif==true)
		{	
			//rd = getServletContext().getRequestDispatcher("/IndexDashboard.jsp");
			session.setAttribute("user", "Ok");
			session.setAttribute("login",request.getParameter("login"));
			
			Date d = new Date();
			System.out.println("Authenrification Succes for user login ="+request.getParameter("login")+" at :"+d);
			getServletContext().getRequestDispatcher(request.getContextPath()+"/IndexDashboard.jsp").forward(request,response);
			//rd.forward(request, response);
		}
		else
		{
			rd = getServletContext().getRequestDispatcher("/login.jsp");
			session.setAttribute("user", "NotOk");
			Date d = new Date();
			System.out.println("Authenrification Failure for user login ="+request.getParameter("login")+" at :"+d);
			rd.forward(request, response);
		}
	}

}
