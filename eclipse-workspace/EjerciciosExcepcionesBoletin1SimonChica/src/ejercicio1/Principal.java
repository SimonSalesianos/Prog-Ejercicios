package ejercicio1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int opcion;
        int a = 0, b = 0;
        
        do {
            System.out.println(" CALCULADORA ENTERA ");
            System.out.println("0. Salir");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Raíz cuadrada");
            
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            
            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Primer número: ");
                        a = sc.nextInt();
                        System.out.print("Segundo número: ");
                        b = sc.nextInt();
                        System.out.println("Resultado: " + calc.sumar(a, b));
                        break;
                    case 2:
                        System.out.print("Primer número: ");
                        a = sc.nextInt();
                        System.out.print("Segundo número: ");
                        b = sc.nextInt();
                        System.out.println("Resultado: " + calc.restar(a, b));
                        break;
                    case 3:
                        System.out.print("Primer número: ");
                        a = sc.nextInt();
                        System.out.print("Segundo número: ");
                        b = sc.nextInt();
                        System.out.println("Resultado: " + calc.multiplicar(a, b));
                        break;
                    case 4:
                        System.out.print("Dividendo: ");
                        a = sc.nextInt();
                        System.out.print("Divisor: ");
                        b = sc.nextInt();
                        System.out.println("Resultado: " + calc.dividir(a, b));
                        break;
                    case 5:
                        System.out.print("Número: ");
                        a = sc.nextInt();
                        System.out.println("Resultado: " + calc.raizEntera(a));
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: no se puede dividir entre cero.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();
        } while (opcion != 0);
        sc.close();
    }
}
