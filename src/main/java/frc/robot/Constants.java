/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 * <p>
 * It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants
{
    //Motor CAN IDs
    public static final int DRIVETRAIN_LEFT_CAN_ID = 0;
    public static final int DRIVETRAIN_RIGHT_CAN_ID = 1;
    public static final int LAUNCHER_MOTOR_CAN_ID = 2;
    public static final int INTAKE_MOTOR_CAN_ID = 3;
    public static final int FEED_MOTOR_CAN_ID = 4;

    //Solenoid ID
    public static final int INTAKE_SOLENOID_ID = 0;

    //Driver controller
    public static final int DRIVER_CONTROLLER_PORT = 0;
    public static final int DRIVETRAIN_LEFT_AXIS = 1;
    public static final int DRIVETRAIN_RIGHT_AXIS = 4;

    //Operator controller
    public static final int OPERATOR_CONTROLLER_PORT = 1;
    public static final int DEPLOY_INTAKE_BUTTON_ID = 0; //Toggle whether intake is deployed when button is pressed.
    public static final int SPIN_INTAKE_BUTTON_ID = 1; //Spin intake while the button is held
    public static final int FEED_BALLS_BUTTON_ID = 2; //Spin intake while the button is held
    public static final int SPIN_LAUNCHER_BUTTON_ID = 3; //Spin the launcher while the button is held
    public static final int RAISE_HOOK_BUTTON_ID = 4; //Raise hook while the button is held
    public static final int LOWER_HOOK_BUTTON_ID = 5; //Lower hook while the button is held

    //Motor speeds
    public static final double LAUNCHER_SPEED = 1;
    public static final double INTAKE_SPEED = 1;
    public static final double FEED_SPEED = 1;
    public static final double RAISE_HOOK_SPEED = 1;
    public static final double LOWER_HOOK_SPEED = -1;
}