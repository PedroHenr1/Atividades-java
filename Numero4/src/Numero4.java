import java.util.Scanner;

public class Numero4 {
	public static void main(String[] args) {
		Scanner pegar = new Scanner(System.in);
		
		while(true){
			System.out.println("Nome do funcionario: ");
			String nome = pegar.nextLine();
			
			if(nome.equalsIgnoreCase("fim")) break;
				
			System.out.println("Salario do funcionario: ");
			int salario = Integer.parseInt(pegar.nextLine());
			
			if(salario < 500 && salario > 0){
				salario *= 1.2;
				System.out.println("Salario reajustado em 20%: "+salario);
			}else{
				System.out.println("Sem aumento");
			}
		}
	
	}
}