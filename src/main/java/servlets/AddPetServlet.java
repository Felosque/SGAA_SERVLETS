package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.PetsServices;
import sgaa.server.dataStructure.Stack.IStackArray;
import sgaa.server.dto.BreedDTO;

/**
 * Servlet implementation class AddPetServlet
 */
@WebServlet("/AddPetServlet.do")
public class AddPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private PetsServices petServices = new PetsServices();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPetServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IStackArray<BreedDTO> stack =  petServices.getAllBreeds();
		request.setAttribute("breeds", stack);
		request.getRequestDispatcher("/WEB-INF/Views/addpetpage.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String name = request.getParameter("name");
			String color = request.getParameter("color");
			String address = request.getParameter("address");
			String date = request.getParameter("birthdate");
			Date birthdate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
			
			String br = request.getParameter("breed");
			int breed = Integer.parseInt(br);
			String mail = request.getParameter("mail");
			String description = request.getParameter("description");
			boolean res = petServices.addPet(name, color, address, birthdate, true, breed, mail, "", description);
			
			
			if(res)
			{
				//¡Se registra el perro!}
				request.getRequestDispatcher("/WEB-INF/Views/mainpage.jsp").forward(request, response);
			}
			else
			{
				//No se pudo registrar el perro
			}
			
		} catch (ParseException e) {
			//Excepción de traducción de fecha
			e.printStackTrace();
		}
		
	}

}
