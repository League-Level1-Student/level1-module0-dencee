import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot rob = new Robot();
		
		rob.setPenColor(Color.BLACK);
		rob.setPenWidth(25);
		rob.penDown();
		rob.setSpeed(10);
		rob.move(100);

	}

}
