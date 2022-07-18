package project1;

public class Business extends Building {
	
	protected int numRentableUnits;
	//end variables
	
	public Business() {
		this.numRentableUnits = 0;
	}
	//end empty-argument constructor
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		setProjectName(projectName);
		setCompleteAddress(completeAddress);
		setTotalSquareFeet(totalSquareFeet);
		setOccupancyGroup(occupancyGroup);
		setSubgroup(subgroup);
		setNumRentableUnits(numRentableUnits);
	}
	//end preferred constructor
	public void draw() {
		System.out.println("Drawing code for <<Business>>");
	}
	//end draw method
	public String displayData() {
		return toString();
	}
	//end displayData method
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	//end getters and setters
	@Override
	public String toString() {
		return "Business [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", numRentableUnits = "+ numRentableUnits+ "]";
	}
	//end toString method
	
	
}
//end class
