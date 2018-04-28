package frc.team0000.robot.MyRobot;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
public class OI {
    public XboxController xboxController;
    public JoystickButton ButtonB;
    public JoystickButton ButtonRB;
    public JoystickButton ButtonLB;

    public OI(){
        xboxController = new XboxController(1);
        ButtonB = new JoystickButton(xboxController, 2);
        ButtonRB = new JoystickButton(xboxController, 6);
        ButtonLB = new JoystickButton(xboxController, 5);
    }
    public double getLeftJoystickY(){
        return xboxController.getY(GenericHID.Hand.kLeft)*0.80;
    }
    public double getRightJoystickX(){
        return xboxController.getX(GenericHID.Hand.kRight)*0.80;
    }
}
