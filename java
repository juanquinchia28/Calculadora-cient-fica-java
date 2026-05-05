import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static double resultado = 0;
    static ArrayList<String> historial = new ArrayList<String>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("===========Bienvenido a la Calculadora====================");

        do {
            System.out.println("Elige una opción \n1.Sumar\n2.Restar \n3.Multiplicar \n4.Dividir");
            System.out.println("5.Raíz \n6.Potencia \n7.Seno \n8.Coseno");
            System.out.println("9.Historial \n0.Salir");
            System.out.print("Opción: ");
            op = sc.nextInt();

            double a, b;

            switch (op) {

                case 1:
                    System.out.println("SUMA (a + b)");
                    System.out.print("Ingresa número 1: ");
                    a = sc.nextDouble();
                    System.out.print("Ingresa número 2: ");
                    b = sc.nextDouble();
                    resultado = a + b;
                    historial.add(a + " + " + b + " = " + resultado);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    System.out.println("RESTA (a - b)");
                    System.out.print("Ingresa número 1: ");
                    a = sc.nextDouble();
                    System.out.print("Ingresa número 2: ");
                    b = sc.nextDouble();
                    resultado = a - b;
                    historial.add(a + " - " + b + " = " + resultado);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    System.out.println("MULTIPLICACIÓN (a * b)");
                    System.out.print("Ingresa número 1: ");
                    a = sc.nextDouble();
                    System.out.print("Ingresa número 2: ");
                    b = sc.nextDouble();
                    resultado = a * b;
                    historial.add(a + " * " + b + " = " + resultado);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:
                    System.out.println("DIVISIÓN (a / b)");
                    System.out.print("Ingresa número 1: ");
                    a = sc.nextDouble();
                    System.out.print("Ingresa número 2: ");
                    b = sc.nextDouble();
                    if (b != 0) {
                        resultado = a / b;
                        historial.add(a + " / " + b + " = " + resultado);
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: división por cero");
                    }
                    break;

                case 5:
                    System.out.println("RAÍZ CUADRADA √a");
                    System.out.print("Ingresa el número: ");
                    a = sc.nextDouble();
                    resultado = Math.sqrt(a);
                    historial.add("√" + a + " = " + resultado);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 6:
                    System.out.println("POTENCIA (a ^ b)");
                    System.out.print("Ingresa la base: ");
                    a = sc.nextDouble();
                    System.out.print("Ingresa el exponente: ");
                    b = sc.nextDouble();
                    resultado = Math.pow(a, b);
                    historial.add(a + "^" + b + " = " + resultado);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 7:
                    System.out.println("SENO sen(a)");
                    System.out.print("Ingresa el número (en radianes): ");
                    a = sc.nextDouble();
                    resultado = Math.sin(a);
                    historial.add("sen(" + a + ") = " + resultado);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 8:
                    System.out.println("COSENO cos(a)");
                    System.out.print("Ingresa el número (en radianes): ");
                    a = sc.nextDouble();
                    resultado = Math.cos(a);
                    historial.add("cos(" + a + ") = " + resultado);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 9:
                    System.out.println("HISTORIAL:");
                    System.out.println(historial);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (op != 0);

        sc.close();
    }
}
