//16. As macas cusstam 15,00Mts cada se forem compradas menos de uma duzia, e 12,00Mts se forem compradas pelo menos 12 unidades. Escreva um programa que leia o numero de macas compradas, calcule e imprima o custo total da compra.
import java.util.Scanner;
public class ex16 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o numero de macas: ");
        Integer Qmaca = entrada.nextInt();
        Integer preco; 

        if (Qmaca <= 12){
            preco = 15;
            Integer total = Qmaca * preco;
            System.out.println("O valor por unidade e de: " + preco + ", e o valor total e de: " + total);
        } else if (Qmaca > 12){
            preco = 12;
            Integer total = Qmaca * preco;
            System.out.println("O valor por unidade e de: " + preco + ", e o valor total e de: " + total);
        } else{
            System.out.println("Valor invalido.");
        }
    }
}
