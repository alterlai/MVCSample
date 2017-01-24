package mvctest;

import javax.swing.*;
import java.awt.*;

public class View {
	private Controller controller;
	private JFrame frame;
	private Container contentPane;
	private JButton button;
	private JLabel label;
	
	public View(Controller controller)
	{
		this.controller = controller;
		makeFrame();
	}
	
	public void makeFrame()
	{
		frame = new JFrame("ImageViewer");
        
        contentPane = frame.getContentPane();
        
        // Specify the layout manager with nice spacing
        contentPane.setLayout(new BorderLayout(6, 6));
        
        button = new JButton("click");
		button.addActionListener(e -> controller.printHello());
		contentPane.add(button, BorderLayout.NORTH);

        label = new JLabel("");
        contentPane.add(label, BorderLayout.SOUTH);
        
        // building is done - arrange the components and show        
        frame.pack();
        
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(d.width/2 - frame.getWidth()/2, d.height/2 - frame.getHeight()/2);
        frame.setVisible(true);
	}
	
	public void print(String message)
	{
		label.setText(message);
	}
}
