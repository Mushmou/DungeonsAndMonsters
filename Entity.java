public abstract class Entity{
	private String name;
	private int hp;
	private int maxHp;

	public Entity(String n, int mHp){
		name = n;
		hp = mHp;
		maxHp = mHp;
	}

	public String getName(){
		return name;
	}

	public int getHp(){
		return hp;
	}

	public void heal(){
		hp = maxHp;
	}

	public void takeDamage(int d){
		if (hp < 0){
			hp = 0;
		}
		else{
			hp -= d;
		}
	}

	@Override
	public String toString(){
		return name + " " + hp +  "/" + maxHp;
	}
}