package mvctest;

public class Controller {
	private Model model;
	private View view;
	
	
	public void addView(View view)
	{
		this.view = view;
	}
	public void addModel(Model model)
	{
		this.model = model;
	}
	
	public void printHello()
	{
		view.print(model.getMessage());
	}
}
