//17. Realize um programa para uma empresa que deseja realizar um reajuste do salario de um funcionario, sendo:
//Dados: Salario < 15000: reajuste de 15%;
// Salario >= 15000: reajuste, mas <= 3000: reajuste de 10%;
// Salario de 3000:reajuste de 5%;
import java.util.Scanner;
public class ex17 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o valor od seu salario: ");
        Double salario = entrada.nextDouble();
        Double reajuste;
        Double Treajuste;

        if (salario < 15000){
            Treajuste = 0.15;
            reajuste = salario * Treajuste;
            System.out.println("O seu salario e: " + salario + ",e a taxa de reajuste e de: " + Treajuste + ". O seu novo salario e: " + reajuste);
        } else if (salario >= 15000 && salario <= 3000){
            Treajuste = 0.10;
            reajuste = salario * Treajuste;
            System.out.println("O seu salario e: " + salario + ", e a taxa de reajuste e de: " + Treajuste + ". O seu novo salario e: " + reajuste);
        } else if (salario > 3000){
            Treajuste = 0.5;
            reajuste = salario * Treajuste;
            System.out.println("O seu salario e: " + salario + ", e a taxa de reajuste e de: " + Treajuste + ". Oseu novo salario e: " + reajuste);
        } else {
            System.out.println("Entrada invalida.");
        }
    }
}