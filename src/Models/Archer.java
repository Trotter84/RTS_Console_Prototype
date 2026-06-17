package Models;

public class Archer extends Unit {
	private int range;


	public Archer(String name, int health, int attack, float attackSpeed, int defense, float unitSpeed) {
		super(name, health, attack, attackSpeed, defense, unitSpeed);
		setRange(range);
	}

	public Archer() {
		super("Archer", 75, 10, 2.0f, 3, 5.0f);
		setRange(10);
	}

	//region GETTERS||SETTERS
	public int getRange() {
		return range;
	}

	private void setRange(int range) {
		this.range = range;
	}
//endregion

	@Override
	public String toString() {
		return super.toString() +
				"\nRange: " + getRange();
	}
}
