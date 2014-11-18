package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import java.util.ArrayList;
import java.util.Collection;


/**
 * Contains a game scoring behavior used to select a winner of the game.
 * @author Cody Emerson
 *
 */
public abstract class GameScoring {
	
	GameScoringBehavior gameScoringBehavior;
	int winnerTest = 0;
	int setScoring = 0;
	
	
	
	public void setGameScoringBehavior()
	{
		if(setScoring == 1)	gameScoringBehavior = new LeftGameScoring();
		if(setScoring == -1)gameScoringBehavior = new RightGameScoring();
		else gameScoringBehavior = new TotalGameScoring();
		
	}
	/**
	 * Selects the winner of a game decided by the gameScoringBehavior
	 * @param mainGameArray
	 */
	public void selectWinner(ArrayList<Weapon> mainGameArray)
	{
		winnerTest = gameScoringBehavior.selectWinner(mainGameArray);
		
		if(winnerTest ==  1)
			System.out.println("Player one wins!");
		else if(winnerTest == 0)
			System.out.println("Player two wins1!");
		else if(winnerTest == -1)
			System.out.println("Tie1!");
		else
			System.out.println("System error");
		
	}

}
