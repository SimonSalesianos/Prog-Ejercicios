package ejercicio1;

public class Vehiculo {
	
	private String matricula;
	private int tiempoEstacionado;
	
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getTiempoEstacionado() {
		return tiempoEstacionado;
	}
	public void setTiempoEstacionado(int tiempoEstacionado) {
		this.tiempoEstacionado = tiempoEstacionado;
	}
	public Vehiculo(String matricula, int tiempoEstacionado) {
		super();
		this.matricula = matricula;
		this.tiempoEstacionado = tiempoEstacionado;
	}
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", tiempoEstacionado=" + tiempoEstacionado + "]";
	}
	
	
	
	
	public  double calcularPrecio(double cantidadFija, double cantidadExtraPorMetro) {
		
		double total=0;
		
		total=tiempoEstacionado*cantidadFija;
		
		return total;
		
	};
	
	
	
	

}
