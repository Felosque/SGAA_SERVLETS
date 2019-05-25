package conection;

import sgaa.server.controller.GeneralController;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GeneralController<GeneralController> controller = new GeneralController<GeneralController>();
		
		boolean response = false;
		
		String pass = controller.getUser().findById("re").getPassword();
		if(pass.equals("123"))
		{
			response = true;
		}
		
		System.out.println(response);
		
	}

}
