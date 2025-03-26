import java.util.Scanner;
public class Problema1016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int carrox = 60;
        int carroy = 90;
        int distancia = scan.nextInt();

        int resultado = resultDistancia(carrox, carroy, distancia);
        System.out.println(resultado + " minutos");
        scan.close();
    }
    public static int resultDistancia(int x, int y, int quilometros) {
        int diferencaVelocidade = y - x;
        int resultado = (quilometros * 60) / diferencaVelocidade;

        return resultado;
    }
}