/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;


public class Intake extends SubsystemBase
{
    /**
     * Creates a new ExampleSubsystem.
     */
    WPI_TalonSRX motor;
    Solenoid actuator;

    public Intake()
    {
        motor = new WPI_TalonSRX(Constants.INTAKE_MOTOR_CAN_ID);
        actuator = new Solenoid(Constants.INTAKE_SOLENOID_ID);
    }

    public void spinIntake(double speed) {
        motor.set(speed);
    }

    public void toggleIntake() {
        actuator.set(!actuator.get());
    }

    /**
     * Will be called periodically whenever the CommandScheduler runs.
     */
    @Override
    public void periodic()
    {

    }
}
