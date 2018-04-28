package frc.team0000.robot.MyRobot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RobotMap {
    public static TalonSRX driveTrainLeftBack;
    public static TalonSRX driveTrainLeftFront;
    public static TalonSRX driveTrainRightFront;
    public static TalonSRX driveTrainRightBack;
    public static DoubleSolenoid pneumaticsDoubleSolenoid1;
    public static DoubleSolenoid pneumaticsDoubleSolenoid2;
    public static Compressor pneumaticsCompressor1;
    public static Spark ElevatorSpark1;
    public static Spark ElevatorSpark2;

    public static void init(){
        driveTrainLeftBack = new TalonSRX(4);

        driveTrainLeftFront = new TalonSRX(3);

        driveTrainRightFront = new TalonSRX(2);

        driveTrainRightBack = new TalonSRX(1);

        pneumaticsDoubleSolenoid1 = new DoubleSolenoid(1, 4, 5);
        LiveWindow.add(pneumaticsDoubleSolenoid1);

        pneumaticsDoubleSolenoid2 = new DoubleSolenoid(1, 6, 7);
        LiveWindow.add(pneumaticsDoubleSolenoid2);

        ElevatorSpark1 = new Spark(4);
        LiveWindow.add(ElevatorSpark1);

        ElevatorSpark2 = new Spark(5);
        LiveWindow.add(ElevatorSpark2);

        pneumaticsCompressor1 = new Compressor(1);
    }
}
