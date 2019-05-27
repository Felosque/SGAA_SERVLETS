package servlets;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.PetsServices;
import sgaa.server.dataStructure.Stack.IStackArray;
import sgaa.server.dto.PetDTO;

/**
 * Servlet implementation class MainPageServlet
 */
@WebServlet("/MainPageServlet.do")
public class MainPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private PetsServices petServices = new PetsServices();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mail = request.getParameter("mail");
		System.out.println(mail);
		String[] pets = new String[8];
		java.util.List<PetDTO> stack =  petServices.getAllPets(mail).toArray();
		System.out.println("----------------"+stack.get(0).toString());
		
		request.setAttribute("pets", stack);
		request.getRequestDispatcher("/WEB-INF/Views/mainpage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		
	}

}
