package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		
		int opcion;
		
		
		Vehiculo f1=new Furgonetas("1234ABC", 10, 3);
		Vehiculo f2=new Furgonetas("1334ABC", 100, 5);
		Vehiculo m1=new Motos("1634ABC", 15, 260);
		Vehiculo m2=new Furgonetas("1534ABC", 20, 280);
		Vehiculo v1=new Vehiculo("1334ABC", 25);
		Vehiculo v2=new Vehiculo("1334ABC", 18);
		
		Vehiculo[]lista= {f1,f2,m1,m2,v1,v2};
		
		Parking p=new Parking(lista, "Sevilla");

		do {
			
			System.out.println("Bienvenido al programa para calcular las tarifas del parking!!!");
			System.out.println("Elija alguna opción: ");
			System.out.println("0. Para salir del programa");
			System.out.println("1. Para mostrar todos los vehículos");
			System.out.println("2. Para calcular el precio de un vehículo en concreto");
			System.out.println("3. Para comprobar el tamaño de una furgoneta");
			System.out.println("4. Para ver el total recaudado de las motos");

			opcion=Integer.parseInt(sc.nextLine());
			
			
			
			switch (opcion) {
			case 0:
				System.out.println("Saliendo....");
				
				
				break;
			case 1:
				
				System.out.println("Todos los vehículos son: ");
				p.mostrarDatos();
				
				
				
				
				
				break;
			case 2:
	
				
				
				
				
				
				
				break;
			case 3:

				
				
				
				
				break;
			case 4:
	
				
				
				
				
				
				break;

			default: System.out.println("Elija una opción válida");
				break;
			}
			
			
			
		} while (opcion!=0);
		
		
		
		
		
		sc.close();
	}

}
