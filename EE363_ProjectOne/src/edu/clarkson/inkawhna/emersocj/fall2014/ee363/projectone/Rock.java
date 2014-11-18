package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

/**
 * Rock Weapon Type
 * @author Wizard
 *
 */
public class Rock extends WeaponDecorator {

	Weapon weapon;
	
	/**
	 * Sets the previous weapon to the new decorated weapon : Constructor
	 * @param weapon
	 */
	public Rock(Weapon weapon) {		
		this.weapon = weapon;		
	}

	/**
	 * Returns the previous weapon attack decorated with Rock
	 * @returns String
	 */
	@Override
	public String attack() {
		return "Rock " + weapon.attack();				
	}

}