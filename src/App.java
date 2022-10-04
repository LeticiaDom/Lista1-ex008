import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double salario, horas, salm;

        Scanner sc = new Scanner(System.in); 
        System.out.print("Quanto você ganha por hora? ");
        salario = sc.nextDouble();
        System.out.print("Quantas horas você trabalha por mês? ");
        horas = sc.nextDouble(); 
        sc.close(); 

        salm = salario * horas;

        System.out.println("O salário que você recebe no mês é: " + salm);

    }
}
