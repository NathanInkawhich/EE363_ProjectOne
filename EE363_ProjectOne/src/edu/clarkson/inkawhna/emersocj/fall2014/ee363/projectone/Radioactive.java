package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

public class Radioactive extends WeaponDecorator {

	Weapon weapon;
	
	/**
	 * Sets the previous weapon to the new decorated weapon : Constructor
	 * @param weapon
	 */
	public Radioactive(Weapon weapon) {	
		this.weapon = weapon;		
	}

	/**
	 * Returns the previous weapon attack decorated with Radioactive.
	 * @returns String
	 */
	@Override
	public String attack() {
		return "Radioactive " + weapon.attack();				
	}

}