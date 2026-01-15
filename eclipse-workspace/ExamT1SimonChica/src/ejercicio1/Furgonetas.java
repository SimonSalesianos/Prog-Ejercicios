package ejercicio1;

public class Furgonetas extends Vehiculo {

	
	private double longitud;

	
	@Override
	public String toString() {
		return "Furgonetas [longitud=" + longitud + "]";
	}

	public Furgonetas(String matricula, int tiempoEstacionado, double longitud) {
		super(matricula, tiempoEstacionado);
		this.longitud = longitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	
	
	@Override
	public double calcularPrecio(double cantidadFija, double cantidadExtraPorMetro) {
		
		double total=0;
		double tope=4;
		
		total=super.calcularPrecio(cantidadFija, cantidadExtraPorMetro);
		
		if(longitud >tope) {
			
			return total+((longitud-tope)*cantidadExtraPorMetro);
		}else {
			
			return total;
		}
	}
	
	
	public void avisarLongitud(double topeLongitud) {
		
		if(longitud>topeLongitud) {
			
			System.out.println("¡Cuidado, aparcar en zona especial!");
			
		}
		
		
	}
	
	
	
}
