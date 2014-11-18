package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

/**
 * Infected weapon type.
 * @author Cody Emerson
 *
 */
public class Infected extends WeaponDecorator {

	Weapon weapon;
	
	/**
	 * Sets the previous weapon to the new decorated weapon : Constructor
	 * @param weapon
	 */
	public Infected(Weapon weapon) {		
		this.weapon = weapon;		
	}

	/**
	 * Returns the previous weapon attack decorated with Infected.
	 * @returns String
	 */
	@Override
	public String attack() {
		return "Infected " + weapon.attack();				
	}

}
