//3.Escreva um programa que imprima tres variaveis inteiras em ordem crescente.
import java.util.Scanner;
public class ex3 {
    public static void main(String[]args){

        Scanner  entrada = new Scanner(System.in);
        System.out.print("Insira o primeiro numero: ");
        int a = entrada.nextInt();
        System.out.print("Insira o segundo numero: ");
        int b = entrada.nextInt();
        System.out.print("Isnira o terceiro numero: ");
        int c =entrada.nextInt();

        int aux;
        if (a > b){
            aux = a;
            a = b;
            b = aux;
        }
        if (a > c){
            aux = a;
            a = c;
            c = aux;
        }
        if (b > c){
            aux = b;
            b = c;
            c = aux;
        }
        System.out.println("A ordem crescente das variaveis e: " + a + " " + b + " " + c);
    }
}