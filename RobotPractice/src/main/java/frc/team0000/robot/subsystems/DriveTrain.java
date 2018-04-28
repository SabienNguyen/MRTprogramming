package frc.team0000.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.team0000.robot.commands.TankDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team0000.robot.MyRobot.RobotMap;

public class DriveTrain extends Subsystem {
    private final TalonSRX leftBack = RobotMap.driveTrainLeftBack;
    private final TalonSRX leftFront = RobotMap.driveTrainLeftFront;
    private final TalonSRX rightFront = RobotMap.driveTrainRightFront;
    private final TalonSRX rightBack = RobotMap.driveTrainRightBack;

    public void initDefaultCommand(){
        setDefaultCommand(new TankDrive());
    }
    public DriveTrain() {
        leftFront.follow(leftBack);
        rightBack.follow(rightFront);
        leftFront.setInverted(true);
        rightFront.setInverted(false);
        leftBack.setInverted(true);
        rightBack.setInverted(false);
    }

    public void drive ( double leftspeed, double rightspeed){// We are setting the speed controllers to speed
        leftBack.set(ControlMode.PercentOutput, -leftspeed);//the leftfront and back are multiplied by -1 because the values are reversed

        rightFront.set(ControlMode.PercentOutput, -rightspeed);
    }
}
