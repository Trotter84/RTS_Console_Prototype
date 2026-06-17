package Models;

public class Villager extends Unit {
	private int gatherSize;
	private float gatherSpeed;

	public Villager(String name, int health, int attack, float attackSpeed, int defense, float unitSpeed, int gatherSize, float gatherSpeed) {
		super(name, health, attack, attackSpeed, defense, unitSpeed);
		setGatherSize(gatherSize);
		setGatherSpeed(gatherSpeed);
	}

	public Villager() {
		super("Villager", 50, 5, 1.0f, 2, 5.0f);
		setGatherSize(10);
		setGatherSpeed(1.0f);
	}

//region GETTERS||SETTERS
	public int getGatherSize() {
		return gatherSize;
	}

	private void setGatherSize(int gatherSize) {
		this.gatherSize = gatherSize;
	}

	public float getGatherSpeed() {
		return gatherSpeed;
	}

	private void setGatherSpeed(float gatherSpeed) {
		this.gatherSpeed = gatherSpeed;
	}
//endregion

	@Override
	public String toString() {
		return super.toString() +
				"\nGather Size: " + getGatherSize() +
				"\nGather Speed: " + getGatherSpeed();
	}
}
