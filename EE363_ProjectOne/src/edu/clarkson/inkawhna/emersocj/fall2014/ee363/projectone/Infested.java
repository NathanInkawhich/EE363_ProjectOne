package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

/**
 * infested weapon type.
 * @author Cody Emerson
 *
 */
public class Infested extends WeaponDecorator {

	Weapon weapon;
	
	/**
	 * Sets the previous weapon to the new decorated weapon : Constructor
	 * @param weapon
	 */
	public Infested(Weapon weapon) {		
		this.weapon = weapon;		
	}

	/**
	 * Returns the previous weapon attack decorated with infested.
	 * @returns String
	 */
	@Override
	public String attack() {
		return "Infested " + weapon.attack();				
	}

}
