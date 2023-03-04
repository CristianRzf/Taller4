import java.util.Scanner;

public class Punto7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido a la Calculadora de Pintura");
        System.out.println("Ingrese la altura de la habitación en metros: ");
        double altura = sc.nextDouble();
        
        System.out.println("Ingrese el largo de la habitación en metros: ");
        double largo = sc.nextDouble();
        
        System.out.println("Ingrese el ancho de la habitación en metros: ");
        double ancho = sc.nextDouble();
        
        double areaParedes = (2 * altura * largo) + (2 * altura * ancho);
        double areaTecho = largo * ancho;
        double areaTotal = areaParedes + areaTecho;
        
        System.out.println("El área total a pintar es de: " + areaTotal + " metros cuadrados.");
        
        int botes5L = (int) Math.ceil(areaTotal / 1500);
        double costo5L = botes5L * 15.0;
        
        int botes1L = (int) Math.ceil(areaTotal / 300);
        double costo1L = botes1L * 4.0;
        
        System.out.println("Para pintar la habitación necesitará:");
        System.out.println("- " + botes5L + " botes de 5L, con un costo de $" + costo5L);
        System.out.println("- " + botes1L + " botes de 1L, con un costo de $" + costo1L);
        
        int botesOptimos = (int) Math.ceil(areaTotal / 1875);
        double costoOptimo = botesOptimos * 20.0;
        
        System.out.println("Para minimizar el costo, debería comprar " + botesOptimos + " botes de 5L y " 
                + (botesOptimos * 3) + " botes de 1L, con un costo total de $" + costoOptimo);
        
    }

}