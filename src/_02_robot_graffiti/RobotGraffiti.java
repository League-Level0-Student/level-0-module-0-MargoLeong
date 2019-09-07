package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot m = new Robot();
		m.penDown();
		m.setSpeed(100);
		m.move(200);
		m.turn(+140);
		m.move(90);
		m.turn(-90);
		m.move(90);
		m.turn(+130);
		m.penDown();
		m.move(200);
		
	}

}
