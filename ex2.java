//2.Escreav um programam que a partir de tres variaveis inteiras descubra o maior entre elas.
import java.util.Scanner;
public class ex2 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o primeiro numero: ");
        int a = entrada.nextInt();
        System.out.print("Insira o segundo numero: ");
        int b = entrada.nextInt();
        System.out.print("Insira o terceiro numero: ");
        int c = entrada.nextInt();
        
        if (a >= b && a >=c){
            System.out.println("O maior numero e: " + a);
        } else if (b >= a && b >= c){
            System.out.println("O maior numero e: " + b);
        } else {
            System.out.println("O maior numero e: " + c);
        }
    }
}
