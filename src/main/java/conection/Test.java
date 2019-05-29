package conection;

import sgaa.server.controller.GeneralController;
import sgaa.server.dataStructure.Stack.IStackArray;
import sgaa.server.dto.PetDTO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GeneralController<GeneralController> controller = new GeneralController<GeneralController>();
		
		IStackArray<PetDTO> er =  controller.getPet().findAll("clinicapequeños@gmail.com");
		System.out.println(er.get(0).getColor());
		String pass = controller.getOrganization().findById("clinicapequeños@gmail.com").getPassword();
		System.out.println(pass);
	}

}
