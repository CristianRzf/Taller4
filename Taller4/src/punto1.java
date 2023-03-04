
public class punto1 {
	public static void main(String[] args) {
        int x = 5;
        boolean resultado1 = (x <= 7) ? true : false;
        boolean resultado2;
        if (x <= 7) {
            resultado2 = true;
        } else {
            resultado2 = false;
        }

        System.out.println("Usando el operador ternario: " + resultado1);
        System.out.println("Usando la sentencia if/else: " + resultado2);
    }
}
