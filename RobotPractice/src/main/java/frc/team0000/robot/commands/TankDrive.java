package frc.team0000.robot.commands;

import frc.team0000.robot.MyRobot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command{

    public TankDrive() {

        //says we need drivetrain to do this command
        requires(Robot.driveTrain);
    }

    protected void initialize() {
    }

    protected void execute(){
        double leftSpeed = Robot.oi.getLeftJoystickY();
        double rightSpeed = Robot.oi.getRightJoystickX();

        Robot.driveTrain.drive(rightSpeed, leftSpeed);
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
