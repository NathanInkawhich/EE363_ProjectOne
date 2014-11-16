package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

public class Poisionous extends WeaponDecorator {

	public Poisionous(Weapon w) {
		super(w);
	}

	@Override
	public String attack() {
		
		//it is not the job of this method to see if this concatenation is proper so we do not check here 
		return new String(this.getWeaponAttack() +"," + "POISIONOUS");
	}

}
