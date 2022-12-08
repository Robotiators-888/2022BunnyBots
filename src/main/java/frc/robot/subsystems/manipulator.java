package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
//import com.revrobotics.CANSparkMax;
//import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import frc.robot.Constants;

/**
 * Add your docs here.
 */
public class manipulator extends SubsystemBase {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public WPI_VictorSPX turn = new WPI_VictorSPX(Constants.MANIPULATOR_TURN_MOTOR);
  public WPI_VictorSPX lift = new WPI_VictorSPX(Constants.MANIPULATOR_LIFT_MOTOR);
  // public WPI_VictorSPX elevation = new WPI_VictorSPX(Constants.ELEVATION);
/*
  public CANSparkMax left = new CANSparkMax(Constants.MANIPULATOR_ARM_MOTOR, CANSparkMaxLowLevel.MotorType.kBrushed);
  public CANSparkMax right = new CANSparkMax(Constants.MANIPULATOR_LIFT_MOTOR, CANSparkMaxLowLevel.MotorType.kBrushed);
  public CANSparkMax elevation = new CANSparkMax(Constants.ELEVATION, CANSparkMaxLowLevel.MotorType.kBrushed);
*/
  double elevationSpeed = Constants.ELEVATION_SPEED;

  MotorControllerGroup leftMotors = null;
  MotorControllerGroup rightMotors = null;


  public manipulator() {
    leftMotors = new MotorControllerGroup(lift);
    rightMotors = new MotorControllerGroup(turn);

    
  }



  public void DriveInversion(){
    leftMotors.setInverted(false);
    rightMotors.setInverted(false);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setMotors(double liftSpeed, double Speed) {
    turn.set(liftSpeed * Speed);
  }
  public void elevationUp() {
    elevationSpeed = Constants.ELEVATION_SPEED;
    lift.set(elevationSpeed);
 }

  public void elevationDown() {
    elevationSpeed = -Constants.ELEVATION_SPEED;
    lift.set(elevationSpeed);
  }
  public void elevationEnd() {
    elevationSpeed = 0;
    lift.set(0.0);
 }


}
