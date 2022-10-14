package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Systems extends SubsystemBase {
    private static final String kDefaultAuto = "Default";
    private static final String kCustomAuto = "My Auto";
    private String m_autoSelected;
    private final SendableChooser<String> m_chooser = new SendableChooser<>();


    DoubleSolenoid one;
    XboxController controller;



    public void robotInit() {
        one = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1);
        controller = new XboxController(0);
    }


    public void robotPeriodic() {}


    public void autonomousInit() {
    }


    public void autonomousPeriodic() {

    }


    public void teleopInit() {

    }



    public void teleopPeriodic() {
        if (controller.getBackButtonPressed()) {
            one.set(DoubleSolenoid.Value.kForward);
        }
        if (controller.getBackButtonReleased()) {
            one.set(DoubleSolenoid.Value.kOff);
        }
    }



    public void disabledInit() {}


    public void disabledPeriodic() {}


    public void testInit() {}


    public void testPeriodic() {}
}
