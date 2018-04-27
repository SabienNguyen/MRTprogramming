package frc.team0000.robot.MyRobot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class RobotMap {
    public static TalonSRX driveTrainLeftBack;
    public static TalonSRX driveTrainLeftFront;
    public static TalonSRX driveTrainRightFront;
    public static TalonSRX driveTrainRightBack;

    public static void init(){
        driveTrainLeftBack = new TalonSRX(4);

        driveTrainLeftFront = new TalonSRX(3);

        driveTrainRightFront = new TalonSRX(2);

        driveTrainRightBack = new TalonSRX(1);
    }
}
