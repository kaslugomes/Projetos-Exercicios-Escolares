//1.Escreva um programa que informa se o numero e par ou impar.
import java.util.Scanner;
public class Ex1 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o numero: ");
        int numero=entrada.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero e par.");
        } else{
            System.out.println("O numero e impar.");
        }
    }
}