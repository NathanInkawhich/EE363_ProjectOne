package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

public class LeftHandWeapon extends Weapon {
	
	private boolean isDecorated;
	
	LeftHandWeapon()
	{
		isDecorated = false;	
	}
	
		
	public String attack() {
		return "LEFT";
	}
	public boolean isWeaponDecorated(){
		return this.isDecorated;
	}
	public void setDecoratedTrue(){
		this.isDecorated = true;
	}
	

}
