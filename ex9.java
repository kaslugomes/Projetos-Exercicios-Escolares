
import java.util.Scanner;

//9. Faca um programa para simular uma calculadora que permite calcular a soma, subtracao, multiplicacao e divisao de dois numeros e exiba para o usuario o resultado da operacao selecionada.
public class ex9 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
         System.out.print("Insira o primeiro numero: ");
            double a = entrada.nextDouble();
         System.out.print("Insira o segundo numero: ");
            double b = entrada.nextDouble();
         System.out.print("Escolha a operacao a ser realizada (1 - Soma, 2 - Subtracao, 3 - Multiplicacao, 4 - Divisao): ");
            int opcao = entrada.nextInt();
                double resultado = 0.0;

        switch (opcao) {
            case 1:
                resultado = a + b;
                break;
            case 2:
                resultado = a - b;
                break;
            case 3:
                resultado = a * b;
                break;
            case 4:
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: Divisao por zero nao e permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Opcao invalida.");
                return;
        }
        System.out.println("O resultado da operacao e: " + resultado);
    }
}
