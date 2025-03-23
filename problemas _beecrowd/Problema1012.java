import java.util.Scanner;
public class Problema1012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valorA = scan.nextDouble();
        double valorB = scan.nextDouble();
        double valorC = scan.nextDouble();

        double resultadoT = calculandoTriangulo(valorA,valorC);
        double resultadoC = calculandoCirculo(valorC);
        double resultadoTr = calculandoTrapezio(valorA, valorB, valorC);
        double resultadoQ = calculandoQuadrado(valorB);
        double resultadoR = calculandoRetangulo(valorA, valorB);

        	
        System.out.printf("TRIANGULO: %.3f\n", resultadoT);
        System.out.printf("CIRCULO: %.3f\n", resultadoC);
        System.out.printf("TRAPEZIO: %.3f\n", resultadoTr);
        System.out.printf("QUADRADO: %.3f\n", resultadoQ);
        System.out.printf("RETANGULO: %.3f\n", resultadoR);
        
        scan.close();
    }
    public static double calculandoTriangulo(double a, double c) {
        double area = (a * c) / 2;
        return area;
    }
    public static double calculandoCirculo(double c) {
        double pi = 3.14159;
        double area = pi * Math.pow(c, 2);
        return area;
    }
    public static double calculandoTrapezio(double a, double b, double c) {
        double area = (a + b) * c / 2;
        return area;
    }
    public static double calculandoQuadrado(double b) {
        double area = Math.pow(b, 2);
        return area;
    }
    public static double calculandoRetangulo(double a, double b) {
        double area = a * b;
        return area;
    }
}
