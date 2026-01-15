package ejercicio1;

import java.util.Arrays;


public class Parking {
	
	
	private Vehiculo[]vehiculos;
	private String direccion;
	
	
	public Vehiculo[] getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(Vehiculo[] vehiculos) {
		this.vehiculos = vehiculos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Parking(Vehiculo[] vehiculos, String direccion) {
		super();
		this.vehiculos = vehiculos;
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Parking [vehiculos=" + Arrays.toString(vehiculos) + ", direccion=" + direccion + "]";
	}
	

	
	//public Furgonetas comprobarTamanyo() {
		
		//for (Vehiculo vehiculo : vehiculos) {
			
			
			
			
		//}
		
		//return ;
	//}
	

	
	
	//public double calcularRecaudadoMotos() {
		
		//for (Vehiculo vehiculo : vehiculos) {
			
			
		//}
		
		
	//}
	
	
	
	//public double calcularPrecioUnVehiculo(Vehiculo v) {
		
		
		
	//}
	
	
	//public Vehiculo buscarMatricula() {
		
		//if() {
			
			
		//}
		
	//}
	
	
	public void mostrarDatos() {
		
		for (Vehiculo vehiculo : vehiculos) {
			
			System.out.println(vehiculo);
		}
		
	}
	

}
