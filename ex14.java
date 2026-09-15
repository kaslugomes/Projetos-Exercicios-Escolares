//14. Um comerciante quer vander os produtos que compra com as seguintes margens de lucro:
//Dados:45% de lucro se o valor for inferior a 340,00Mts;
//35% de lucro se o valor da compra for >= 340,00Mts e <680,00Mts;
//25% de lucro se o valor da compra for >= 680,00Mts e <1020,00Mts;
//15%de lucro se o valor da compra for >= 1020,00Mts;
import java.util.Scanner;
public class ex14{
	public static void main(String[]args){
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o valor do  porduto: ");
		Double preco = entrada.nextDouble();
		Integer Tlucro;
		
		if (preco < 340){
			Tlucro = 45;
			System.out.println("A taxa de lucro do produto de preco: " + preco + ", sera de: " + Tlucro + "%.");
		} else if (preco >= 340 && preco < 680){
			Tlucro = 35;
			System.out.println("A taxa de lucro do produto de preco: " + preco + ", sera de: " + Tlucro + "%.");
		} else if (preco >= 680 && preco < 1020){
				Tlucro = 25;
				System.out.println("A taxa de lucro do produto de preco: " + preco + ", sera de: " + Tlucro + "%.");
		} else if (preco >= 1020){
			Tlucro = 15;
			System.out.println("A taxa de lucro do produto de preco: " + preco + ", sera de: " + Tlucro + "%.");
		} else{
			System.out.println("Preco invalido.");
		}
	}
}