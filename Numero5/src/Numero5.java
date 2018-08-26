import java.util.Scanner;

public class Numero5 {
    public static void main(String[] args) {
        Scanner pegar = new Scanner(System.in);
        
        double precoLitro = 2.5;
        double refrigerante = 3.0;
        
        System.out.println("Quantidade(litros): ");
        double quantLitros = pegar.nextDouble();
        
        double contaFinal = (quantLitros * precoLitro) + (refrigerante*2);
                
        System.out.println("A conta total deu: "+ contaFinal);
        
    }
}