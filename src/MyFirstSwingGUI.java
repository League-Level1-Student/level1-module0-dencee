/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MyFirstSwingGUI {
	public static void main(String[] args) {
		//1. Create and initialize an object of the JFrame class
		JFrame myFrame = new JFrame("Test Frame");

		//2. Set your JFrame object to be visible
		myFrame.setVisible(true);

		//3. Run your program. Do you see your window? It's probably very small.
		myFrame.setSize(500, 500);
		
		//4. Set the default close operation to JFrame.EXIT_ON_CLOSE
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("A Menu");
		menuBar.add(menu);
		myFrame.setJMenuBar(menuBar);
		

		//5. Create and initialize an object of the JPanel class
		JPanel myPanel1 = new JPanel();
		JPanel myPanel2 = new JPanel();

		//6. Create and initialize an object of the JLabel class
		JLabel myLabel1 = new JLabel("Test Label 1");
		JLabel myLabel2 = new JLabel("Test Label 2");

		//7. Set the text of the JLabel to a lovely greeting.
		myLabel1.setText("This is a lovely greeting");
		myLabel2.setText("Label 2");

		//8. Add the JPanel object to the JFrame
		myFrame.getContentPane().add(myPanel1);
		myFrame.getContentPane().add(myPanel2);

		//9. Add the JLabel object to the JPanel
		myPanel1.add(myLabel1);
		myPanel2.add(myLabel2);

		//10. Pack your JFrame.
		myFrame.pack();

		//11. Run your program again. Do you see your message.
		
		//12. Use the loadImage method to set the icon of the JLabel object.
		myLabel1.setIcon(loadImage());

		//13. Re-pack the JFrame object.
		myFrame.pack();
		
		//14. Run the program one more time. Do you see the image?
	}
	
	public static ImageIcon loadImage(){
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("java.png")));
		} catch (IOException e) {
			
			return null;
		}
	}
}
