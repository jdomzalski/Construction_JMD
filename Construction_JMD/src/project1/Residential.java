package project1;
/**
 * This class represents our Residential and is an extension of the Building class
 * @author Joshua Domzalski
 * Programming Project 1
 * Summer 2022
 */

public class Residential extends Building {

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	//end variables
	
	/**
	 * Empty argument constructor
	 */
	
	public Residential() {
		super();
		this.numBathrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
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
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, 
			int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super();
		setProjectName(projectName);
		setCompleteAddress(completeAddress);
		setTotalSquareFeet(totalSquareFeet);
		setOccupancyGroup(occupancyGroup);
		setSubgroup(subgroup);
		setNumBedrooms(numBedrooms);
		setNumBathrooms(numBathrooms);
		setLaundryRoom(laundryRoom);
		
	}
	//end preferred constructor
	
	/**
	 * Draw method simulating a drawing of the Residential
	 */
	public void draw() {
		System.out.println("Drawing code for <<Residential>>");
	}
	//end draw method
	
	/**
	 * Method that will display the data as a toString
	 */
	public String displayData() {
		return toString();
	}
	//end displayData method
	
	/**
	 * Getters and Setters
	 * @return
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}
	public int getNumBathrooms() {
		return numBathrooms;
	}
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}
	public boolean isLaundryRoom() {
		return laundryRoom;
	}
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	//end getters and setters
	
	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Residential [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + 
				", numBedrooms= "+ numBedrooms + ", numBathrooms= "+ numBathrooms+ ", laundryRoom= "+ laundryRoom + "]";
	}
	//end toString method
	
}
//end class
