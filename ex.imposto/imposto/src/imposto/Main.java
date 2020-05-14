package imposto;

public class Main {
	public static void main(String[] args) {
		String imposto = "IPVA";
		double valor = 30000;
		double taxa = 0.0;
				
		
		switch(imposto) {
			case "IPVA":
				taxa = 0.03;
				break;
			case "IPTU":
				taxa = 0.002; 
				break; 
			case "IRPF":
				taxa = 0.17;
				break;
			case "IRPJ": 
				if(valor > 10000) { 
					taxa = 0.09;
				} 
				break; 
			case "Licenciamento":
				taxa = 0.005;
				break; 
				
				class 
				
				
				
		
		
		}
	}

}
