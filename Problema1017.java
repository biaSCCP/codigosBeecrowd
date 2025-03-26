import java.io.IOException;

import java.util.Scanner;
public class Problema1017 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        
        int tempoGasto = scan.nextInt();
        int velocidadeMedia = scan.nextInt();
        
        double resultado = calculandoGasto(tempoGasto, velocidadeMedia);
        System.out.printf("%.3f\n", resultado);
        scan.close();
    }
    public static double calculandoGasto(int tpGasto, int velMedia) {
       double distancia = tpGasto * velMedia;
       double consumo = distancia /12.0;
        return consumo;
    }
}