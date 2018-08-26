import java.util.Scanner;

public class Numero3 {
	public static void main(String[] args) {
		Scanner pegar = new Scanner(System.in);
		
		System.out.println("Tabuada de?: ");
		int num = pegar.nextInt();
		
		for(int i=1;i < 11; i++){
			System.out.println(num+"x"+i+"= "+num*i);
		}
		
	}
}