/**
 Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de 
 vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de 
 comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com 
 duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla 
precisão (double) com duas casas decimais, representando o salário fixo do vendedor e 
montante total das vendas efetuadas por este vendedor, respectivamente.
 */


import java.io.IOException;
import java.util.Scanner; 

public class Problema1009 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner scan = new Scanner(System.in);
    
    String nomeVendedor = scan.nextLine();
    double salarioFixo = scan.nextDouble();
    double valorVendas = scan.nextDouble();
    
    double resultado = analise(salarioFixo, valorVendas);
    
    System.out.println(nomeVendedor);
    System.out.printf("TOTAL = %.2f\n", resultado);
    scan.close();
    }
    public static double analise(double sF, double vV) {
        double porcentagem = 0.15 * vV;
        double total = sF + porcentagem;
        
        return total;
    }
}