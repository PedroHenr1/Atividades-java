import java.util.Scanner;

public class Numero7 {
    public static void main(String[] args) {
        Scanner pegar = new Scanner(System.in);
        
        float alunosApvd=0,alunosExame=0,alunosRpvd=0,mediaTotal=0;
        
        for(int i=1; i<=6; i++){
            System.out.println("Informe a primeira nota do " + i + "o aluno: ");
            float nota1 = pegar.nextFloat();
            System.out.println("Informe a segunda nota do " + i + "o aluno: ");
            float nota2 = pegar.nextFloat();
            
            float mediaAritmetica = (nota1+nota2)/2;
            
            System.out.println("A media aritmetica do aluno "+ i + "o é " + mediaAritmetica);
            
            if(mediaAritmetica < 3){
                System.out.println("Reprovado\n");
                alunosRpvd++;
            }
            else if(mediaAritmetica >= 3 && mediaAritmetica <= 7){
                System.out.println("Exame\n");
                alunosExame++;
            }
            else if(mediaAritmetica > 7){
                System.out.println("Aprovado\n");
                alunosApvd++;
            }
            mediaTotal += (nota1+nota2)/2;
        }
        System.out.println("Alunos Aprovados: "+ alunosApvd + "\nAlunos em Exame: " + alunosExame + "\nAlunos Reprovados: " + alunosRpvd + "\nMedia total da classe: " + mediaTotal/6);
        
    }
}