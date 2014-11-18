package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

/**
 * Scissors Weapon Type
 * @author Cody Emerson
 *
 */
public class Scissors extends WeaponDecorator {

	Weapon weapon;
	
	/**
	 * Sets the previous weapon to the new decorated weapon : Constructor
	 * @param weapon
	 */
	public Scissors(Weapon weapon) {		
		this.weapon = weapon;		
	}

	/**
	 * Returns the previous weapon attack decorated with Scissors
	 * @returns String
	 */
	@Override
	public String attack() {
		return "Scissors " + weapon.attack();				
	}

}
