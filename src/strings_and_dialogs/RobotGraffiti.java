package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot billy=new Robot();
	billy.penDown();
	billy.setSpeed(300);
	billy.move(-200);
	billy.setAngle(180);
	for(int i = 0; i<180;i++){	
	billy.move(1);
	billy.turn(1);
}
	billy.hide();
}
}