package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

/**
 * Tests the decorator and strategy pattern class implementations. The decorators are
 * tested for logic and functionality and the Scoring method is tested for logic as well.
 * @author Cody Emerson
 *
 */
public class DecoratorTestCases {


	@Test
	/**
	 * Test that all the decorators are functioning.
	 * @return 
	 */
	public void AllDecoratorsTest() {
		final String TOTALDECORATEDATTACK = "Infested Radioactive Poisonous Lizard Spock Scissors Paper Rock Left Handed Weapon";
		
		Weapon weapon = new LeftHandWeapon();
		weapon = new Rock(weapon);
		weapon = new Paper(weapon);	
		weapon = new Scissors(weapon);
		weapon = new Spock(weapon);
		weapon = new Lizard(weapon);
		weapon = new Poisonous(weapon);
		weapon = new Radioactive(weapon);
		weapon = new Infested(weapon);

		assertEquals("All weapon decorators functioning",weapon.attack(),TOTALDECORATEDATTACK);
		//(weapon.attack(),TOTALDECORATEDATTACK,
	}
	

	/**
	 * Tests that the logic is functioning for all left hand decorator functions.
	 * @return
	 */
	@Test
	public void LeftLogicTest()
	{
		int i = 1;
				
		Weapon weapon1 = new Radioactive(new LeftHandWeapon());
		Weapon weapon2 = new Poisonous(new LeftHandWeapon());
		Weapon weapon3 = new Infested(new LeftHandWeapon());
		
		GameScoring gameScoring = new GameScoring();
		gameScoring.setScoringBehavior(1);
		
		// Radioactive : Radioactive
		ArrayList<Weapon> weaponArray = new ArrayList<Weapon>();
		
		weaponArray.add(weapon1);
		weaponArray.add(weapon1);
		
		int test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		int j = -1;
		assertEquals("Logic  functioning",j,test);
		
		// Poisonous : Poisonous
		
		weaponArray.add(weapon2);
		weaponArray.add(weapon2);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		j = -1;
		assertEquals("Logic  functioning",j,test);
		
		// Radioactive : Radioactive
		
		weaponArray.add(weapon3);
		weaponArray.add(weapon3);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		j = -1;
		assertEquals("Logic  functioning",j,test);
		// Radioactive : Poisonous


		
		weaponArray.add(weapon1);
		weaponArray.add(weapon2);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		
		// Radioactive : Infected
		
		weaponArray.add(weapon1);
		weaponArray.add(weapon3);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		i = 0;
		assertEquals("Logic  functioning",i,test);
		
		// Poisonous : Infected
		
		weaponArray.add(weapon2);
		weaponArray.add(weapon3);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		i = 1;
		assertEquals("Logic  functioning",i,test);	
	}
	
	/**
	 * That that all logic for the right hand weapon decorator types are functioning properly.
	 * @return
	 */
	@Test
	public void RightLogicTest()
	{
		Weapon weapon1 = new Rock(new RightHandWeapon());
		Weapon weapon2 = new Paper(new RightHandWeapon());
		Weapon weapon3 = new Scissors(new RightHandWeapon());
		Weapon weapon4 = new Spock(new RightHandWeapon());
		Weapon weapon5 = new Lizard(new RightHandWeapon());
		
		int test = 0;
		int i = -1;
		
		GameScoring gameScoring = new GameScoring();
		gameScoring.setScoringBehavior(-1);		
		ArrayList<Weapon> weaponArray = new ArrayList<Weapon>();
		
		
		// Rock : Rock
		weaponArray.add(weapon1);
		weaponArray.add(weapon1);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Paper : Paper
		weaponArray.add(weapon2);
		weaponArray.add(weapon2);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Scissors : Scissors
		weaponArray.add(weapon3);
		weaponArray.add(weapon3);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Spock: Spock
		weaponArray.add(weapon4);
		weaponArray.add(weapon4);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Lizard : Lizard
		weaponArray.add(weapon4);
		weaponArray.add(weapon4);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);	
		
		
		// Rock : Paper
		weaponArray.add(weapon1);
		weaponArray.add(weapon2);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		i = 0;
		assertEquals("Logic  functioning",i,test);
		
		// Rock : Scissors
		weaponArray.add(weapon1);
		weaponArray.add(weapon3);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		i = 1;
		assertEquals("Logic  functioning",i,test);
		
		// Rock : Spock
		weaponArray.add(weapon1);
		weaponArray.add(weapon4);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		i = 0;
		assertEquals("Logic  functioning",i,test);
		
		// Rock : Lizard
		weaponArray.add(weapon1);
		weaponArray.add(weapon5);
		i = 1;
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Paper : Scissors
		weaponArray.add(weapon2);
		weaponArray.add(weapon3);
		i = 0;
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Paper : Spock
		weaponArray.add(weapon2);
		weaponArray.add(weapon4);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		i = 1;
		assertEquals("Logic  functioning",i,test);
		
		// Paper : Lizard
		weaponArray.add(weapon2);
		weaponArray.add(weapon5);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		i = 0;
		assertEquals("Logic  functioning",i,test);
		
		// Scissors : Spock
		weaponArray.add(weapon3);
		weaponArray.add(weapon4);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		i = 0;
		assertEquals("Logic  functioning",i,test);
		
		// Scissors : Lizard
		weaponArray.add(weapon3);
		weaponArray.add(weapon5);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		i = 1;
		assertEquals("Logic  functioning",i,test);
		
		// Spock : Lizard
		weaponArray.add(weapon4);
		weaponArray.add(weapon5);
		
