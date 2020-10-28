package MDSC;
import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * RobôMDSC - a robot by (Maurílio David)
 */
public class RobôMDSC extends AdvancedRobot
{
	/**
	 * run: RobôMDSC's default behavior
	 */
	public void run() {
		setBodyColor(Color.white);
		setGunColor(Color.red);
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			/*ahead(300);
			turnRight(90);
			turnGunRight(360);
			turnLeft(90);
			ahead(100);
			turnGunRight(180);
			turnLeft(120);*/
			
			setAhead(200);
			setTurnRight(90);
			setTurnGunRight(360);
			setAhead(300);
			setTurnGunRight(360);
			execute();
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(2);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		fire(2);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		turnRight(90);
	}	
}
