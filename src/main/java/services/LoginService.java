package services;

import conection.Conexion;
import sgaa.server.controller.GeneralController;
import sgaa.server.dto.UserDTO;

public class LoginService {

	GeneralController<GeneralController> controller = new GeneralController<GeneralController>();
	
	public boolean isUserValid(String user, String password)
	{
		boolean response = false;
		try {
		UserDTO userDto = controller.getUser().findById(user);
		String pass = userDto.getPassword();
		if(userDto != null)
		{
			if(pass.equals(password))
			{
				response = true;
			}else
			{
				System.out.println("Sí");
			}
		}
		}catch (Exception e) {
			System.out.println("No hay usuario");
		}
		return response;
	}
	
	
}
