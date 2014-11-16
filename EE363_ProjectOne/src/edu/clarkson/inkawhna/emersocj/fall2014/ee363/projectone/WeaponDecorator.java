package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

public abstract class WeaponDecorator extends Weapon {
	
	private Weapon weapon;
	
	public WeaponDecorator(Weapon w) {
		this.weapon = w;
	}

	public Weapon getWeapon(){
		return this.weapon;
	}
}
