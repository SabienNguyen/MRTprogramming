package frc.team0000.robot.MyRobot;

import edu.wpi.first.wpilibj.IterativeRobot;
import frc.team0000.robot.subsystems.*;

public class Robot extends IterativeRobot {

    public static oi OI;

    public static driveTrain DriveTrain;
    @Override
    public void robotInit() {
        RobotMap.init();
        DriveTrain = new driveTrain();
        OI = new oi();

    }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() { }

    @Override
    public void testInit() { }


    @Override
    public void disabledPeriodic() { }
    
    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() { }

    @Override
    public void testPeriodic() { }
}