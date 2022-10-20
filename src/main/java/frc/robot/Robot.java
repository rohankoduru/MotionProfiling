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



public class Robot extends TimedRobot {
  private static final String kDefaultAuto = "Default";
  private static final String kCustomAuto = "My Auto";
  private String m_autoSelected;
  private final SendableChooser<String> m_chooser = new SendableChooser<>();

  Systems intake;
  XboxController controller;
  DoubleSolenoid one;
  Systems system;


  @Override
  public void robotInit() {
    intake = new Systems();
    controller = new XboxController(0);
    one = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 1);
    system = new Systems();
  }


  @Override
  public void robotPeriodic() {}


  @Override
  public void autonomousInit() {
  }


  @Override
  public void autonomousPeriodic() {

  }


  @Override
  public void teleopInit() {

  }



  @Override
  public void teleopPeriodic() {
    if (controller.getAButtonPressed())  {
      if (one.isRevSolenoidDisabled() && one.isFwdSolenoidDisabled()) {
        system.intakeBackwardPress();
      }
    }
    if (controller.getBButtonPressed())  {
      if (one.isFwdSolenoidDisabled() && one.isRevSolenoidDisabled()) {
        system.intakeForwardPress();
      }
    }
  }

  @Override
  public void disabledInit() {}


  @Override
  public void disabledPeriodic() {}


  @Override
  public void testInit() {}


  @Override
  public void testPeriodic() {}
}
