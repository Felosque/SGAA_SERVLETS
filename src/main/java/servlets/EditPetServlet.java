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
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet.do")
public class EditPetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private PetsServices petServices = new PetsServices();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditPetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IStackArray<BreedDTO> stack =  petServices.getAllBreeds();
		request.setAttribute("breeds", stack);
		
		String mail = request.getParameter("mail");
		
		request.getRequestDispatcher("/WEB-INF/Views/editpetpage.jsp").forward(request, response);
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
			System.out.println(date);
			Date birthdate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
			
			String ids = request.getParameter("breed");
			int id = Integer.parseInt(ids);
			
			String br = request.getParameter("breed");
			
			int breed = Integer.parseInt(br);
			String mail = request.getParameter("mail");
			String description = request.getParameter("description");
			
			boolean res = petServices.editPet(id, name, color, address, birthdate, true, breed, mail, "", description);
			
			
			if(res)
			{
				//¡Se edita la mascota
				request.getRequestDispatcher("/WEB-INF/Views/mainpage.jsp").forward(request, response);
			}
			else
			{
				//No se pudo registrar la mascota
			}
			
		} catch (ParseException e) {
			//Excepción de traducción de fecha
			e.printStackTrace();
		}
		
	}

	
	
	
	
	
	
	
}
