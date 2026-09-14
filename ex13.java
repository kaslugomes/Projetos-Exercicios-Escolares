//13. Elabore um programa para uma empresa que decidiu dar gratificacao de natal a seus funcionarios baseada no numero de horas extras e o numero de horas que o funcionario faltou ao trabalho. Informe o valor do premio, o valor do premio e obtido atraves da tablela abaixo, no qual usamos a formula:
//Formula: H = numero de horas extras - (2/3 * (numero de horas faltadas))
//Dados: H (minutos) | Premio
// >= 2400 | 6000Mts
// 1800 a  2400 | 4800Mts
// 1200 a 1800 | 3600Mts
// 600 a 1200 | 2400Mts
// > 600 | 1200Mts
import java.util.Scanner;
public class ex13 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o numero de horas extras: ");
        int horasExtras = entrada.nextInt();
        System.out.print("Insira o numero de horas faltadas: ");
        int horasFaltadas = entrada.nextInt();
        int H = horasExtras - (2 * horasFaltadas /3);

        if (H >= 2400){
            System.out.println("O valor do premio e: 6000Mts");
        } else if (H >= 1800 && H < 2400){
            System.out.println("O valor do premio e: 4800Mts");
        } else if (H >= 1200 && H < 1800){
            System.out.println("O valor do premio e: 3600Mts");
        } else if (H >= 600 && H < 1200){
            System.out.println("O valor do premio e: 2400Mts");
        } else {
            System.out.println("O valor do premio e: 1200Mts");
        }
    }
}
