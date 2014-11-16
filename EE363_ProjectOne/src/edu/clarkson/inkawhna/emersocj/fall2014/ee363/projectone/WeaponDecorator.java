package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;


/**
 * Abstract class used to implement the decorator pattern on weapons.
 * Returns null if the weapon is not decorated. 
 * Returns type weapon key
 * @author Wizard
 *
 */
public abstract class WeaponDecorator extends Weapon {
	
	private Weapon weapon;
	
	public WeaponDecorator(Weapon weapon) {
		this.weapon = weapon;
	}

	public String getWeaponAttack(){
		return this.weapon.attack();
	}
}
