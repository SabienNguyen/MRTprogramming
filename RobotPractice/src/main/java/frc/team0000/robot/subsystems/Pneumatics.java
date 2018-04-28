package frc.team0000.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team0000.robot.MyRobot.RobotMap;
import frc.team0000.robot.commands.GearShift;

public class Pneumatics extends Subsystem {
    private final DoubleSolenoid solenoidShift = RobotMap.pneumaticsDoubleSolenoid1;
    private final DoubleSolenoid solenoid2 = RobotMap.pneumaticsDoubleSolenoid2;
    private final Compressor compressor1 = RobotMap.pneumaticsCompressor1;

    public void initDefaultCommand(){
        setDefaultCommand(new GearShift());
    }

    public void compressStart(){
        compressor1.setClosedLoopControl(true);
    }//we turned on compressor
    public void compressStop(){
        compressor1.setClosedLoopControl(false);
    }//This turns the compressor off
    public void doubleSolenoid1Forward(){
        solenoidShift.set(DoubleSolenoid.Value.kForward);
    }//Makes solenoid push out
    public void doubleSolenoid1Reverse(){
        solenoidShift.set(DoubleSolenoid.Value.kReverse);
    }//makes solenoid retract
    public void doubleSolenoid1Off(){
        solenoidShift.set(DoubleSolenoid.Value.kOff);
    }//turns off solenoid
}
