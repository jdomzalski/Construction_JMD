package project1;

public class Apartment extends Residential {

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	//end variables
	
	public Apartment() {
		this.numRentableUnits = 0;
		this.avgUnitSize = 0;
		this.parkingAvailable = false;
		
	}
	//end empty-argument constructor
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup,
			int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		setProjectName(projectName);
		setCompleteAddress(completeAddress);
		setTotalSquareFeet(totalSquareFeet);
		setOccupancyGroup(occupancyGroup);
		setSubgroup(subgroup);
		setNumBedrooms(numBedrooms);
		setNumBathrooms(numBathrooms);
		setLaundryRoom(laundryRoom);
		setNumRentableUnits(numRentableUnits);
		setAvgUnitSize(avgUnitSize);
		setParkingAvailable(parkingAvailable);
		
	}
	//end preferred constructor
	public void draw() {
		System.out.println("Drawing code for <<Apartment>>");
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
	public double getAvgUnitSize() {
		return avgUnitSize;
	}
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	//end getters and setters
	@Override
	public String toString() {
		return "Apartment [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", numBedrooms="
				+ numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom=" + laundryRoom + 
				", numRentableUnits= "+ numRentableUnits + ", avgUnitSize= "+ avgUnitSize + "parkingAbailable= "+ parkingAvailable + "]";
	}
	//end toString method
	
}
//end class
