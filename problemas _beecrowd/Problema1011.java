import java.util.Scanner;
public class Problema1011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();
        double pi = 3.14159;
        double resultado = calculando(raio, pi);

        System.out.printf("VOLUME = %.3f\n", resultado);
        scan.close();

    }
    public static double calculando(double valRaio, double pi) {
        double volume = (4.0/3) * pi * Math.pow(valRaio, 3);

        return volume;
    }
}