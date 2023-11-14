package de.demmer.dennis;

public class Wiederholung {
	
	public static void main(String[] args) {
		
		//--Casting--
		
		//implizit
		int i = 5;    //32bit
		double d = i; //64bit
		System.out.println(d);
		

		//explizit
		double d1 = 5.33; //64bit
		int i1 = (int)d1; //32bit
		System.out.println(i1);
		
		
		//--Conditionals--
		
		
		//if else wird sehr häufig benutzt
		
		// Text-Messenger. Max. 40 Zeichen pro Nachricht
		int limit = 40;
		
			//User Nachricht
			String message = "Hallo Sabine, wie geht es dir?";
		
		int messageLength = message.length();
		
		if(messageLength > limit) {
			System.out.println("Nachricht zu lang");
		} else if(messageLength != 0){
			System.out.println("Nachricht wurde verschickt");
		} else {
			System.out.println("Error");
		}
		
		
		//switch case statement
		
		//switch -> STRG + LEERTASTE -> doppelklick auf "switch case statement"
		
		
		/*
		 * Szenario:
		 * "Wählen sie folgende Option:"
		 * 
		 * 1. Kundensupport
		 * 2. FAQ
		 * 3. Neustarten
		 * 
		 */
		
		
		int eingabe = 2;
		
		switch (eingabe) {
		case 1:
			System.out.println("Der Kundensupport wird kontaktiert!");
			break;
		case 2:
			System.out.println("FAQ wird geladen...");
			break;
		case 3:
			System.out.println("Das Programm wird neugestartet");
			break;

		default:
			System.out.println(eingabe + " ist keine Option");
			break;
		}

		
		
		
	
	}

}
