public class Wizard extends Enemy implements Magical{
	public Wizard(String n, int mHp){
      super(n, mHp);
	}

	public String magicMissile(Entity e){
		int damage = 3;
		e.getName();
		e.takeDamage(damage);
		return " hits " + e.getName() + " with magic Missile for " + damage + "damage";
	}
	public String fireball(Entity e){
		int damage = 6;
		e.getName();
		e.takeDamage(damage);
		return " hits " + e.getName() + " with fireball for " + damage + "damage";
	}
}