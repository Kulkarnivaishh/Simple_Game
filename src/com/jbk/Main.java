package com.jbk;

public class Main {
public static void main(String[] args) {
	
	Player1 player=new Player1("vaishnavi","sword", 100);
//	System.out.println(player.getName());
//	System.out.println(player.getHealth());
//	System.out.println(player.getWeapon());
//
	player.damageByGun1();
	player.damageByGun1();
//	player.damageByGun2();
	player.heal();

	
	
	
	Player2 player2=new Player2("sam","machine gun", 80, false);
	player2.damageByGun1();

}
}
