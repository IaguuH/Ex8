import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Double gHora, horaMes, salario;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? ");
        gHora = teclado.nextDouble();

        System.out.print("Quantas horas você trabalha por mês? ");
        horaMes = teclado.nextDouble();
        
        salario = gHora * horaMes;
        System.out.print("Seu salário mensal é de - "+ salario);

    }
}
