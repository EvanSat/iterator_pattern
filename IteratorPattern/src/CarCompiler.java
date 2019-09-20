import java.util.*;


public class CarCompiler {
	
	CarMaxNaperville NapervilleCars;
	CarMaxSchaumburg SchaumburgCars;
	
	CarInfoIterator iterNapervilleCars;
	CarInfoIterator iterSchaumburgCars;

	public CarCompiler(CarInfoIterator newNapervilleCars, CarInfoIterator newSchaumburgCars) {
		
		iterNapervilleCars = newNapervilleCars;
		iterSchaumburgCars = newSchaumburgCars;
		
	}
	
	public void showCars() {
		
		Iterator NapervilleCars = iterNapervilleCars.createIterator();
		Iterator SchaumburgCars = iterSchaumburgCars.createIterator();
		
		System.out.println("Carmax of Naperville cars: \n");
		printTheCars(NapervilleCars);
		
		System.out.println("Carmax of Schaumburg cars: \n");
		printTheCars(SchaumburgCars);
		
	}
	
	public void printTheCars(Iterator iterator) {
		
		while(iterator.hasNext()) {
			
			CarInfo carInfo = (CarInfo) iterator.next();
			
			System.out.println("Name: " + carInfo.getCarName() + " | Cost: " + carInfo.getCarCost() + "\n");
			
		}
		
	}
}
