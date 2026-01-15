package ejercicio4;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Administracion {
	
	
	private List<Empleado> empleados;
	

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Administracion(List<Empleado> empleados) {
		super();
		this.empleados = empleados;
	}

	
	
	
	
	public List<Empleado> obtenerEmpleadosActivosConSalarioSuperior(){
		
		return empleados.stream().filter(null)
		
		
		
	}
	
	
	
	public Optional<Empleado> buscarEmpleadoPorNombre(String nombre){
		
		
		return empleados.stream().findAny(empleados -> empleados.getNombre())
				.collect(Collectors.toList());
		
		
	}

}
