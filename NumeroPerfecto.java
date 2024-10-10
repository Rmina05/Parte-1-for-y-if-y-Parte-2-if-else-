import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número para verificar si es perfecto: ");
        int numero = scanner.nextInt();
        
        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }

        scanner.close();
    }

    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = calcularSumaDivisores(numero);
        
        return sumaDivisores == numero;
    }

    public static int calcularSumaDivisores(int numero) {
        int suma = 0;
     
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        
        return suma; 
    }
}
