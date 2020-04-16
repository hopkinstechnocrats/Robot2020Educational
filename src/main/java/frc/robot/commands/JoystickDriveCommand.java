/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Drivetrain;


public class JoystickDriveCommand extends CommandBase {
  private Drivetrain subsystem;
  private XboxController controller;

  public JoystickDriveCommand(Drivetrain subsystem, XboxController controller) {
    this.controller = controller;
    this.subsystem = subsystem;
    addRequirements(subsystem);
  }

  @Override
  public void execute() {
    subsystem.sendDriveSignal(controller.getRawAxis(Constants.DRIVETRAIN_LEFT_AXIS), controller.getRawAxis(Constants.DRIVETRAIN_RIGHT_AXIS));
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
