
import java.util.Random;
public class ex2 {
	public static void main(String[] args) {
		int matriz [][]=new int[3][3],maior=0,menor=0,l=0,c=0,lm=0,cm=0;
		Random x = new Random ();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			matriz[i][j] = x.nextInt()%30;
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
					l=i;
					c=j;		
				}
				if(matriz[i][j] < menor) {
					menor = matriz[i][j];
					lm=i;
					cm=j;		
				}
			}
		}
		System.out.println(":: MATRIZ ::");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("[ "+matriz[i][j]+" ]");
				if(j==2) {
					System.out.print("\n");
				}
			}
		}
		System.out.println("\n");
		System.out.println("O n�mero maior da matriz � "+"[ "+maior+" ] linha "+l+" coluna "+c);
		System.out.print("O n�mero menor da matriz � "+"[ "+menor+" ] linha "+lm+" coluna "+cm);
	}
}
			
			
			
		
