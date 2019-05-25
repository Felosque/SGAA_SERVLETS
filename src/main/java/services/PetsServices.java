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
	
	
	public boolean deletePet(int id)
	{
		boolean res = controller.getPet().delete(id);
		return res;
	}
	
	
	public PetDTO searchPet(int id)
	{	
		return controller.getPet().findById(id);
	}
	
	
	public boolean editPet(int id, String name, String color, String address, Date birthdate, boolean state, int breed, String mail, String pPath, String pDescription)
	{
		boolean res = controller.getPet().update(id, name, color, address, birthdate, state, breed, mail, pPath, pDescription);
		return res;
	}
	
}
