package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.subsystems.Pneumatics;

public class Piston extends CommandBase {
    public final Pneumatics pneumatics;

    public Piston(Subsystem[] pneumatics) {
        this.pneumatics = pneumatics;
        addRequirements(pneumatics);
    }
}
