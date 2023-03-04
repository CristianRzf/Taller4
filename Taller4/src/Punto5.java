import java.util.Scanner;

public class Punto5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bienvenido al programa de admisión de la Universidad de Mountville.");
        System.out.print("Por favor ingrese su clasificación en el instituto: ");
        int clasificacion = input.nextInt();
        System.out.print("Por favor ingrese su nota media: ");
        double notaMedia = input.nextDouble();
        System.out.print("Por favor ingrese su puntuación SAT: ");
        int puntuacionSAT = input.nextInt();
        
        boolean cumpleRequisitos = false;
        
        if (clasificacion == 1 || clasificacion == 2) {
            System.out.println("¡Felicidades! Cumple con el primer criterio de admisión.");
            cumpleRequisitos = true;
        } else if (notaMedia >= 4.0 && puntuacionSAT >= 1100) {
            System.out.println("¡Felicidades! Cumple con el segundo criterio de admisión.");
            cumpleRequisitos = true;
        } else if (notaMedia >= 3.5 && puntuacionSAT >= 1300) {
            System.out.println("¡Felicidades! Cumple con el tercer criterio de admisión.");
            cumpleRequisitos = true;
        } else if (notaMedia >= 3.0 && puntuacionSAT >= 1500) {
            System.out.println("¡Felicidades! Cumple con el cuarto criterio de admisión.");
            cumpleRequisitos = true;
        }
        
        if (cumpleRequisitos) {
            System.out.println("¡Felicitaciones! Cumple con los requisitos para la admisión a la Universidad de Mountville.");
        } else {
            System.out.println("Lo sentimos, no cumple con los requisitos para la admisión a la Universidad de Mountville.");
        }
        
    }

}
