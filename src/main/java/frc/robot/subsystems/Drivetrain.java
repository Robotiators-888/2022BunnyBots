package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import frc.robot.Constants;

/**
 * Add your docs here.
 */
public class Drivetrain extends SubsystemBase {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public WPI_VictorSPX leftPrimary = new WPI_VictorSPX(Constants.DRIVETRAIN_LEFT_FRONT_MOTOR);
  public WPI_VictorSPX leftSecondary = new WPI_VictorSPX(Constants.DRIVETRAIN_LEFT_BACK_MOTOR);
  public WPI_VictorSPX rightPrimary = new WPI_VictorSPX(Constants.DRIVETRAIN_RIGHT_FRONT_MOTOR);
  public WPI_VictorSPX rightSecondary = new WPI_VictorSPX(Constants.DRIVETRAIN_RIGHT_BACK_MOTOR);

  MotorControllerGroup leftMotors = null;
  MotorControllerGroup rightMotors = null;

  DifferentialDrive differentialDrive = null;

  public Drivetrain() {
    leftMotors = new MotorControllerGroup(leftPrimary, leftSecondary);
    rightMotors = new MotorControllerGroup(rightPrimary, rightSecondary);

    differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
  }

  public void arcadeDrive(double moveSpeed, double rotateSpeed) {
    differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
  }

  public void DriveInversion(){
    leftMotors.setInverted(false);
    rightMotors.setInverted(false);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void setMotors(double leftSpeed, double rightSpeed, double Speed) {
    differentialDrive.arcadeDrive(leftSpeed * Speed, rightSpeed * Speed);
  }
}