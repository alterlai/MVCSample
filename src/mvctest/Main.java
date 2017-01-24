package mvctest;

public class Main {
	public static void main(String[] args)
	{
		Controller controller = new Controller();
		Model model = new Model(controller);
		View view = new View(controller);
		controller.addView(view);
		controller.addModel(model);
	}
}
