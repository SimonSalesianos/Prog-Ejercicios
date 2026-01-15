package ejemplo2;

public class Principal {

	public static void main(String[] args) {

		
		
		
		int num=10;
		int den=0;
		double res=0;
		
		
		try {
			
			res=num/den;
			System.out.printf("La división es: %.2f", res);
			
			
			
		}catch (Exception e) {
			
			System.err.println("¡Estás dividiendo por 0!");
			
		}
		
		
		
		
		
		
	}

}
