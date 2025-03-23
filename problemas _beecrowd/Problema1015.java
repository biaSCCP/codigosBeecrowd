import java.util.Scanner;
public class Problema1015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        double resultado = calculando(x1, y1, x2, y2);

        System.out.printf("%.4f\n",resultado);
        scan.close();
    }
    public static double calculando(double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2 ) + Math.pow(y2 - y1, 2));
        return distancia;
    }
}
