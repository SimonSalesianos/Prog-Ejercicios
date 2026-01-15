package ejercicio1;

public class Motos extends Vehiculo{
	
	
	private double centimetrosCubicos;

	public double getCentimetrosCubicos() {
		return centimetrosCubicos;
	}

	public void setCentimetrosCubicos(double centimetrosCubicos) {
		this.centimetrosCubicos = centimetrosCubicos;
	}

	public Motos(String matricula, int tiempoEstacionado, double centimetrosCubicos) {
		super(matricula, tiempoEstacionado);
		this.centimetrosCubicos = centimetrosCubicos;
	}

	@Override
	public String toString() {
		return "Motos [centimetrosCubicos=" + centimetrosCubicos + "]";
	}

	
	
	@Override
	public double calcularPrecio(double cantidadFija, double cantidadExtraPorMetro) {

		double total=0;
		double topeCC=250;
		int dos=2;
		
		if(centimetrosCubicos<topeCC) {
			
			return total=super.calcularPrecio(cantidadFija, cantidadExtraPorMetro)/dos;
			
		}else {
			
			return total=super.calcularPrecio(cantidadFija, cantidadExtraPorMetro);
			
		}		
		
	}
	
	
	
	
	
	
	
	

}
