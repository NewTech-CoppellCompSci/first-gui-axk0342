package first_gui;

public class Houses {
	private int sqFootage;
	private int numBedrooms;
	private double numBaths;
	private int cost;
	private String address;
	private String housePic;
	
	public Houses(int sqFootage, int numBedrooms, double numBaths, int cost, String address, String housePic) {
		sqFootage = this.sqFootage;
		numBedrooms = this.numBedrooms;
		numBaths = this.numBaths;
		cost = this.cost;
		address = this.address;
		housePic = this.housePic;
	}
	
	public int getSqFootage(){
		return sqFootage;
	}
	public int getNumBedrooms() {
		return numBedrooms;
	}
	public double getNumBaths() {
		return numBaths;
	}
	public int getCost() {
		return cost;
	}
	public String getAddress() {
		return address;
	}
	public String getHousePic() {
		return housePic;
	}
}
