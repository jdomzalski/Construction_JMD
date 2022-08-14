package project1;
/**
 * This class represents our Buildings
 * @author Joshua Domzalski
 * Programming Project 1
 * Summer 2022
 */


public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	//end variables
	
	/*
	 * Empty argument constructor
	 */
	public Building() {
		this.projectName = " ";
		this.completeAddress = " ";
		this.totalSquareFeet = 0;
		this.occupancyGroup = " ";
		this.subgroup = " ";
		
	}
	//end empty-argument constructor
	/**
	 * Preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subgroup
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		setProjectName(projectName);
		setCompleteAddress(completeAddress);
		setTotalSquareFeet(totalSquareFeet);
		setOccupancyGroup(occupancyGroup);
		setSubgroup(subgroup);
	}
	//end preferred constructor
	
	/*
	 * Method to simulate drawing the building
	 */
	public void draw() {
		System.out.println("Drawing code for <<Building>>");
	}
	//end draw method
	
	/*
	 * Method to display the data as a toString
	 */
	public String displayData() {
		return toString();
	}
	//end displayData method
	
	/*
	 * Getters and setters
	 */
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getCompleteAddress() {
		return completeAddress;
	}
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}
	public String getOccupancyGroup() {
		return occupancyGroup;
	}
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}
	public String getSubgroup() {
		return subgroup;
	}
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}
	//end getters and setters
	/*
	 * toString method
	 */
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}
	//end toString method
	
}
//end class
