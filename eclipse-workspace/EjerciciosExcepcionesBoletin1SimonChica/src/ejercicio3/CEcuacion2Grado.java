package ejercicio3;

public class CEcuacion2Grado {

	
	 	private double a;
	    private double b;
	    private double c;

	    public CEcuacion2Grado(double a, double b, double c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }

	    public double[] resolver() throws EcuacionDegeneradaException, RaicesComplejasException {
	    	
	        if (a == 0 && b == 0) {
	        	
	            throw new EcuacionDegeneradaException("La ecuación es degenerada (a=0 y b=0).");
	        }

	        if (a == 0) {
	        	
	            double x = -c / b;
	            return new double[] { x };
	            
	        }

	        double discriminante = (b * b) - (4 * a * c); 

	        if (discriminante < 0) {
	        	
	            throw new RaicesComplejasException("Las raíces son complejas (discriminante < 0)");
	            
	        }

	        double raizD = Math.sqrt(Math.abs(discriminante)); 
	        
	        double x1 = (-b + raizD) / (2 * a);
	        double x2 = (-b - raizD) / (2 * a);

	        return new double[] { x1, x2 };
	    }
}
