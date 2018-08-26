
import java.util.Scanner;

public class Numero1 {
	public static void main(String[] args) {
		
		Scanner pegar = new Scanner(System.in);
		
		System.out.println("Salario: ");
		float salario = pegar.nextFloat();
		
		System.out.println("percentual de aumento: ");
		float aumento = pegar.nextInt();
		
		aumento /= 100;
		
		float aumentoTotal = salario * aumento;
		
		salario += aumentoTotal;
		
		System.out.println("O salario teve um aumento de " + aumentoTotal + " e totalizou o total de R$"+salario);
	}
}
