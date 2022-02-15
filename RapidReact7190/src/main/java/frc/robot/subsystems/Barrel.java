package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.BarrelConstants;

public class Barrel extends SubsystemBase {
    
    private Spark motor = new Spark(BarrelConstants.CONTROLLER);


    public void run() {
        motor.set(BarrelConstants.SPEED);
    }

    public void stop() {
        motor.set(0.0);
    }

}
