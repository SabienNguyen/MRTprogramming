package frc.team0000.robot.MyRobot;

import edu.wpi.first.wpilibj.IterativeRobot;
import frc.team0000.robot.subsystems.*;

public class Robot extends IterativeRobot {

    public static OI oi;

    public static DriveTrain driveTrain;
    public static Pneumatics pneumatics;
    public static Elevator elevator;
    public void robotInit() {
        RobotMap.init();
        driveTrain = new DriveTrain();
        elevator = new Elevator();
        pneumatics = new Pneumatics();
        oi = new OI();

    }

    public void disabledInit() { }

    public void autonomousInit() { }

    public void teleopInit() { }

    public void testInit() { }

    public void disabledPeriodic() { }
    
    public void autonomousPeriodic() { }

    public void teleopPeriodic() { }

    public void testPeriodic() { }
}