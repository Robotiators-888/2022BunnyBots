package frc.robot.commands;
import frc.robot.subsystems.Drivetrain;
import java.util.function.Supplier;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveArcade extends CommandBase {
  //creates driveSubsystem object from the DriveSubsystem class/file
  private final Drivetrain drivetrain;
  //creates a lamda expression that lets us grab the true value of objects and not a just static value
  private Supplier<Double> speedLeft, speedRight, speed;

  public DriveArcade(Drivetrain drive, Supplier<Double> L, Supplier<Double> R, Supplier<Double> S){
    this.drivetrain = drive;
    this.speedLeft = L;
    this.speedRight = R;
    this.speed = S;

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
    drivetrain.setMotors(speedLeft.get(), speedRight.get() * -1, speed.get());
    
    //sends the data to the smart dash which can be seen on the driver station
    SmartDashboard.putNumber("Left side speed",speedLeft.get());
    SmartDashboard.putNumber("Right side speed",speedRight.get());
    SmartDashboard.putNumber("speed",speed.get());
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