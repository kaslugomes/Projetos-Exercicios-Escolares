//15. Para cada produto informado(nome,preco e quantidade), escreva o nome do produto comprado e o valor total a ser pago,considerando que sao oferecidos descontos pelo numero de unidade compradas, segundo a tabela abaixo:
//Dados: a) Ate 10 unidades: valor total;
//b) de 11 a 20 unidades: 10% de desconto;
//c) de 21 a 50 unidades: 20% de desconto;
//d) <50 unidades: 25% de desconto;
import java.util.Scanner;
public class ex15 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o nome do produto: ");
        @SuppressWarnings("unused")
        String nome = entrada.next();
        System.out.print("Insira o preco do produto: ");
        Double preco = entrada.nextDouble();
        System.out.print("Insira a quantidade do produto: ");
        Integer quantidade = entrada.nextInt();
        Double total = preco * quantidade;

        if (quantidade <= 10){
            System.out.println("O valot total comprado e de: " + total);
            System.out.println("Quantidade insuficiente para desconto.");
        } else if (quantidade >= 11 && quantidade < 20){
            Double descont = 0.10 * total;
            Double totalDesc = total - descont;
            System.out.println("O valor total comprado e de: " + totalDesc);
        } else if (quantidade >= 21 && quantidade < 50){
            Double descont = 0.20 * total;
            Double totalDesc = total - descont;
            System.out.println("O valor total comprado e de: " + total);
            System.out.print("O valor com o desconto aplicado e de: " + totalDesc);
        } else {
            Double descont = 0.25 * total;
            Double totalDesc = total - descont;
            System.out.println("O valor total comprado e de: " + total);
            System.out.print("O valor com o desconto aplicado e de: " + totalDesc);
        }
    }
}
