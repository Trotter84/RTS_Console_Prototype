package Models;

public abstract class Unit {
	private String name;
	private int health;
	private int attack;
	private float attackSpeed;
	private int defense;
	private float unitSpeed;

	public Unit(String name, int health, int attack, float attackSpeed, int defense, float unitSpeed) {
		setName(name);
		setHealth(health);
		setAttack(attack);
		setAttackSpeed(attackSpeed);
		setDefense(defense);
		setUnitSpeed(unitSpeed);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public float getHealth() {
		return health;
	}

	private void setHealth(int health) {
		this.health = health;
	}

	public float getAttack() {
		return attack;
	}

	private void setAttack(int attack) {
		this.attack = attack;
	}

	public float getAttackSpeed() {
		return attackSpeed;
	}

	private void setAttackSpeed(float attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	public float getDefense() {
		return defense;
	}

	private void setDefense(int defense) {
		this.defense = defense;
	}

	public float getUnitSpeed() {
		return unitSpeed;
	}

	private void setUnitSpeed(float unitSpeed) {
		this.unitSpeed = unitSpeed;
	}

	@Override
	public String toString() {
		return "Name: " + getName() +
				"\nHealth: " + getHealth() +
				"\nAttack: " + getAttack() +
				"\nAttack Speed: " + getAttackSpeed() +
				"\nDefense: " + getDefense() +
				"\nSpeed: " + getUnitSpeed();
	}

}
