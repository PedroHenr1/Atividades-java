import java.util.Scanner;

public class Numero2 {
	public static void main(String[] args) {
		Scanner pegar = new Scanner(System.in);
		
		int valor;
		for(int i=1;i < 11;i++){
			System.out.println("Informe o valor " + i);
			valor = pegar.nextInt();
			if(valor%2 == 0){
				System.out.println("Numero par\n");
			}else{
				System.out.println("Numero impar\n");
			}
		}
		
	}
}
