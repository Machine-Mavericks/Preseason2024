// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Intake;

public class IntakeCommand extends CommandBase {
  private Intake _intake;

  /** Creates a new IntakeCommand. */
  public IntakeCommand(Intake intake) {
    // Use addRequirements() here to declare subsystem dependencies.
    _intake = intake;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    _intake.setMotorOutput(1);
    System.out.println("STARTING");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    _intake.setMotorOutput(1);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    _intake.setMotorOutput(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
