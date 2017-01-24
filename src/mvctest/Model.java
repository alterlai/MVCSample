package mvctest;

public class Model {
	private Controller controller;
	
	public Model(Controller controller)
	{
		this.controller = controller;
	}
	
	public String getMessage()
	{
		return "Hello world!";
	}
}
