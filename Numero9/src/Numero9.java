import java.util.Scanner;

public class Numero9 {
	public static void main(String[] args) {

	    String pacienteMaisVelhoNome = "N/A",MulherBaixaNome = "N/A";
	    int MulherBaixa=0, qntdPacientes=0, qntdHomens=0, intervaloAlturaF=0, intervaloIdade=0, acimaDoPeso=0, somarIdadesH=0, pacienteMaisVelho=0;
        Scanner pegar = new Scanner(System.in);
                
        while(true){
        	
        	int idade=0;
   		 	String nome="N/A",sexo="N/A";
   		 	float peso=0, altura=0;

            System.out.println("Informe as informações do paciente uma a um ou na seguinte ordem: Nome  Idade  Sexo  Peso  altura ");
            
            System.out.println("Informe o nome do paciente: ");
            
            nome = pegar.next();
            if(nome.equalsIgnoreCase("fim")) break;
            do {
            	System.out.println("Informe a idade do paciente: ");
            	idade = pegar.nextInt();
            }while(idade > 200 || idade < 0);
            
            do {
            	System.out.println("Informe o sexo do paciente: ");
            	sexo = pegar.next();
        	}while(!(sexo.equalsIgnoreCase("masculino") || sexo.equalsIgnoreCase("feminino")));
        	
            do{
            	System.out.println("Informe o peso do paciente: ");
            	peso = pegar.nextFloat();
            }while(peso < 0);
            
            do {
            	System.out.println("Informe a altura do paciente: ");
            	altura = pegar.nextFloat();
            }while(altura < 0);
            
            qntdPacientes++;
            
            if(sexo.equalsIgnoreCase("masculino")){
            	qntdHomens++;
            	somarIdadesH += idade;
            }
            if(sexo.equalsIgnoreCase("feminino") && altura >= 1.6 && altura < 1.7 && peso > 70) intervaloAlturaF++;
            if(idade >= 18 && idade <= 25) intervaloIdade++;
            if(idade >= pacienteMaisVelho) {
            	pacienteMaisVelhoNome = nome;
            	pacienteMaisVelho = idade;
            }
            if(sexo.equalsIgnoreCase("feminino") && idade < MulherBaixa){
            	MulherBaixaNome = nome;
            	MulherBaixa = idade;
            }
        }
        
        System.out.println("Quantidade de pacientes: " + qntdPacientes);
        System.out.println("Media de idade dos homens: " + (float)somarIdadesH/qntdHomens);
        System.out.println("Quantidade de mulheres com altura entre 1,6 e 1,7 e peso acima de 70kg.: " + intervaloAlturaF);
        System.out.println("Quantidade de pacientes com idade entre 18 e 25: " + intervaloIdade);
        System.out.println("Nome do paciente mais velho: " + pacienteMaisVelhoNome);
        System.out.println("Nome da mulher mais baixa: " + MulherBaixaNome);
	}
}