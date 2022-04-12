package HW10;


public class Building implements carbonFootprint {
	
	public int floors;
	public double electricity;
	public double floorSQFT;
	public double amntOfCarbon;
	
	public Building(int floors, double electricity, double floorSQFT) {
		super();
		this.electricity = electricity;
		this.floors = floors;
		this.floorSQFT = floorSQFT;
	}
	
	public double getCarbonFootprint(double electricity, int floors, double floorSQFT) {
		//https://www.eia.gov/tools/faqs/faq.php?id=74&t=11
		
		amntOfCarbon = (floors * floorSQFT) + (electricity * 2.23);
		return amntOfCarbon;
	}
	
	public double getCarbonFootprint() {
		//https://www.eia.gov/tools/faqs/faq.php?id=74&t=11
		
		amntOfCarbon = (floors * floorSQFT) + (electricity * 2.23);
		return amntOfCarbon;
	}


	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public double getElectricity() {
		return electricity;
	}

	public void setElectricity(double electricity) {
		this.electricity = electricity;
	}

	public double getFloorSQFT() {
		return floorSQFT;
	}

	public void setFloorSQFT(double floorSQFT) {
		this.floorSQFT = floorSQFT;
	}

	public double getAmntOfCarbon() {
		return amntOfCarbon;
	}

	public void setAmntOfCarbon(double amntOfCarbon) {
		this.amntOfCarbon = amntOfCarbon;
	}

	


	
	
	
}
