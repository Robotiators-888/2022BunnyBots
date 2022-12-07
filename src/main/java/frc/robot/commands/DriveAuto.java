package frc.robot.commands;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;

public class DriveAuto extends CommandBase {
  //creates driveSubsystem object from the DriveSubsystem class/file
  private final Drivetrain drivetrain;

  public DriveAuto(Drivetrain drive){
    this.drivetrain = drive;

    addRequirements(drive);
  }
  
  // Called just before this Command runs the first time
  @Override
  public void initialize() {

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  public void execute() {
    //Gets speeds of the left and right sides plus the overall speed
    drivetrain.setMotors(Constants.AUTO_SPEED, Constants.AUTO_SPEED * -1, Constants.AUTO_SPEED);
    
    //sends the data to the smart dash which can be seen on the driver station
    SmartDashboard.putNumber("Left side speed",Constants.AUTO_SPEED);
    SmartDashboard.putNumber("Right side speed",Constants.AUTO_SPEED);
    SmartDashboard.putNumber("speed",Constants.AUTO_SPEED);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drivetrain.setMotors(0, 0, 0);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return false;
  }
}