import java.util.*;

public class CarMaxNaperville implements CarInfoIterator{

	ArrayList<CarInfo> availableCars;
	
	public CarMaxNaperville() {
		
		availableCars = new ArrayList<CarInfo>();
		
		addCar("Hyundai Sonnata 11'", 9998);
		addCar("Nissan Altima 16'", 14998);
		addCar("Chevrolet Malibu LT 13'", 12599);
	
	}
	
	public void addCar(String carName, int carCost) {
		CarInfo carInfo = new CarInfo(carName, carCost);
		
		availableCars.add(carInfo);
		
	}


	@Override
	public Iterator createIterator() {
		
		return availableCars.iterator();
	}
	
}
