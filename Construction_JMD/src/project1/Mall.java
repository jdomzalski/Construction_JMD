package project1;

/**
 * This class represents our Mall and is an extension of the Business class
 * @author Joshua Domzalski
 * Programming Project 1
 * Summer 2022
 */

public class Mall extends Business{

	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	//end variables
	
	/**
	 * Empty argument constructor
	 */
	
	public Mall() {
		super();
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
		this.numParkingSpaces = 0;
		
	}
	//end empty-argument constructor
	
	/**
	 * Preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 * @param numRentableUnits
	 * @param numRentedUnits
	 * @param medianUnitSize
	 * @param numParkingSpaces
	 */
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits,
			int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super();
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
	
	/**
	 * Draw method simulating a drawing of the Mall
	 */
	public void draw() {
		System.out.println("Drawing code for <<Mall>>");
	}
	//end draw method
	
	/**
	 * Method that will display the data in a toStirng
	 */
	public String displayData() {
		return toString();
	}
	//end displayData method
	
	/**
	 * Getters and Setters
	 * @return
	 */
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
	
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Mall [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", numRentableUnits = "+ numRentableUnits+
				", numRentedUnits= "+ numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces= "+ numParkingSpaces+ "]";	}
	//end toString method
	
	
}
//end class
