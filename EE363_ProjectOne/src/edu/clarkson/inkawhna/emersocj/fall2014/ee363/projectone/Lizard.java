package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

public class Lizard extends WeaponDecorator {

	Weapon weapon;
	
	/**
	 * Sets the previous weapon to the new decorated weapon : Constructor
	 * @param weapon
	 */
	public Lizard(Weapon weapon) {		
		this.weapon = weapon;		
	}

	/**
	 * Returns the previous weapon attack decorated with Lizard.
	 * @returns String
	 */
	@Override
	public String attack() {
		return "Lizard " + weapon.attack();				
	}

}