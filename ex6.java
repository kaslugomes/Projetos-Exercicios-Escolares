//6. Faca um programa que leia tres numeros inteiro positivos e efetue o calculo de uma das seguintes medias de acordo com o valor numerico digitado pelo usuario
//1. Geometrica: (a*b*c)^(1/3)
//2. Ponderada: (a + 2*b + 3*c)/6
//3. Harmonica: 1/(1/a + 1/b + 1/c)
//4. Aritmetica: (a + b + c)/3
import java.util.Scanner;
public class ex6 {
    public static void main(String[]args, double d){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o primeiro numero: ");
        int a = entrada.nextInt();
        System.out.print("Insira o segundo numero: ");
        int b = entrada.nextInt();
        System.out.print("Insira o terceiro numero: ");
        int c = entrada.nextInt();
        
        System.out.println("Escolha o tipo de media a calcular:");
        System.out.println("1. Geometrica.");
        System.out.println("2. Ponderada.");
        System.out.println("3. Harmonica.");
        System.out.println("4. Aritmetrica.");
        int escolha = entrada.nextInt();
        double media = 0.0;

        switch (escolha){
            case  1 -> {
                media = Math.pow(a * b * c, 1.0 / 3 );
                System.out.println("A media geometrica e: " + media);
            }

            case 2 -> {
                media = (a + 2 * b + 3 * c) / 6.0;
                System.out.println("A media ponderada e: " + media);
            }

            case 3 -> {
                media = 1.0 / (1.0 / a + 1.0 / b + 1.0 / c);
                System.out.println("A media harmonica e: " + media);
            }

            case 4 -> {
                media = (a + b + c) / 3.0;
                System.out.println("A media aritmetica e: " + media);
            }
            default -> System.out.println("Opcao invalida.");
            
        }
    }
}
