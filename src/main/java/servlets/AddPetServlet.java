package servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.PetsServices;

/**
 * Servlet implementation class AddPetServlet
 */
@WebServlet("/AddPetServlet.do")
public class AddPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private PetsServices petServices;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/Views/addpetpage.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String color = request.getParameter("color");
		String address = request.getParameter("address");
		String date = request.getParameter("birthdate");
		Date birthdate = new Date(date);
		String br = request.getParameter("breed");
		int breed = Integer.parseInt(br);
		String mail = request.getParameter("mail");
		String description = request.getParameter("description");
		
		
		boolean res = petServices.addPet(name, color, address, birthdate, true, breed, mail, "", description);
		
	}

}
