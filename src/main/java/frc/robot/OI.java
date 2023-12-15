package frc.robot;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class holds configurations for the Operator Interface (so joysticks/controllers)
 */
public class OI {
    
    /** Driver Station ports controllers are attached to */
    private static class Ports {
        /** Left driving joystick */
        private static final int LEFT_STICK = 0;
        /** Right driving joystick */
        private static final int RIGHT_STICK = 1;
        /** Driving controller */
        private static final int DRIVER_CONTROLLER = 2;
        
        /** Operator controller */
        private static final int OPERATOR_CONTROLLER = 3;
    }

    /** Buttons on the driver sticks/controller */
    private static class DriverButtons {
        /** The one great button */
        private static final Button INTAKE = XboxController.Button.kX;
        private static final Button OUTAKE = XboxController.Button.kY;
    }

    /** Buttons on the operator controller */
    private static class OperatorButtons {
        /** Button used as example */
        private static final Button EXAMPLE = XboxController.Button.kA;
    }

    // This contains objects for both joystick and controller driving
    // You will uncomment code below to select the drive type you want

    // The sticks/controllers are kept private so that if we want to switch them later, this is the only place needing changes
    // Use buttons and DoubleSuppliers to expose any inputs you want elsewhere

    /** Joystick used to control left side of drivetrain */
    //private static final Joystick leftJoystick = new Joystick(Ports.LEFT_STICK);
    /** Joystick used to control right side of drivetrain */
    //private static final Joystick rightJoystick = new Joystick(Ports.RIGHT_STICK);
    /** Controller used to control drivetrain */
    private static final XboxController driverController = new XboxController(Ports.DRIVER_CONTROLLER);

    /** Controller used by operator */
    private static final XboxController operatorController = new XboxController(Ports.OPERATOR_CONTROLLER);

    
    public static final JoystickButton exampleButton = new JoystickButton(driverController, OperatorButtons.EXAMPLE.value);
    // driver intake outake buttons
    public static final JoystickButton intakeButton = new JoystickButton(driverController, DriverButtons.INTAKE.value);
    public static final JoystickButton outakeButton = new JoystickButton(driverController, DriverButtons.OUTAKE.value);
    // Suppliers for drive inputs

    /**
     * Callback function used to supply left side drive input
     * A supplier is used so that changing between joystick and controller only changes this function
     */
    public static DoubleSupplier leftDriveSupplier = () -> {
        double raw = 0;
        // TODO: Uncomment control type you prefer
        //raw = leftJoystick.getY();
        raw = driverController.getLeftY();
        return processDriveInput(raw);
    };

    
    /**
     * Callback function used to supply left side drive input
     * A supplier is used so that changing between joystick and controller only changes this function
     */
    public static DoubleSupplier rightDriveSupplier = () -> {
        double raw = 0;
        // TODO: Uncomment control type you prefer
        //raw = rightJoystick.getY();
        raw = driverController.getRightY();
        return processDriveInput(raw);
    };

    /**
     * Function to compute drive values from raw inputs
     * Can be used to apply deadzone, scaling, nonlinearity, etc.
     * @param raw Raw joystick input
     * @return Input to feed to drivetrain
     */
    private static double processDriveInput(double raw){
        // TODO: Configure input processing to suit your liking
        // if(Math.abs(raw) < [DEADZONE]) raw = 0;
        // raw = Math.pow(raw, [EXPONENT]);
        // raw *= [INPUT_SCALING];
        return raw;
    }

}