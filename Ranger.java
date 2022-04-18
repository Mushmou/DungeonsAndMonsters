public class Ranger extends Enemy implements Archer{
	public Ranger(String n, int mHp){
      super(n, mHp);
	}
	public String arrow(Entity e){
		int damage = 2;
		e.getName();
		e.takeDamage(damage);
		return " shoots " + e.getName() + " with arrow for " + damage + "damage";
	}
	public String fireArrow(Entity e){
		int damage = 2;
		e.getName();
		e.takeDamage(damage);
		return " shoots " + e.getName() + " with fire arrow for " + damage + "damage";
	}
}