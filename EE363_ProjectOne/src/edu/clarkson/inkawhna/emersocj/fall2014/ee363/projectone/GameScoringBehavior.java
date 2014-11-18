package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import java.util.ArrayList;



/**
 * Interface for scoring behaviors.
 * @author Wizard
 *
 */
public interface GameScoringBehavior {

	/**
	 * Method used select game winner.
	 * @param weaponArray
	 * @return
	 */
	public abstract int selectWinner(ArrayList<Weapon> weaponArray);

}
