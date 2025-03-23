/**
 Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário
  de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça
   2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente
 dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um 
espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas
 após o ponto.
 */


import java.io.IOException;
import java.util.Scanner; 

public class Problema1010 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner scan = new Scanner(System.in);
    
    int codigoP1 = scan.nextInt();
    int qtdPecas1 = scan.nextInt();
    double valPorPeca1 = scan.nextDouble();
    
    int codigoP2 = scan.nextInt();
    int qtdPecas2 = scan.nextInt();
    double valPorPeca2 = scan.nextDouble();
    
    Double resultado1 = valor1(qtdPecas1, valPorPeca1);
    Double resultado2 = valor2(qtdPecas2, valPorPeca2);
    
    Double total = resultado1 + resultado2;
    
    System.out.println(codigoP1 + codigoP2);
    System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    
    scan.close();
    }
    public static double valor1(double qtd1, double val1) {
        double primeiroValor = qtd1 * val1;
        
        return primeiroValor;
    }
    
    public static double valor2(double qtd2, double val2) {
        double segundoValor = qtd2 * val2;
        
        return segundoValor;
    }
}