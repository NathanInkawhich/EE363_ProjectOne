package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;


/**
 * Abstract class used to implement the decorator pattern on weapons.
 * Returns null if the weapon is not decorated. 
 * Returns type weapon key if decorated.
 * @author Nate Inkawhich
 *
 */
public abstract class WeaponDecorator extends Weapon {
	
	/**
	 * Abstract attack class to be implemented in behavior sub classes. 
	 */
	public abstract String attack();
}
