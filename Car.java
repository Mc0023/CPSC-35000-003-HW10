package HW10;


public class Car implements carbonFootprint {
	
	public double distanceKM;
	public double amntOfCarbon;
	
	public double getCarbonFootprint(double distanceKM) {
		// To produce a car produces, on average, 217 g of CO2 per km ridden 
		// + 313 g at production
		
		amntOfCarbon = distanceKM * 271 + 313;
		return amntOfCarbon;
	}

	public double getDistanceKM() {
		return distanceKM;
	}

	public void setDistanceKM(double distanceKM) {
		this.distanceKM = distanceKM;
	}

	public double getAmntOfCarbon() {
		return amntOfCarbon;
	}

	public void setAmntOfCarbon(double amntOfCarbon) {
		this.amntOfCarbon = amntOfCarbon;
	}

	public Car(double distanceKM) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCarbonFootprint() {
		amntOfCarbon = distanceKM * 271 + 313;
		return amntOfCarbon;
	}
	
}
