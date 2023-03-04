import java.util.Scanner;

public class punto2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduzca el primer número: ");
		double numero1 = scanner.nextDouble();

		System.out.print("Introduzca el segundo número: ");
		double numero2 = scanner.nextDouble();

		System.out.print("Introduzca el operador (+, -, *, /, %): ");
		String operador = scanner.next();

		// Utilizar la lógica switch para realizar la operación
		switch (operador) {
		case "+":
			System.out.println(numero1 + numero2);
			break;
		case "-":
			System.out.println(numero1 - numero2);
			break;
		case "*":
			System.out.println(numero1 * numero2);
			break;
		case "/":
			System.out.println(numero1 / numero2);
			break;
		case "%":
			System.out.println(numero1 % numero2);
			break;
		default:
			System.out.println("Operador no válido.");
		}

		// Utilizar la lógica if/else para realizar la operación
		if (operador.equals("+")) {
			System.out.println(numero1 + numero2);
		} else if (operador.equals("-")) {
			System.out.println(numero1 - numero2);
		} else if (operador.equals("*")) {
			System.out.println(numero1 * numero2);
		} else if (operador.equals("/")) {
			System.out.println(numero1 / numero2);
		} else if (operador.equals("%")) {
			System.out.println(numero1 % numero2);
		} else {
			System.out.println("Operador no válido.");
		}
	}
}
