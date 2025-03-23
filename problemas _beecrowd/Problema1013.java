import java.util.Scanner;
public class Problema1013 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);


       int a = scan.nextInt();
       int b = scan.nextInt();
       int c = scan.nextInt();

       int resultado = calculando(a, b, c);
       System.out.println(resultado + " eh o maior");
       scan.close();
    }
    public static int calculando(int a, int b, int c) {
        int maiorAB = (a + b +Math.abs(a-b))/2;
        int maiorC = (maiorAB + c + Math.abs(maiorAB -c))/2;
        return maiorC;
    }
}
