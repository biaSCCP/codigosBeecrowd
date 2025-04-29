import java.util.Scanner;

public class Problema1019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tempoDuracao = scan.nextInt(); 
        calculandoTempo(tempoDuracao);
        scan.close();
    }
    
    public static void calculandoTempo(int duracao) {
        int horas = duracao / 3600;
        int resto = duracao % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;
        
        System.out.println(horas + ":" + minutos + ":" + segundos); // Saída sem formatação extra
    }
}