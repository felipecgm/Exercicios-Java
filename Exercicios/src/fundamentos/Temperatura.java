package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		double temperaturaFarenheit = 86;
		double temperaturaCelsius = 5 * (temperaturaFarenheit - 32) / 9.0;
		
		System.out.println("O resultado é " + temperaturaCelsius + " °C");
	}

}
