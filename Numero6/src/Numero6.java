import java.util.Scanner;

public class Numero6 {
    public static void main(String[] args) {
        Scanner pegar = new Scanner(System.in);
        
        System.out.println("Informe o salario bruto: ");
        float salario = pegar.nextFloat();
        
        System.out.println("Informe o valor da presta��o: ");
        float prestacao = pegar.nextFloat();
        
        if(prestacao <= (salario*0.3))
            System.out.println("Presta��o concedida com sucesso.");
        else
            System.out.println("Presta��o n�o concedida.");
    }
}