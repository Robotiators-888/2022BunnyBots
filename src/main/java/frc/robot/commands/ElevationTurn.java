package frc.robot.commands;
import frc.robot.subsystems.manipulator;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ElevationTurn extends CommandBase {
  //creates driveSubsystem object from the DriveSubsystem class/file
  private final manipulator manipulator;
  //creates a lamda expression that lets us grab the true value of objects and not a just static value
  private Supplier<Double> speedLeft, speed;

  public ElevationTurn(manipulator manipulator, Supplier<Double> L, Supplier<Double> S){
    this.manipulator = manipulator;
    this.speedLeft = L;
    this.speed = S;

    addRequirements(manipulator);
  }
  
  // Called just before this Command runs the first time
  @Override
  public void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  public void execute() {
    //Gets speeds of the left and right sides plus the overall speed
    SmartDashboard.putNumber("Left side manipulator speed: ", speedLeft.get());
    SmartDashboard.putNumber("Speed: ", speed.get());

    manipulator.setMotors(speedLeft.get(), speed.get());
    
    //sends the data to the smart dash which can be seen on the driver station

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return false;
  }
}