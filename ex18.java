//18. Faca um porgrama para aprovar emprestimos bancarios. O codigo deve ter tres informacoes:
//Dados: Valor do emprestimo;
// Numero de parcelas;
// Salario do solicitante;
import java.util.Scanner;
public class ex18 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o seu salario: ");
        Double salario = entrada.nextDouble();
        System.out.print("Insira o valor do emprestimo: ");
        Double emprestimo = entrada.nextDouble();
        System.out.print("Insira o numero de parcelas: ");
        Integer parcelas = entrada.nextInt();
        Double valorParcela = emprestimo / parcelas;

        if (valorParcela > (0.30 * salario)){
            System.out.println("O emprestimo nao foi aprovado, pois o valor da parcela e de: " + valorParcela + ", e o seu salario e de: " + salario + ". O valor da parcela nao pode ultrapassar 30% do seu salario.");
        } else if (valorParcela <= (0.30 * salario)){
            System.out.println("O emprestimo foi aprovado, pois o valor da parcela e de: " + valorParcela + ", e o seu salario e de: " + salario + ". O valor da parcela nao ultrapassa 30% do seu salario.");
        } else{
            System.out.println("Entrada invalida.");
        }
    }
}
