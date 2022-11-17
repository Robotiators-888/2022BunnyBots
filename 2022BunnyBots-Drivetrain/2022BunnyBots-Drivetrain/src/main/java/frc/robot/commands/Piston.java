
package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Pneumatics;

public class Piston extends CommandBase{
    public final Pneumatics pneumatics;

    public Piston(Pneumatics pneumatics) {
        this.pneumatics = pneumatics;
        addRequirements(this.pneumatics);
    }

    @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    pneumatics.pistonOut();
    
  }
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    pneumatics.pistonIn();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
