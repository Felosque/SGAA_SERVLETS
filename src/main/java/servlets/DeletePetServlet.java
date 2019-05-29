package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.PetsServices;
import sgaa.server.dataStructure.Stack.IStackArray;
import sgaa.server.dto.BreedDTO;

/**
 * Servlet implementation class DeletePetServlet
 */
@WebServlet("/DeletePetServlet.do")
public class DeletePetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private PetsServices petServices = new PetsServices();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IStackArray<BreedDTO> stack =  petServices.getAllBreeds();
		request.setAttribute("breeds", stack);
		
		String sr[] = request.getParameter("id").split("-");
		int id = Integer.parseInt(sr[0]);
		
		
		request.getRequestDispatcher("/WEB-INF/Views/deletepage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sr[] = request.getParameter("id").split("-");
		int id = Integer.parseInt(sr[0]);
		boolean respuesta = petServices.deletePet(id);
		
		if(respuesta)
		{
			//Si se elimina la mascota
			request.getRequestDispatcher("/WEB-INF/Views/mainpage.jsp").forward(request, response);
			
		}else
		{
			//Si no se elimina la mascota.
		}
	}

}
