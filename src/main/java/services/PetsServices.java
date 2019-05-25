package services;

import java.util.Date;

import sgaa.server.controller.GeneralController;
import sgaa.server.dto.PetDTO;

public class PetsServices {

	private GeneralController<GeneralController> controller = new GeneralController<GeneralController>();
	
	public boolean addPet(String name, String color, String address, Date birthdate, boolean state, int breed, String mail, String pPath, String pDescription)
	{
		boolean res = controller.getPet().insert(-1, name, color, address, birthdate, state, breed, mail, pPath, pDescription);
		return res;
	}
	
	
	public boolean deletePet()
	{
		boolean res = false;
		
		return res;
	}
	
	
	public boolean searchPet()
	{
		boolean res = false;
		
		return res;
	}
	
	
	public boolean editPet()
	{
		boolean res = false;
		
		return res;
	}
	
}
