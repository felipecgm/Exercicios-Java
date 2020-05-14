package fundamentos;
import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		//Este programa calcula a média entre dois valores reais
		
		double nota1;
		double nota2;
		double media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		
		media = (nota1 + nota2) / 2;
		
		System.out.printf("A média entre %.1f e %.1f é %.1f", nota1, nota2, media);
		System.out.println(" ");
		System.out.println("A média entre " + nota1 + " e " + nota2 + " é " + media);
	}
	
}


