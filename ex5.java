
import java.util.Scanner;

//5.Faca um programa que leia a idade e o tempo de servico de um trabalhador e escreva se ele pode ou nao se aposentar.
//Dados: Ter pelo menos 65, ou ter trabalhado pelon= menos 30 anos, ou ter pelo menos 60 anos e trabalhadopelo menos 25 anos.
public class ex5 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira a sua idade: ");
        int idade = entrada.nextInt();
        System.out.print("Insira otempo de servico: ");
        int tempo = entrada.nextInt();

        if (idade >= 65 || tempo >= 30 || idade >= 60 && tempo >= 25){
            System.out.println("Pode se aposentar.");
        } else {
            System.out.println("Nao pode se aposentar.");
        }
    }
}
