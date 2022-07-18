package project1;

public class Mall extends Business{

	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	//end variables
	
	public Mall() {
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
		this.numParkingSpaces = 0;
		
	}
	//end empty-argument constructor
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits,
			int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		setProjectName(projectName);
		setCompleteAddress(completeAddress);
		setTotalSquareFeet(totalSquareFeet);
		setOccupancyGroup(occupancyGroup);
		setSubgroup(subgroup);
		setNumRentableUnits(numRentableUnits);
		setNumRentedUnits(numRentedUnits);
		setMedianUnitSize(medianUnitSize);
		setNumParkingSpaces(numParkingSpaces);
	}
	//end preferred constructor
	public void draw() {
		System.out.println("Drawing code for <<Mall>>");
	}
	//end draw method
	public String displayData() {
		return toString();
	}
	//end displayData method
	public int getNumRentedUnits() {
		return numRentedUnits;
	}
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}
	public double getMedianUnitSize() {
		return medianUnitSize;
	}
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	//end getters and setters
	@Override
	public String toString() {
		return "Mall [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", numRentableUnits = "+ numRentableUnits+
				", numRentedUnits= "+ numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces= "+ numParkingSpaces+ "]";	}
	//end toString method
	
	
}
//end class
