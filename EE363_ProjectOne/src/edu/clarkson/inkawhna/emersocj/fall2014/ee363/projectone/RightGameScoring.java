package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;


/**
 * Concreate right game scoring class.
 * @author Cody Emerson
 *
 */
public class RightGameScoring extends GameScoring {

		/**
		 * Constructor
		 */
		RightGameScoring()
		{
			gameScoringBehavior = new RightScoringBehavior();
		}
}

