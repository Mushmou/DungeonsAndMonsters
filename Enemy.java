public abstract class Enemy extends Entity{
	public Enemy(String n, int mHp){
		super(n, mHp);
	}
	public String attack (Hero h){
		return "attack";
	}
}