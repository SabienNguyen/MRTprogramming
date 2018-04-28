package frc.team0000.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.command.Command;
import frc.team0000.robot.MyRobot.Robot;

public class GearShift extends Command {
    boolean changeStatus = true;
    boolean toggle = true;
    public GearShift(){
        requires(Robot.pneumatics);

    }
    protected void initialize() {
    }

    protected void execute(){
        boolean isPressedTurnedOn = Robot.oi.xboxController.getTriggerAxis(GenericHID.Hand.kLeft) > 0.1;
        if(isPressedTurnedOn && toggle){
            toggle = false;
            changeStatus = !changeStatus;
        }else if (!isPressedTurnedOn){
            toggle = true;
        }
        if(!changeStatus){
            Robot.pneumatics.doubleSolenoid1Forward();
        }else{
            Robot.pneumatics.doubleSolenoid1Reverse();
        }

    }

    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
