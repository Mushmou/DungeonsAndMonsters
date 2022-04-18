public class Warrior extends Enemy implements Fighter{
	public Warrior(String n, int mHp){
      super(n, mHp);
	}
	public String sword (Entity e){
		int damage = 1;
		e.getName();
		e.takeDamage(damage);
		return " slashes " + e.getName() + " with sword for " + damage + "damage";
	}
	public String axe (Entity e){
		int damage = 1;
		e.getName();
		e.takeDamage(damage);
		return " slashes " + e.getName() + " with axe for " + damage + "damage";
	}
}