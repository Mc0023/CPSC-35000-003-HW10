package HW10;


import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class CarbonFootApp {
	public static void CalculateFootPrint() {
	//	JOptionPane.showMessageDialog(null, "Welcome Test Program");
		
		
		Random r = new Random();
		int low = 10;
		int high = 50;
		int rand = r.nextInt(high-low) + low;
		
		ArrayList<carbonFootprint> FootPrints = new ArrayList<>();
		boolean stop = false;
		while(stop != true) {
			String[] options = {"Car", "Bike", "Calculate"};
			String choice = (String) JOptionPane.showInputDialog(null, "Calculate carbon footprint of Car or Bike, select Calculate to stop and finish", "Select item to calculate", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			System.out.println(choice);
			
			if (choice == "Bike") {
			
			double distance = Double.parseDouble( JOptionPane.showInputDialog("Enter KM travled on Bike"));
			FootPrints.add(new Bike(distance));
	
			}
			else if (choice == "Car") {
			double distance = Double.parseDouble( JOptionPane.showInputDialog("Enter KM travled in Car"));
			FootPrints.add(new Car(distance));
			}
			else if (choice == "Calculate") {
				stop = true;
			}
			else {
				choice = (String) JOptionPane.showInputDialog(null, "Calculate carbon footprint of Car or Bike", "Select item to calculate", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				System.out.println(choice);
			}
			
		}
			
		rand = r.nextInt(15-3) + 3;
		int floors = rand;
		rand = r.nextInt(5000-300) + 300;
		double electricity = rand;
		rand = r.nextInt(10000-5000) + 5000;
		double floorSQFT = rand;
		
		FootPrints.add(new Building(floors, electricity, floorSQFT));

		for (int i = 0; i < FootPrints.size(); i++) {
			
			double amntOfCarbon;
			double distance;
			
			carbonFootprint result = FootPrints.get(i);
			if (result instanceof Bike) {
				amntOfCarbon = ((Bike) result).getCarbonFootprint();
				System.out.println("The Bike's carbon foot print is " + amntOfCarbon + "lbs");
				JOptionPane.showMessageDialog(null, "The Bike's carbon foot print is " + amntOfCarbon + "lbs");
			} else if (result instanceof Car) {
				amntOfCarbon = ((Car) result).getCarbonFootprint();

				System.out.println("The Car's carbon foot print is " + amntOfCarbon + "lbs");
				JOptionPane.showMessageDialog(null, "The Car's carbon foot print is " + amntOfCarbon + "lbs");
			} else {
				amntOfCarbon = ((Building) result).getCarbonFootprint();
				System.out.println("The Building's carbon foot print is " + amntOfCarbon + "lbs");
				JOptionPane.showMessageDialog(null, "The Building's carbon foot print is " + amntOfCarbon + "lbs");
		}
		}
	}
}
	
