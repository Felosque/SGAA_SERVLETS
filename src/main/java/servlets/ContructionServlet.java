package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.PetsServices;
import sgaa.server.dto.PetDTO;

/**
 * Servlet implementation class SearchPetServlet
 */
@WebServlet("/ConstructionServlet.do")
public class ContructionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private PetsServices petServices = new PetsServices();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContructionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getRequestDispatcher("/WEB-INF/Views/contructionpage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		PetDTO pet = petServices.searchPet( Integer.parseInt(request.getParameter("id")));
		request.getRequestDispatcher("/WEB-INF/Views/contructionpage.jsp").forward(request, response);

		
	}

}
