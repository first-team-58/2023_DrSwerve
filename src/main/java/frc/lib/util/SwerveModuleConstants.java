package frc.lib.util;

import edu.wpi.first.math.geometry.Rotation2d;

public class SwerveModuleConstants {
  public final int driveMotorID;
  public final int angleMotorID;
  public final int cancoderID;
  public final boolean driveMotorInvert;
  public final boolean angleMotorInvert;
  public final Rotation2d angleOffset;

  /**
   * Swerve Module Constants to be used when creating swerve modules.
   *
   * @param driveMotorID
   * @param angleMotorID
   * @param canCoderID
   * @param driveMotorInvert
   * @param angleMotorInvert
   * @param angleOffset
   */
  public SwerveModuleConstants(
      int driveMotorID,
      int angleMotorID,
      int canCoderID,
      boolean driveMoterInvert,
      boolean angleMotorInvert,
      Rotation2d angleOffset) {
    this.driveMotorID = driveMotorID;
    this.angleMotorID = angleMotorID;
    this.cancoderID = canCoderID;
    this.driveMotorInvert = driveMoterInvert;
    this.angleMotorInvert = angleMotorInvert;
    this.angleOffset = angleOffset;
  }
}
