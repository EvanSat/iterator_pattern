import java.util.*;

public class CarMaxSchaumburg implements CarInfoIterator{

	CarInfo[] availableCars;
	
	int arrayValue = 0;
	
	public CarMaxSchaumburg() {
		
		availableCars = new CarInfo[3];
		
		addCar("Chevrolet Equinox 17'", 16998);
		addCar("Volkswagen Jetta S 16'", 12998);
		addCar("GMC Terrain SLE 17'", 15998);
	
	}
	
	public void addCar(String carName, int carCost) {
		CarInfo car = new CarInfo(carName, carCost);
		
		availableCars[arrayValue] = car;
		
		arrayValue++;
		
	}
	
	public Iterator<CarInfo> createIterator() {
		
		return Arrays.asList(availableCars).iterator();
	}
	
}