package de.demmer.dennis;

public class Hint {
	
	static int checkInt(int toCheck) {
		
		//hier kommen jetzt die if blöcke hin

		//wenn toCheck größer als 0 ->  +1 zurück geben	
		if(toCheck > 0) {
			return 1;			
		}
	
		//wenn toCheck kleiner als 0 ->  -1 zurück geben
		if(toCheck < 0) {
			return -1;
		}

		//wenn toCheck gleich 0 ->  0 zurück geben
		if(toCheck == 0) {
			return 0;
		}
		
		// ein Rückgabewert muss auf jedenfall ohne Bedingung erreichbar sein
		return 0;

	}
	

	static int checkIntAlternative(int toCheck) {
		
		int ergebnis = 0;
		
		if(toCheck > 0) {
			ergebnis = 1;
		} else if(toCheck < 0) {
			ergebnis = -1;
		} else if(toCheck == 0) {
			ergebnis = 0;
		}
		
		
		return ergebnis;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(checkInt(-23));
		System.out.println(checkInt(4));
	}

}
