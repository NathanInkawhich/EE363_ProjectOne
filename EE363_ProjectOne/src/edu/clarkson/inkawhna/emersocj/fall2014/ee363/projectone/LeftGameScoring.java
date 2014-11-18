package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;


/**
 * Concrete Left handed game only scoring class
 * @author Wizard
 *
 */
public class LeftGameScoring extends GameScoring {

	/**
	 * Constructor
	 */
		LeftGameScoring()
		{
			gameScoringBehavior = new LeftScoringBehavior();
		}
}
