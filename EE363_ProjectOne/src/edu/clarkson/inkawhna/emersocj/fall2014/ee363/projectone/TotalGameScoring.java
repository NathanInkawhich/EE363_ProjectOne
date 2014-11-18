package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

/**
 * Concrete Total Game scoring class
 * @author Cody Emerson
 *
 */
public class TotalGameScoring extends GameScoring {

	/**
	 * Constructor
	 */
		TotalGameScoring()
		{
			gameScoringBehavior = new TotalScoringBehavior();
		}
}
