package project1;
/**
 * This class represents our Business and is an extension of the Building class
 * @author Joshua Domzalski
 * Programming Project 1
 * Summer 2022
 */


public class Business extends Building {
	
	protected int numRentableUnits;
	//end variables
	
	/**
	 * Empty argument constructor
	 */
	
	public Business() {
		super();
		this.numRentableUnits = 0;
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
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
		super();
		setProjectName(projectName);
		setCompleteAddress(completeAddress);
		setTotalSquareFeet(totalSquareFeet);
		setOccupancyGroup(occupancyGroup);
		setSubgroup(subgroup);
		setNumRentableUnits(numRentableUnits);
	}
	//end preferred constructor
	
	/**
	 * Method simulating a drawing of the business
	 */
	public void draw() {
		System.out.println("Drawing code for <<Business>>");
	}
	//end draw method
	
	/**
	 * Displaying the data as a toString
	 */
	public String displayData() {
		return toString();
	}
	//end displayData method
	
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
	//end getters and setters
	
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Business [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", numRentableUnits = "+ numRentableUnits+ "]";
	}
	//end toString method
	
	
}
//end class
