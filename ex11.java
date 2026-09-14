//11. Escreva um programa para ler 3 notas diferentes de um aluno e informar o valor da sua maior nota. Informando tambem se a maior nota foi a primeira, segunda ou a terceira.
import java.util.Scanner;
public class ex11 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira a primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Insira a segunda nota: ");
        Double nota2 = entrada.nextDouble();
        System.out.print("Insira a terceira nota: ");
        Double nota3 = entrada.nextDouble();

        if (nota1 > nota2 && nota1 > nota3){
            System.out.println("A maior nota e: " + nota1 + " e foi a primeira nota.");
        } else if (nota2 > nota1 && nota2 > nota3){
            System.out.println("A maior nota e: " + nota2 + " e foi a segunda nota.");
        } else {
            System.out.println("A maior nota e: " + nota3 + " e foi a terceira nota.");
        }   
    }
}
