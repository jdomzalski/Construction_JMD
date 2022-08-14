package project1;
/**
 * This class represents our Apartments and is an extension of the Residential class
 * @author Joshua Domzalski
 * Programming Project 1
 * Summer 2022
 */

public class Apartment extends Residential {

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	//end variables
	
	/**
	 * Empty argument constructor
	 */
	
	public Apartment() {
		super();
		this.numRentableUnits = 0;
		this.avgUnitSize = 0;
		this.parkingAvailable = false;
		
	}
	/**
	 * Preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numBedrooms
	 * @param numBathrooms
	 * @param laundryRoom
	 * @param numRentableUnits
	 * @param avgUnitSize
	 * @param parkingAvailable
	 */
			
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup,
			int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super();
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
	/**
	 * Method to simulate drawing the Apartment
	 */
	public void draw() {
		System.out.println("Drawing code for <<Apartment>>");
	}
	/**
	 * Method to display the data in a toString
	 */

	public String displayData() {
		return toString();
	}
	/**
	 * Getters and setters
	 * @return
	 */
	
	
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
