package frc.team0000.robot.commands;

import frc.team0000.robot.MyRobot.Robot;
import edu.wpi.first.wpilibj.command.Command;
import frc.team0000.robot.subsystems.driveTrain;

public class tankDrive extends Command{

    public tankDrive() {

        //says we need drivetrain to do this command
        requires(Robot.DriveTrain);
    }

    protected void initialize() {
    }

    protected void execute(){
        double leftSpeed = Robot.OI.getLeftJoystickY();
        double rightSpeed = Robot.OI.getRightJoystickX();

        Robot.DriveTrain.drive(rightSpeed, leftSpeed);
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
