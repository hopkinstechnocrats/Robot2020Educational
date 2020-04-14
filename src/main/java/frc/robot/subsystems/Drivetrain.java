/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Drivetrain extends SubsystemBase{

    DifferentialDrive drive;
    WPI_TalonSRX left;
    WPI_TalonSRX right;

    /**
     * Creates a new Drivetrain.
     */
    public Drivetrain(){
        left = new WPI_TalonSRX(0);
        right = new WPI_TalonSRX(1);
        drive = new DifferentialDrive(left, right);


    }
    public void sendDriveSignal(double left, double right){drive.tankDrive(left, right);}
    
    /**
     * Will be called periodically whenever the CommandScheduler runs.
     */
    @Override
    public void periodic()
    {

    }
}
