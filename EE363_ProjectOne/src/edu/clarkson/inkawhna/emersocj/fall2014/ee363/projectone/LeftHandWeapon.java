package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

/**
 * Concrete Left Hand Weapon Class to be decorated by the Weapon Decorator.
 * @author Wizard
 *
 */
public class LeftHandWeapon extends Weapon {
	
	/**
	 * Constructs attack string variable.
	 */
	public LeftHandWeapon()
	{
		attackDescription = "Left Handed Weapon";	
	}
	
	/**
	 * Returns the attackDescription : String.
	 */
	public String attack() {
		return attackDescription;
	}
}

