import java.awt.Point;
import java.util.Random;
public class Hero extends Entity implements Fighter, Magical, Archer{
	private Point loc;
	private int level;
	private int gold;
	private int keys;
	private int potions;

	public Hero (String n){
		super(n, 25);
		level = 1;
		gold = 25;
		potions = 1;
		keys = 0;
	}

	public String toString(){
		// toString should display the name, hp, level, gold, potions, keys, and map.
		return "Name: " + getName() + "\n" + 
			"HP: " + getHp() + "\n" + 
			"Level: " + level + "\n" + 
			"Gold: " + gold + "\n" + 
			"P: " + potions + " " + "K: " + keys
			;
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
		if (choice == 1){
			return Fighter.NUM_FIGHTER_MENU_ITEMS;
		}
		if (choice == 2){
			return Archer.NUM_ARCHER_MENU_ITEMS;
		}
		if (choice == 3){
			return Magical.NUM_MAGIC_MENU_ITEMS;
		}
		else{
			return 0;
		}
	}

	public String attack(Enemy e, int choice, int subChoice){
		// Fighter
		if (choice == 1){
			if (subChoice == 1){
				return sword(e);
			}
			if (subChoice == 2){
				return axe(e);
			}
		}
		// Magic
		if (choice == 2){
			if (subChoice == 1){
				return magicMissile(e);
			}
			if (subChoice == 2){
				return fireball(e);
			}
		}
		// Range
		if (choice == 3){
			if (subChoice == 1){
				return arrow(e);
			}
			if (subChoice == 2){
				return fireArrow(e);
			}
		}
		return "error";
	}
	
	// FIGHTER
	public String sword (Entity e){
		// MAX 2 | MIN 1
		int damage = (int)Math.floor(Math.random()*(2-1+1) + 1);
		return getName() + " slashes " + e.getName() + " with sword for " + damage + " damage";
	}
	public String axe (Entity e){
		// MAX 3 | MIN 1
		int damage = (int)Math.floor(Math.random()*(3-1+1) + 1);
		return getName() + " butchers " + e.getName() + " with axe for " + damage + " damage";
	}
	//MAGICAL
	public String magicMissile(Entity e){
		// MAX 7 | MIN 1
		int damage = (int)Math.floor(Math.random()*(7-1+1) + 1);
		return getName() + " hits " + e.getName() + " with magic Missile for " + damage + " damage";
	}
	public String fireball(Entity e){
		// MAX 10 | MIN 1
		int damage = (int)Math.floor(Math.random()*(10-1+1) + 1);
		return getName() + " hits " + e.getName() + " with fireball for " + damage + " damage";
	}
	//ARCHER
	public String arrow(Entity e){
		// MAX 2 | MIN 1
		int damage = (int)Math.floor(Math.random()*(2-1+1) + 1);
		return getName() + " shoots " + e.getName() + " with arrow for " + damage + " damage";
	}
	public String fireArrow(Entity e){
		// MAX 4 | MIN 1
		int damage = (int)Math.floor(Math.random()*(4-1+1) + 1);
		return getName() + " shoots " + e.getName() + " with fire arrow for " + damage + " damage";
	} 

	public int getGold(){
		return gold;
	}

	public void collectGold(int g){
		gold += g;
	}
	
	public boolean spendGold(int g){
		if (g > 0){
			gold -= g;
			return true;
		}
		return false;
	}

	public boolean hasKey(){
		if (keys > 0){
			return true;
		}
		else{
			return false;
		}
	}

	public void pickUpKey(){
		keys += 1;
	}

	public boolean useKey(){
		keys -= 1;
		return true;
	}

	public boolean hasPotion(){
		if (potions > 0){
			return true;
		}
		else{
			return false;
		}
	}

	public void pickupPotion(){
		potions += 1;
	}

	public boolean usePotion(){
		potions -= 1;
		return true;
	}
}