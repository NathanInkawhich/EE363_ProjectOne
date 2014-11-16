package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

public class Main {

	public static void main(String[] args){
		
		Weapon lhWeapon = new LeftHandWeapon();
		System.out.println("Weapon Created: " + lhWeapon.attack());
		lhWeapon = new Poisionous( lhWeapon );
		System.out.println("Weapon Created: " + lhWeapon.attack());
		lhWeapon = new Rock( lhWeapon );
		System.out.println("Weapon Created: " + lhWeapon.attack());
	}
}
