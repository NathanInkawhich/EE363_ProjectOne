package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

/**
 * Base class for weapons to be created off of.
 * String attack contains the attack description.
 * @author Cody Emerson
 *
 */
public abstract class Weapon {
	
	String attackDescription = "No Attack Description";
	
	/**
	 * Returns the attack variable : String
	 * @return String
	 */
	public String attack(){
		return attackDescription;		
	}	
}
