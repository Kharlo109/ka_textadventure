package SplashScreen;

import javax.swing.JFrame; //Frame
import javax.swing.JLabel; //Adds text to frame
import javax.swing.SwingConstants;

public class SplashScreen {

	JFrame frame;
	
	public SplashScreen() {
		
		initComponent();
		
	}
	
	public void initComponent() {

		frame = new JFrame("Game Name"); //Title on top toolbar. Will change to game name.
		frame.setSize(600,600); //Frame size
		frame.setVisible(true);
		frame.add (new JLabel("Game Name", SwingConstants.CENTER));
	
	}
	
	public static void main(String args[]) {
		
		new SplashScreen();
	}
}