package project1;

public class Residential extends Building {

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	//end variables
	
	public Residential() {
		this.numBathrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
	}
	//end empty-argument constructor
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, 
			int numBedrooms, int numBathrooms, boolean laundryRoom) {
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
	public void draw() {
		System.out.println("Drawing code for <<Residential>>");
	}
	//end draw method
	public String displayData() {
		return toString();
	}
	//end displayData method
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
	@Override
	public String toString() {
		return "Residential [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + 
				", numBedrooms= "+ numBedrooms + ", numBathrooms= "+ numBathrooms+ ", laundryRoom= "+ laundryRoom + "]";
	}
	//end toString method
	
}
//end class
