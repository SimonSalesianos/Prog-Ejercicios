package ejercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	
    	
    	
        Scanner sc = new Scanner(System.in);
        

        try {
        	
            System.out.print("Introduce a: ");
            double a = Double.parseDouble(sc.nextLine());

            System.out.print("Introduce b: ");
            double b = Double.parseDouble(sc.nextLine());

            System.out.print("Introduce c: ");
            double c = Double.parseDouble(sc.nextLine());

            CEcuacion2Grado eq = new CEcuacion2Grado(a, b, c);

            double[] soluciones = eq.resolver(); 

            if (soluciones.length == 1) {
                System.out.printf("Ecuación de 1er grado. Raíz única: %.4f%n", soluciones[0]);
                
            } else {
            	
                System.out.printf("Raíz 1: %.4f%n", soluciones[0]);
                System.out.printf("Raíz 2: %.4f%n", soluciones[1]);
            }

        } catch (NumberFormatException e) {
            System.err.println("Debes introducir números válidos (usa punto para decimales).");
        } catch (EcuacionDegeneradaException e) {
            System.err.println(e.getMessage());
        } catch (RaicesComplejasException e) {
            System.err.println(e.getMessage());
        } finally {
        	
        	
            sc.close();
        }
    }
}
