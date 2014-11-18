package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecoratorTestCases {

	@Test
	public void AllDecoratorsTest() {
		final String TOTALDECORATEDATTACK = "Infected Radioactive Poisonous Lizard Spock Scissors Paper Rock Left Handed Weapon";
		
		Weapon weapon = new LeftHandWeapon();
		weapon = new Rock(weapon);
		weapon = new Paper(weapon);	
		weapon = new Scissors(weapon);
		weapon = new Spock(weapon);
		weapon = new Lizard(weapon);
		weapon = new Poisonous(weapon);
		weapon = new Radioactive(weapon);
		weapon = new Infected(weapon);

		assertEquals("All weapon decorators functioning",weapon.attack(),TOTALDECORATEDATTACK);
		//(weapon.attack(),TOTALDECORATEDATTACK,
	}
	


	
	
	
	

}
