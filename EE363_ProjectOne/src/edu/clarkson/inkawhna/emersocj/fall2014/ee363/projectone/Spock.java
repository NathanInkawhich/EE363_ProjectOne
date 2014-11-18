package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

public class Spock extends WeaponDecorator {

	Weapon weapon;
	
	/**
	 * Sets the previous weapon to the new decorated weapon : Constructor
	 * @param weapon
	 */
	public Spock(Weapon weapon) {		
		this.weapon = weapon;		
	}

	/**
	 * Returns the previous weapon attack decorated with spock
	 * @returns String
	 */
	@Override
	public String attack() {
		return "Spock " + weapon.attack();				
	}

}
