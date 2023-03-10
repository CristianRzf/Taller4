import java.util.Scanner;

public class Punto4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Introduzca su peso en la Tierra en libras: ");
		double pesoEnTierra = input.nextDouble();

		System.out.println("Seleccione un planeta del sistema solar:");
		System.out.println("1. Mercurio");
		System.out.println("2. Venus");
		System.out.println("3. Marte");
		System.out.println("4. Júpiter");
		System.out.println("5. Saturno");
		System.out.println("6. Urano");
		System.out.println("7. Neptuno");

		System.out.print("Introduzca el número del planeta: ");
		int opcion = input.nextInt();

		double factorConversion = 0.0;
		String nombrePlaneta = "";

		switch (opcion) {
		case 1:
			factorConversion = 0.38;
			nombrePlaneta = "Mercurio";
			break;
		case 2:
			factorConversion = 0.91;
			nombrePlaneta = "Venus";
			break;
		case 3:
			factorConversion = 0.38;
			nombrePlaneta = "Marte";
			break;
		case 4:
			factorConversion = 2.36;
			nombrePlaneta = "Júpiter";
			break;
		case 5:
			factorConversion = 0.92;
			nombrePlaneta = "Saturno";
			break;
		case 6:
			factorConversion = 0.89;
			nombrePlaneta = "Urano";
			break;
		case 7:
			factorConversion = 1.13;
			nombrePlaneta = "Neptuno";
			break;
		default:
			System.out.println("Opción inválida. Saliendo del programa.");
			System.exit(0);
		}

		double pesoEnPlaneta = pesoEnTierra * factorConversion;

		System.out.printf("Su peso en %s es %.2f libras.\n", nombrePlaneta, pesoEnPlaneta);
	}
}
