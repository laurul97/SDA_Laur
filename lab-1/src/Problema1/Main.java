package Problema1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("If else");
		System.out.println("Speed limit city: "+speedLimit_IfElse("Oras")+" km/h");	
		System.out.println("Speed limit residencial: "+speedLimit_IfElse("Zona rezidentiala")+" km/h");	
		System.out.println("Speed limit express: "+speedLimit_IfElse("Drum express")+" km/h");	
		System.out.println("Speed limit highway: "+speedLimit_IfElse("Autostrada")+" km/h");	
		System.out.println("Speed limit not found: "+speedLimit_IfElse("lalala"));	
		System.out.println("\n");
			
		System.out.println("switch");
		System.out.println("Speed limit city: "+speedLimit_Switch("Oras")+" km/h");	
		System.out.println("Speed limit residencial: "+speedLimit_Switch("Zona rezidentiala")+" km/h");	
		System.out.println("Speed limit express: "+speedLimit_Switch("Drum express")+" km/h");	
		System.out.println("Speed limit highway: "+speedLimit_Switch("Autostrada")+" km/h");	
		System.out.println("Speed limit not found: "+speedLimit_Switch("lalala"));	
	}

	static int speedLimit_IfElse(String zone) {
		if (zone == "Oras") {
			return 50;
		} else {
			if (zone == "Zona rezidentiala") {
				return 30;
			} else {
				if (zone == "Drum express") {
					return 100;
				} else {
					if (zone == "Autostrada") {
						return 130;
					} 
				}
			}
		}
		return 0;
	}
	
	static int speedLimit_Switch(String zone) {
		switch(zone) {
		  case "Oras":
		    return 50;		    
		  case "Zona rezidentiala":
		    return 30;		    
		  case "Drum express":
		    return 100;		    
		  case "Autostrada":
		    return 130;		     
		  default:
		    return 0;
		}
	}
}
	

