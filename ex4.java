//4.Crie uma variavel que contendoa idade de uma pessoa e verifique sua classe eleitora;
//Dados:(ate 16anos-nao eleitor, entre 16e 18 anos ou mais de 65 e facultativo, entre 18ca 65 anos e obrigatorio)
import java.util.Scanner;
public class ex4 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira a sua idade: ");
        int idade = entrada.nextInt();
        if (idade <16){
            System.out.println("Nao pode votar.");
        } else if (idade >= 16 && idade <18 ||idade > 65){
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("Voto obrigatorio.");
        }
    }
}