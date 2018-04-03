import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
 public static void main(String[] args) {

Robot bob = new Robot();
bob.miniaturize();
bob.setSpeed(20);
bob.turn(-90);
bob.penDown();
bob.setPenWidth(25);
bob.setPenColor(66, 24, 204);
bob.move(90);
bob.turn(90);
bob.move(125);
bob.turn(90);
bob.move(90);

} 

}
