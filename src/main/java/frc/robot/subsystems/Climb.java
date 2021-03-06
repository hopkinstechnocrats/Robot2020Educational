/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Climb extends SubsystemBase {
  WPI_TalonSRX motor;
  /**
   * Creates a new Climb.
   */
  public Climb() {
    motor = new WPI_TalonSRX(Constants.CLIMB_MOTOR_CAN_ID);
  }

  public void moveClimb(double speed) {
    motor.set(speed);
  }

  public void periodic(){
  }
   // This method will be called once per scheduler run
}

