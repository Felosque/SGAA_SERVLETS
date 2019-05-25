package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conection.Conexion;
import services.LoginService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private LoginService loginService = new LoginService();
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("password"));
		
		request.setAttribute("name", request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		if(loginService.isUserValid(request.getParameter("name"), request.getParameter("password"))) {
			
			request.setAttribute("name", request.getParameter("name"));
			request.getRequestDispatcher("/WEB-INF/Views/welcome.jsp").forward(request, response);
		}else
		{
			request.setAttribute("messageError", "Credentials Wrong");
			request.getRequestDispatcher("/WEB-INF/Views/login.jsp").forward(request, response);
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
