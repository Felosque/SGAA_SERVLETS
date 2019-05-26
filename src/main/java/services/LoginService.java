package services;

import conection.Conexion;
import sgaa.server.controller.GeneralController;
import sgaa.server.dto.OrganizationDTO;
import sgaa.server.dto.UserDTO;

public class LoginService {

	GeneralController<GeneralController> controller = new GeneralController<GeneralController>();
	
	public boolean isUserValid(String user, String password)
	{
		boolean response = false;
		try {
		OrganizationDTO userDto = controller.getOrganization().findById(user);
		String pass = userDto.getPassword();
		if(userDto != null)
		{
			if(pass.equals(password))
			{
				response = true;
			}
		}
		}catch (Exception e) {
			System.out.println("No hay usuario");
		}
		return response;
	}
	
	
}
