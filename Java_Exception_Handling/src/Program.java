public class Program {

	public static void main(String[] args) {
		
		Heater test = new Heater();
		
		try {
			test.changeLevel();
		} catch(IllegalLevelException e) {
			System.out.println("Heizungslevel ung�ltig: " + e.getMessage());
		}
		

	}

}
