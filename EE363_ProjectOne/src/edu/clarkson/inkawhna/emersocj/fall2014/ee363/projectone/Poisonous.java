package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

/**
 * Poisonous Weapon Type
 * @author Cody Emerson
 *
 */
public class Poisonous extends WeaponDecorator {

	Weapon weapon;
	
	/**
	 * Sets the previous weapon to the new decorated weapon : Constructor
	 * @param weapon
	 */
	public Poisonous(Weapon weapon) {		
		this.weapon = weapon;		
	}

	/**
	 * Returns the previous weapon attack decorated with Poisonous.
	 * @returns String
	 */
	@Override
	public String attack() {
		return "Poisonous " + weapon.attack();				
	}

}
