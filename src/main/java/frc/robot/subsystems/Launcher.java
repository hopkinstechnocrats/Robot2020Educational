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

public class Launcher extends SubsystemBase {
  WPI_TalonSRX motor;
  /**
   * Creates a new Launcher.
   */
  public Launcher() {
    motor = new WPI_TalonSRX(Constants.LAUNCHER_MOTOR_CAN_ID);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void spinLauncher(double speed){
    motor.set(speed);
  }
}
