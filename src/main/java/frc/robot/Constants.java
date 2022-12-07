// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public class Constants {
  // MOTORs
  public static final int DRIVETRAIN_LEFT_FRONT_MOTOR = 22;
  public static final int DRIVETRAIN_LEFT_BACK_MOTOR = 23;
  public static final int DRIVETRAIN_RIGHT_FRONT_MOTOR = 20;
  public static final int DRIVETRAIN_RIGHT_BACK_MOTOR = 21;

  public static final Double speed = 1.0;
  // Joysticks
  public static final int JOYSTICK_PORT = 0;  
  public static final int DRIVER_CONTROLLER = 0;
        
  //This tells us which part of the joystick will be used
  // 1 = to the left stick's y axis
  public static final int RIGHT_AXIS = 4; 
  // 5 = to the right stick's y axis 
  public static final int LEFT_AXIS = 1;  
  // 1 = the a button on joystick
  public static final int A_BUTTON = 1;
  // 2 = the b button on joystick
  public static final int B_BUTTON = 2;
  // 5 = the up on the d pad
  public static final int DAPD_UP = 5;
  // 6 = down on the d pad
  public static final int DAPD_DOWN = 6;
// Change for your controller

//Auto
public static final double AUTO_SPEED = 0.2; 
public static final double AUTO_TIME_SECS = 5;
}
