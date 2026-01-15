package ejemplo1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[ ] = new int[3];
		for ( int i = 0; i<= 3; i++){
			a [i] = i;
			}
		metodo(a);
		
		

	}

	private static void metodo(int b [] ) {
		b [2] = 1 / b[0];
		
	}

}
