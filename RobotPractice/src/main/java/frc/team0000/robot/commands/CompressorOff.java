package frc.team0000.robot.commands;

import frc.team0000.robot.MyRobot.Robot;

public class CompressorOff {
    public CompressorOff(){

    }
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {//makes a bool that senses if 11 on buttonBoard is pressed
        Robot.pneumatics.compressStop();

    }

    // Make this return true when this Command no longer needs to run execute()
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
