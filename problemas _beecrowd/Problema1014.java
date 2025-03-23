import java.util.Scanner;

public class Problema1014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        double y = scan.nextDouble();

        double resultado = calculando(x, y);

        System.out.printf("%.3f km/l\n", resultado);
        scan.close();
    }
    public static double calculando(int distancia, double combustivel) {
        double result = distancia / combustivel;
        return result;
    }
}
