package fundamentos;

public class produtoExterno {
	  public static void main(String[] args) {
		    int[][] matriz = new int[4][4];
				int[] array1 = {2,1,8,4};
				int[] array2 = {1,3,5,2};
				
				for(int i = 0; i < 4; i++) {
					for(int j = 0; j < 4; j++) {
						matriz[j][i] = array1[j]*array2[i];
						System.out.print(matriz[j][i] + "\t");
					}
		      System.out.println(" ");
				}
		  }
		}