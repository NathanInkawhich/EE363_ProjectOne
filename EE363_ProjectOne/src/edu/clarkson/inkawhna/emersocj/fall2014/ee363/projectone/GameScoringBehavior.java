package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import java.util.ArrayList;


/**
 * Interface for scoring behaviors.
 * @author Wizard
 *
 */
public abstract class GameScoringBehavior {

	/**
	 * Abstract class used select game winner.
	 * @param mainGameArray
	 * @return
	 */
	public abstract int selectWinner(ArrayList<Weapon> mainGameArray);

}
