package Controllers;

import Models.Archer;
import Models.Unit;
import Models.Villager;

import java.util.ArrayList;

public class Controller {
	private ArrayList<Unit> units;

	public Controller() {
		units = new ArrayList<>();
	}

	public void run() {
		createVillager(4);
		createArcher(3);

		System.out.println("\nUnit Count: " + units.size());

		System.out.println("\nVillager count: " + countUnits("Villager"));
		System.out.println("\nArcher count: " + countUnits("Archer"));

		for (Unit unit : units) {
			if (unit instanceof Villager) {
				System.out.println("************* Villager *************");
				System.out.println(unit);
				System.out.println("-------------------------------------");
			} else if (unit instanceof Archer) {
				System.out.println("************* Archer *************");
				System.out.println(unit);
				System.out.println("-------------------------------------");
			}
		}
	}

	private void createVillager(int count) {
		for (int i = 0; i < count; i++) {
			units.add(new Villager());
		}
	}

	private void createArcher(int count) {
		for (int i = 0; i < count; i++) {
			units.add(new Archer());
		}
	}

	private int countUnits(String selectedUnit) {
		int unitCount = 0;
		for (Unit unit : units) {
			if (unit.getName().equals(selectedUnit)) {
				unitCount++;
			}
		}
		return unitCount;
	}


}
