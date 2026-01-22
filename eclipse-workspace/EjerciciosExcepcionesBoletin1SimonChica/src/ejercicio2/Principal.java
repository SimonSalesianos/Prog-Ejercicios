package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);

	        while (true) {
	        	
	            System.out.print("Introduce temperatura en ºC: ");
	            String linea = sc.nextLine();

	            try {
	            	
	                double c = Double.parseDouble(linea);
	                
	                double f = ConversorTemperatura.celsiusAFahrenheit(c);
	                
	                System.out.printf("Equivale a %.2f ºF%n", f);
	                
	                break; 
	                
	                
	            } catch (TemperaturaInvalidaException e) {
	            	
	                System.err.println(e.getMessage());
	                
	            }
	        }

	        sc.close();
		
		
	}

}
