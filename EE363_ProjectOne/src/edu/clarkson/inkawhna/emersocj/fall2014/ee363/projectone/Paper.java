package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

public class Paper extends WeaponDecorator {

	Weapon weapon;
	
	/**
	 * Sets the previous weapon to the new decorated weapon : Constructor
	 * @param weapon
	 */
	public Paper(Weapon weapon) {		
		this.weapon = weapon;		
	}

	/**
	 * Returns the previous weapon attack decorated with Paper.
	 * @returns String
	 */
	@Override
	public String attack() {
		return "Paper " + weapon.attack();				
	}

}

