import java.io.IOException;
 
import java.util.Scanner;

public class Problema1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int valor = scan.nextInt();

        System.out.println(valor);
        calculandoValores(notas, valor);

        scan.close();
    }
    public static void calculandoValores(int[] notas, int valor) {
        for (int i=0; i<notas.length; i++) {
            int quantidade = valor / notas[i];
            System.out.println(quantidade +" nota(s) de R$ "+notas[i]+",00");
            valor %= notas[i];
        }
    }
}