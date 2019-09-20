
public class CarmaxCatelog {

	public static void main(String[] args) {
		
		CarMaxNaperville NapervilleCars = new CarMaxNaperville();
		CarMaxSchaumburg SchaumburgCars = new CarMaxSchaumburg();
		
		CarCompiler website = new CarCompiler(NapervilleCars, SchaumburgCars);
		
		website.showCars();

	}

}
