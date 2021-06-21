package hfj.chapter6;

import java.util.ArrayList;

public class DotCom {
	private String name;
	private ArrayList<String> locationCells;

	public String getName() {
		return name;
	}

	public void setName(String xyz) {
		this.name = xyz;
	}

	public void setLocationCells(ArrayList<String> newLocation) {
		this.locationCells = newLocation;
		System.out.println("The location of "+ this.name + " is "+ this.locationCells);

	}

	public String checkYourself(String userInput) {
		String dotComResult = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				dotComResult = "kill";
				System.out.println("Ouch! You sunk " + name + " : ( ");
			} else {
				dotComResult = "hit";
				System.out.println("Hit at "+userInput + " from "+ this.name);
			} // close if
		} // close if
		return dotComResult;
	}
}
