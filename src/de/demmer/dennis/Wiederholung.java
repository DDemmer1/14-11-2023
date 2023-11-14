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
		
		
		// Text-Messenger. Max. 40 Zeichen pro Nachricht
		int limit = 40;
		
			//User Nachricht
			String message = "Hallo Sabine, wie geht es dir?";
		
//		int messageLength = message.length();
		int messageLength = -1;
		
		if(messageLength > limit) {
			System.out.println("Nachricht zu lang");
		} else if(messageLength != 0){
			System.out.println("Nachricht wurde verschickt");
		} else {
			System.out.println("Error");
		}
		
		
		
		
	
	}

}
