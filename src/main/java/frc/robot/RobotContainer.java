package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;


/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public final Drivetrain drivetrain = new Drivetrain();
  
  public final Pneumatics pneumatics = new Pneumatics();
  
  DoubleSolenoid m_doubleSolenoid = pneumatics.m_doubleSolenoid;
  Compressor m_Compressor = pneumatics.m_Compressor;

  public Joystick joystick = new Joystick(Constants.DRIVER_CONTROLLER);

  JoystickButton C_aButton = new JoystickButton(joystick, 1);

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    //Piston button
    C_aButton.whileActiveOnce(new Piston(pneumatics));

    drivetrain.setDefaultCommand(new DriveArcade(drivetrain, () -> joystick.getRawAxis(Constants.RIGHT_AXIS),
      () -> joystick.getRawAxis(Constants.LEFT_AXIS), () -> Constants.speed));

    // Set default commands on subsystems
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */

}