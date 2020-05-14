package fundamentos;
import java.util.*;

public class Equacao2Grau {
	public static void main(String[] args) {
		//Este programa calcula as ra�zes de uma equa��o do segundo grau
		
		double a;
		double b;
		double c;
		double delta;
		double x1;
		double x2;
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Este programa calcula as ra�zes reais de uma equa��o do 2� grau.");
		System.out.println("Digite o valor de a: ");
		a =  entrada.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = entrada.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = entrada.nextDouble();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
		if (delta < 0) {
			System.out.println("Esta equa��o n�o apresenta ra�zes reais.");
		} else if (delta == 0){
			x1 = - b / (2 * a);
			System.out.printf("Esta equa��o apresenta ra�z dupla igual a %.2f\n", x1);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			if(x1 < x2) {
				System.out.printf("Esta equa��o apresenta ra�zes iguais a %.2f e %.2f\n", x1, x2);
			} else {
				System.out.printf("Esta equa��o apresenta ra�zes iguais a %.2f e %.2f\n", x2, x1);
			}
		}
		entrada.close();
	}
}
