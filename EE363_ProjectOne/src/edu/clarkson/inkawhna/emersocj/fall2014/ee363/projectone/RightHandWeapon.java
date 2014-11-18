package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

/**
 * Concrete Right Hand Weapon Class to be decorated by the Weapon Decorator.
 * @author Cody Emerson
 *
 */
public class RightHandWeapon extends Weapon {
	
	/**
	 * Constructs attack string variable.
	 */
	RightHandWeapon()
	{
		attackDescription = "Right Handed Weapon";	
	}
		
	/**
	 * Returns the attackDescription : String.
	 */
	public String attack() {
		return attackDescription;
	}
}
