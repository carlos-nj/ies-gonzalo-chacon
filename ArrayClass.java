import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor[][] = { { 1, 2, 13, 4, 8 }, { 6, 7, 80, 9, 5 }, { 11, 22, 13, 44, 35 } };
		int num;

		for (int i = 0; i < valor.length; i++) {
			for (int j = 0; j < valor[0].length; j++) {

				System.out.println("La fila: " + (i + 1) +
								   " la columna: " + (j + 1) +
								   " tiene el valor: " + valor[i][j]);

			}
			System.out.println("\n-------------------"+"Fila: " + (i+1) + "------------------");
		}
		giveItBack(valor);
		giveitBackTwo(valor);
		
	
		}

	
   public static void giveItBack(int valor[][]) {		
		
		for (int k=0;k<valor.length;k++){
			 for(int l=0;l<valor[0].length;l++){	
				 
				 System.out.println("La fila: " + (k + 1) +
							         " la columna: " + (l + 1) +
							         " tiene el valor: " + valor[k][l]);

		}
		System.out.println("\n-------------------"+"Fila: " + (k+1) + "------------------");

}
		
}
   public static void giveitBackTwo(int valor[][]) {
	   
	   Scanner entrada = new Scanner(System.in);
	 	   
	   System.out.println("Introduce un valor: ");
	   valor[1][3] = entrada.nextInt();
	   
	   System.out.println("El nuevo valor de la fila 2 y la columna 4 es: " + valor[1][3]);
	   
	   
	   
	   
	   
   }
   public static int higestNumber(int valor[][]) {
	   int num =0;
	   for (num = 0; num < valor.length; num++) {
	   if (num>valor[i]) {
		   
		   System.out.println("El mayor es: " + num);
		   
		  
		   
	   }
	
	   
	   }
	return num;
	
	   
   }
}
