//7. Escreva um programa que dada a idade de um nadador, classifique-o em uma das seguintes categorias:
//Dados: infatil A = 5 a 7 anos
//infantil B = 8 a 10 anos
//juvenil A = 11 a 13 anos
//juvenil B = 14 a 17 anos
//adulto maiores de 28 anos
import java.util.Scanner;

public class ex7 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira a sua idade: ");
        int idade = entrada.nextInt();

        if (idade >= 5 && idade <= 7){
            System.out.println("A categoria do nadador e: Infantil A.");
        } else if (idade >= 8 && idade <= 10){
            System.out.println(" A categoria do nadador e: Infantil B.");
        } else if (idade >= 11 && idade <= 13){
            System.out.println("A categoria do nadador e: Juvenil A.");
        } else if (idade >= 14 && idade <= 17){
            System.out.println("A categoria do nadador e: Juvenil B.");
        } else if (idade >= 18){
            System.out.println("A categoria do nadador e: Adulto.");
        } else {
            System.out.println("Idade invalida.");
        }
    }

}
