
//import javax.swing.JOptionPane;


public class FortuneCookie {

	public static void main(String[] args) {
//		new FortuneCookie().getFortune();
		new EverythingIsAwesome(12,55).awesome("Hello");
	}
/*
	public void getFortune() {

		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		
		panel.add(button);
		button.setText("My Button");
//		button.addActionListener(this);
		
		frame.pack();

	}
*/
	/*
	public void showButton() {
		System.out.println("Show button!");
	}
*/
/*
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null, "WooHoo!");
		
		String fortuneMessage="";
		int fortune = new Random().nextInt(4);
		
		if(fortune == 0) {
			fortuneMessage = "1";
		} else if (fortune == 1) {
			fortuneMessage = "2";
		} else if (fortune == 2) {
			fortuneMessage = "3";
		} else if (fortune == 3) {
			fortuneMessage = "4";
		}
		
		System.out.println(fortuneMessage);
	}
*/

}
