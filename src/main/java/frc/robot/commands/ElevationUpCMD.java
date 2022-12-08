// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.



package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.manipulator;




public class ElevationUpCMD extends CommandBase{
    private final manipulator Manipulator;

    // Constructor of the cmd that creates the ability to move elevation up
    public ElevationUpCMD(manipulator Manipulator){
        this.Manipulator = Manipulator;

        addRequirements(Manipulator);
    }
  // Called just before this Command runs the first time
  @Override
  public void initialize() {
    
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  public void execute() {
    Manipulator.elevationUp();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  public void end(boolean interrupted) {
    Manipulator.elevationEnd();
  }
}

