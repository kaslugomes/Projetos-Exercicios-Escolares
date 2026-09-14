//8. Um banco concedera um credito especial aos seus clientes, variavel com o saldo medio no ultimo ano. Faca um programa que, para o saldo de 3.500,00Mtde um client, calcule o valor do credito e mostre uma mensagem informando o saldomedio e o valor do credito de acordo com as seguintes condicoes:
//Dados:
// Saldo medio percentual de 0 a 200 nenhum credito
// Saldo de 201 a 400 tera 20% do valor do saldo medio
// Saldo de 401 a 600 tera 30% do valor do saldo medio
// Saldo acima de 601 tera 40% do valor do saldo medio
import java.util.Scanner;
public class ex8 { 
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o seu saldo medio: ");
        double saldo = entrada.nextDouble();
        double credito = 0.0;
    
        if (saldo >= 0 && saldo <= 200){
            System.out.println("Saldo medio: " + saldo + " Nenhum credito concedido. ");
        } else if (saldo >= 201 && saldo <= 400){
            System.out.println("Saldo medio: " + saldo + " credito concedido: " + (saldo * 0.2));
        } else if (saldo >= 401 && saldo <= 600){
            System.out.println("Saldo medio: " + saldo + " credito concedido: " + (saldo * 0.3));
        } else if (saldo >= 601){
            System.out.println("Saldo medio: " + saldo + " credito concedido: " + (saldo * 0.4));
        } else {
            System.out.println("Saldo invalido.");
        }
    }
}