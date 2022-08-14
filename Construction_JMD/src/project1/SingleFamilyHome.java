package project1;
/**
 * This class represents our SingleFamilyHome and is an extension of the Residential class
 * @author Joshua Domzalski
 * Programming Project 1
 * Summer 2022
 */

public class SingleFamilyHome extends Residential {

	private boolean garage;
	//end variables
	
	/**
	 * Empty argument constructor
	 */
	public SingleFamilyHome() {
		super();
		this.garage = false;
	}
	//end empty-argument constructor
	
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
	 * @param garage
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet,
							String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super();
		setProjectName(projectName);
		setCompleteAddress(completeAddress);
		setTotalSquareFeet(totalSquareFeet);
		setOccupancyGroup(occupancyGroup);
		setSubgroup(subgroup);
		setNumBedrooms(numBedrooms);
		setNumBathrooms(numBathrooms);
		setLaundryRoom(laundryRoom);
		setGarage(garage);
	}
	//end preferred constructor
	
	/**
	 * Draw method simulating a drawing for the SingleFamilyHome
	 */
	public void draw() {
		System.out.println("Drawing code for <<SingleFamilyHome>>");
	}
	//end draw method
	
	/**
	 * Method that will display the data as a toString
	 */
	public String displayData() {
		return toString();
	}
	//end displayData method
	public boolean isGarage() {
		return garage;
	}
	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	//end getters and setters
	
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "SingleFamilyHome [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", numBedrooms="
				+ numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom=" + laundryRoom
				+ ", garage=" + garage + "]";
	}
	//end toString method
	
}
//end class
