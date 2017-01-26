package org.usfirst.frc.team1072.robot.subsystems;

import org.usfirst.frc.team1072.robot.commands.ManualDrive;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

    private Talon fr;
    private Talon fl;
    private Talon br;
    private Talon bl;
    
    public Drivetrain(){
    	fr = new Talon(4);
    	fl = new Talon(1);
    	br = new Talon(2);
    	bl = new Talon(3);
    }
    
    public void tankDrive(double right, double left){
    	fr.set(right);
    	fl.set(left);
    	br.set(right);
    	bl.set(left);
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new ManualDrive());
    }
    
}

