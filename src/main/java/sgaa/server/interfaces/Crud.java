package sgaa.server.interfaces;

public interface Crud<T>{
	
	public String insert();
	
	public String update();
	
	public String delete();
	
	public String findByAttribute();
	
	public String findById();
	
	public String findAll();

}