		i = 0;
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
	}
	
	/**
	 * Tests that the total game method outputs a tie in all cases that the game is a tie.
	 * @ return
	 */
	@Test
	public void TotalTieLogicTest()
	{
		Weapon weapon1 = new Rock(new RightHandWeapon());
		Weapon weapon2 = new Paper(new RightHandWeapon());
		Weapon weapon3 = new Scissors(new RightHandWeapon());
		Weapon weapon4 = new Spock(new RightHandWeapon());
		Weapon weapon5 = new Lizard(new RightHandWeapon());
		Weapon weapon6 = new Radioactive(new LeftHandWeapon());
		Weapon weapon7 = new Poisonous(new LeftHandWeapon());
		Weapon weapon8 = new Infested(new LeftHandWeapon());
				
		int test = 0;
		int i = -1;
		
		GameScoring gameScoring = new GameScoring();
		gameScoring.setScoringBehavior(0);		
		ArrayList<Weapon> weaponArray = new ArrayList<Weapon>();
		
		
		// Rock : Rock : RadioActive : RadioActive
		
		weaponArray.add(weapon1);
		weaponArray.add(weapon1);
		weaponArray.add(weapon6);
		weaponArray.add(weapon6);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Rock : Rock : Poisonous : Poisonous
		
		weaponArray.add(weapon1);
		weaponArray.add(weapon1);
		weaponArray.add(weapon7);
		weaponArray.add(weapon7);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Rock : Rock : Infested : Infested
		
		weaponArray.add(weapon1);
		weaponArray.add(weapon1);
		weaponArray.add(weapon8);
		weaponArray.add(weapon8);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Paper : Paper : RadioActive : RadioActive
		
		weaponArray.add(weapon2);
		weaponArray.add(weapon2);
		weaponArray.add(weapon6);
		weaponArray.add(weapon6);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Paper : Paper : Poisonous : Poisonous
		
		weaponArray.add(weapon2);
		weaponArray.add(weapon2);
		weaponArray.add(weapon7);
		weaponArray.add(weapon7);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Paper : Paper : Infested : Infested
		
		weaponArray.add(weapon2);
		weaponArray.add(weapon2);
		weaponArray.add(weapon8);
		weaponArray.add(weapon8);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Scissors : Scissors : RadioActive : RadioActive
		
		weaponArray.add(weapon3);
		weaponArray.add(weapon3);
		weaponArray.add(weapon6);
		weaponArray.add(weapon6);
	
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Scissors : Scissors : Poisonous : Poisonous
		
		weaponArray.add(weapon3);
		weaponArray.add(weapon3);
		weaponArray.add(weapon7);
		weaponArray.add(weapon7);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Scissors : Scissors : Infested : Infested
		
		weaponArray.add(weapon3);
		weaponArray.add(weapon3);
		weaponArray.add(weapon8);
		weaponArray.add(weapon8);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Spock : Spock : RadioActive : RadioActive
		
		weaponArray.add(weapon4);
		weaponArray.add(weapon4);
		weaponArray.add(weapon6);
		weaponArray.add(weapon6);
	
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Spock : Spock : Poisonous : Poisonous
		
		weaponArray.add(weapon4);
		weaponArray.add(weapon4);
		weaponArray.add(weapon7);
		weaponArray.add(weapon7);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Spock : Spock : Infested : Infested
		
		weaponArray.add(weapon4);
		weaponArray.add(weapon4);
		weaponArray.add(weapon8);
		weaponArray.add(weapon8);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		
		// Lizard : Lizard : RadioActive : RadioActive
		
		weaponArray.add(weapon5);
		weaponArray.add(weapon5);
		weaponArray.add(weapon6);
		weaponArray.add(weapon6);
	
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Lizard : Lizard : Poisonous : Poisonous
		
		weaponArray.add(weapon5);
		weaponArray.add(weapon5);
		weaponArray.add(weapon7);
		weaponArray.add(weapon7);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Lizard : Lizard : Infested : Infested
		
		weaponArray.add(weapon5);
		weaponArray.add(weapon5);
		weaponArray.add(weapon8);
		weaponArray.add(weapon8);
		
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
	}
	
	/**
	 * Tests the total game functions properly when the right hand is a tie
	 * and the logic is left to the left hand.
	 */
	@Test
	public void TotalWinLoseLogicTest()
	{
		Weapon weapon1 = new Rock(new RightHandWeapon());
		Weapon weapon2 = new Paper(new RightHandWeapon());
		Weapon weapon3 = new Scissors(new RightHandWeapon());
		Weapon weapon4 = new Spock(new RightHandWeapon());
		Weapon weapon5 = new Lizard(new RightHandWeapon());
		Weapon weapon6 = new Radioactive(new LeftHandWeapon());
		Weapon weapon7 = new Poisonous(new LeftHandWeapon());
		Weapon weapon8 = new Infested(new LeftHandWeapon());
				
		int test = 0;
		int i = -1;
		
		GameScoring gameScoring = new GameScoring();
		gameScoring.setScoringBehavior(0);		
		ArrayList<Weapon> weaponArray = new ArrayList<Weapon>();
		
		
		// Rock : Rock : RadioActive : Poison
		
		weaponArray.add(weapon1);
		weaponArray.add(weapon2);
		weaponArray.add(weapon6);
		weaponArray.add(weapon7);
		

		// Rock : Rock : RadioActive : Infested
		
		weaponArray.add(weapon1);
		weaponArray.add(weapon1);
		weaponArray.add(weapon6);
		weaponArray.add(weapon8);
		
		i = 0;
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
		
		// Rock : Rock : Poison : Infested
		
		weaponArray.add(weapon1);
		weaponArray.add(weapon1);
		weaponArray.add(weapon7);
		weaponArray.add(weapon8);
		
		i = 1;
		test = gameScoring.selectWinner(weaponArray);
		weaponArray.clear();
		
		assertEquals("Logic  functioning",i,test);
	}
}
