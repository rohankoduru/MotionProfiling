package frc.robot;


import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;


public class Robot extends TimedRobot {

  Intake intake;
  XboxController controller;


  @Override
  public void robotInit() {
    intake = new Intake();
    controller = new XboxController(0);
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
    intake.FalconSpeed();
    if (controller.getAButtonPressed())  {
      intake.intakeBackwardPress();
    }
    if (controller.getBButtonPressed())  {
      intake.intakeForwardPress();
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
