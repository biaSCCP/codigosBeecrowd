/**
 Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo
  o seu resultado na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente
   mensagem alguma além daquilo que está sendo especificado e não esqueça de imprimir o fim de 
   linha após o resultado, caso contrário, você receberá "Presentation Error".

Entrada
A entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de 
linha. 
 */


import java.io.IOException;
import java.util.Scanner;
public class Problema1001 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    
    int X = A + B;
    
    System.out.println("X = " + X);
    scan.close();
    }
 
}