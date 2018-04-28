package frc.team0000.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team0000.robot.MyRobot.RobotMap;


public class Elevator extends Subsystem {
    private final Spark ElevatorSpark1 = RobotMap.ElevatorSpark1;
    private final Spark ElevatorSpark2 = RobotMap.ElevatorSpark2;
    public Elevator(){

    }

    public void initDefaultCommand(){
    }

    public void move(double speed){

        ElevatorSpark2.set(speed);
        ElevatorSpark1.set(speed);
    }
    public void lift(){
        ElevatorSpark2.set(.6);
        ElevatorSpark1.set(.6);
    }
    public void lower(){
        ElevatorSpark2.set(-.2);
        ElevatorSpark1.set(-.2);
    }
    public void eleStop(){
        ElevatorSpark2.set(.225);
        ElevatorSpark1.set(.225);
    }

}
