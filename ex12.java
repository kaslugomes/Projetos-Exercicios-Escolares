//12. Escreva um porgrama para ler 3 notas de um aluno e informar se o esta aprovado, reprovado ou se devera realizar o exame final.
//Dados: O aluno sera aprovado se a media das 3 notas for >14;
// O aluno sera reprovado se a media das suas notas for <10;
//O aluno devera reaizar o exame final se a media das suas notas for >=10 && <14;
import java.util.Scanner;
public class ex12 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira a primeira notas: ");
        Double nota1 = entrada.nextDouble();
        System.out.print("Insira a segunda nota: ");
        Double nota2 = entrada.nextDouble();
        System.out.print("Insira a terceira nota: ");
        Double nota3 = entrada.nextDouble();
        Double media = (nota1 + nota2 + nota3) / 3;

        if (media > 14){
            System.out.println("O aluno esta aprovado com media: " + media + " .");
        } else if (media < 10){
            System.out.println("O aluno esta reprovado com media: " + media + " .");
        } else if (media >= 10 && media < 14){
            System.out.println("O aluno devera realizar o exame final, e vai com media: " + media + " .");
        } else {
            System.out.println("Media invalida.");
        }
    }
}
