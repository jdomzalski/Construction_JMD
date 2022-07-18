package project1;

public class SingleFamilyHome extends Residential {

	private boolean garage;
	//end variables
	
	public SingleFamilyHome() {
		this.garage = false;
	}
	//end empty-argument constructor
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet,
							String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
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
	public void draw() {
		System.out.println("Drawing code for <<SingleFamilyHome>>");
	}
	//end draw method
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
