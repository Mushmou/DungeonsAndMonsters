import java.awt.Point;
public class Hero extends Entity{
	private Point loc;
	private int level;
	private int gold;
	private int keys;
	private int potions;

	public Hero (String n){
		super(n, 25);
		level = 1;
	}

	public String toString(){
		// toString should display the name, hp, level, gold, potions, keys, and map.
		return "name: " + getName();
	}

	public void levelUp(){
		level += 1;
		//Load the next map, the level should continue to increase
		// Maps numbered (1,2,3)
		// Every finish is the next maps start
	}

	public int getLevel(){
		return level;
	}

	public char goNorth(){
		// Get the character at this location
		// NEEDS TO UPDATE
		char x = 'c';
		System.out.println(loc.getLocation());
		return x;
	}

	public char goSouth(){
		// Get the character at this location
		// NEEDS TO UPDATE
		char x = 'c';
		System.out.println(loc.getLocation());
		return x;
	}

	public char goEast(){
		// Get the character at this location
		// NEEDS TO UPDATE
		char x = 'c';
		System.out.println(loc.getLocation());
		return x;
	}

	public char goWest(){
		// Get the character at this location
		// NEEDS TO UPDATE
		char x = 'c';
		System.out.println(loc.getLocation());
		return x;
	}

	public String getAttackMenu(){
		return "1. Physical Attack \n" +"2. Magical Attack \n" + "3. Ranged Attack \n";
	}

	public int getAttackMenuItems(){
		return 3;
	}

	public String getSubAttackMenu(int choice){
		if (choice == 1){
			return Fighter.FIGHTER_MENU;
		}
		if (choice == 2){
			return Archer.ARCHER_MENU;
		}
		if (choice == 3){
			return Magical.MAGIC_MENU;
		}
		else{
			return "Error";
		}
	}

	public int getNumSubAttackMenuItems(int choice){
		return 2;
	}

	// // FIGHTER
	// public String sword (Hero h){
	// 	int damage = 1;
	// 	h.takeDamage(damage);
	// 	return " slashes " + h.getName() + " with sword for " + damage + "damage";
	// }
	// public String axe (Hero h){
	// 	int damage = 1;
	// 	h.takeDamage(damage);
	// 	return " slashes " + h.getName() + " with axe for " + damage + "damage";
	// }
	// //ARCHER
	// public String arrow(Hero h){
	// 	int damage = 2;
	// 	h.takeDamage(damage);
	// 	return " shoots " + h.getName() + " with arrow for " + damage + "damage";
	// }
	// public String fireArrow(Hero h){
	// 	int damage = 2;
	// 	h.takeDamage(damage);
	// 	return " shoots " + h.getName() + " with fire arrow for " + damage + "damage";
	// }
	// //MAGICAL
	// public String magicMissile(Hero h){
	// 	int damage = 3;
	// 	h.takeDamage(damage);
	// 	return " hits " + h.getName() + " with magic Missile for " + damage + "damage";
	// }
	// public String fireball(Hero h){
	// 	int damage = 6;
	// 	h.takeDamage(damage);
	// 	return " hits " + h.getName() + " with fireball for " + damage + "damage";
	// }
}