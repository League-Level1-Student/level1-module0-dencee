import javax.swing.JOptionPane;

public class EverythingIsAwesome {

	public static void main(String[] args) {
		awesome("What do you like?");
		awesome("What do you 2?");
		awesome("What do you 3?");		
	}

	public static void awesome(String message) {
		String Rosemary = JOptionPane.showInputDialog(message);
		JOptionPane.showMessageDialog(null, Rosemary + " is awesome" );
	}
	

}
