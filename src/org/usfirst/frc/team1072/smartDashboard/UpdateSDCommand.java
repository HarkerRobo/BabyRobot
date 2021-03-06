package org.usfirst.frc.team1072.smartDashboard;

import org.usfirst.frc.team1072.robot.Robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * @author Ashwin Reddy
 */
public class UpdateSDCommand extends Command {
	private SmartDashboard sd;


    public UpdateSDCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	sd = new SmartDashboard();
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.dt.toSmartDashboard();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
