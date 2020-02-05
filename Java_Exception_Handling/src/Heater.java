
import java.util.Scanner;

public class Heater {
	
	private int level;
	
	public void changeLevel() throws IllegalLevelException {
		
		System.out.println("Auf welche Stufe soll die Heizung gestellt werden?");
		Scanner sc = new Scanner(System.in);
		level = sc.nextInt();
		
		if(level < 0) {
			throw new IllegalLevelException("Eingabe kleiner als 0");
		}
		else if(level > 5) {
			throw new IllegalLevelException("Eingabe größer als 5");
		}
		else {
			System.out.println("Die Heizung ist auf Stufe " + this.level + " eingestellt.");
		}
		
	}
	
}
