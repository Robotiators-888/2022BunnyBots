package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import frc.robot.Constants;

/**
 * Add your docs here.
 */
public class manipulator extends SubsystemBase {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public WPI_VictorSPX left = new WPI_VictorSPX(Constants.MANIPULATOR_ARM_MOTOR);
  public WPI_VictorSPX right = new WPI_VictorSPX(Constants.MANIPULATOR_LIFT_MOTOR);
  public WPI_VictorSPX elevation = new WPI_VictorSPX(Constants.ELEVATION);
  double elevationSpeed = Constants.ELEVATION_SPEED;
  public WPI_VictorSPX clamp = new WPI_VictorSPX(Constants.CLAMP);
  double clampSpeed = Constants.CLAMP_SPEED;

  MotorControllerGroup leftMotors = null;
  MotorControllerGroup rightMotors = null;

  DifferentialDrive differentialDrive = null;

  public manipulator() {
    leftMotors = new MotorControllerGroup(left);
    rightMotors = new MotorControllerGroup(right);

    differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
  }

  public void arcadeManipulator(double moveSpeed, double rotateSpeed) {
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
  public void elevationUp() {
    elevationSpeed = Constants.CLAMP_SPEED;
    elevation.set(elevationSpeed);
 }

  public void elevationDown() {
    elevationSpeed *= -1;
    elevation.set(elevationSpeed);
  }
  public void elevationEnd() {
    elevationSpeed = 0;
    elevation.set(0.0);
 }

 public void clampClamp(){
   elevationSpeed = Constants.CLAMP_SPEED;
   clamp.set(clampSpeed);
 }

 public void clampOpen(){
   clampSpeed *= -1;
   clamp.set(clampSpeed);
 }
}