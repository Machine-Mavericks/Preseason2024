// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  private VictorSP IntakeMotor;

  /** Creates a new Intake. */
  public Intake(VictorSP _IntakeMotor) {
    IntakeMotor = _IntakeMotor;
  }

  public void setMotorOutput(double speed){
    IntakeMotor.set(speed);
  }


}
