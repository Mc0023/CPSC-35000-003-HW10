package HW10;


public class Bike implements carbonFootprint {
	double amntOfCarbon;
	double distanceKM;
	
	public double getCarbonFootprint(double distanceKM) {
		// To produce a bike produces, on average, 5 g of CO2 per km ridden 
		// + 16 g at production
				
		amntOfCarbon = distanceKM * 5 + 16;
		return amntOfCarbon;
	}
	
	public double getAmntOfCarbon() {
		return amntOfCarbon;
	}

	public void setAmntOfCarbon(double amntOfCarbon) {
		this.amntOfCarbon = amntOfCarbon;
	}

	public double getDistanceKM() {
		return this.distanceKM;
	}

	public void setDistanceKM(double distanceKM) {
		this.distanceKM = distanceKM;
	}

	@Override
	public double getCarbonFootprint() {
		this.amntOfCarbon = this.distanceKM * 5 + 16;
		return this.amntOfCarbon;
	}

	public Bike (double distanceKM) {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
