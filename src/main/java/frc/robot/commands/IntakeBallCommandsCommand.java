package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;


public class IntakeBallCommandsCommand extends CommandBase {
    private Intake subsystem;
    private double speed;

    public IntakeBallCommandsCommand(Intake subsystem, double speed) {
        this.speed = speed;
        this.subsystem = subsystem;
        // each subsystem used by the command must be passed into the addRequirements() method (which takes a vararg of Subsystem)
        addRequirements(subsystem);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {subsystem.spinIntake(speed);

    }

    @Override
    public void end(boolean interrupted) {

    }
    @Override
    public boolean isFinished() {
        // TODO: Make this return true when this Command no longer needs to run execute()
        return false;
    }
}
