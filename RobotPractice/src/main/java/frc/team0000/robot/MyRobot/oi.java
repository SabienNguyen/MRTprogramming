package frc.team0000.robot.MyRobot;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.team0000.robot.MyRobot.Robot.*;
public class oi {
    public XboxController xboxController;

    public oi(){
        xboxController = new XboxController(1);

    }

    public double getLeftJoystickY(){
        return xboxController.getY(GenericHID.Hand.kLeft)*0.80;
    }
    public double getRightJoystickX(){
        return xboxController.getX(GenericHID.Hand.kRight)*0.80;
    }
}
