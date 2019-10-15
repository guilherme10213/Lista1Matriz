import java.util.*;
import java.lang.*;
public class ex3 {
	public static void main(String[] args) {
		int matriz[][] = new int [3][4],x[]=new int [3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matriz[i][j] = (int)(Math.random()*20);
				x[i] = x[i] + matriz[i][j];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=3;i<3;i++) {
				matriz[i][j] = x[i];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("["+matriz[i][j]+"]");
				if(j==3) {
					System.out.println();
				}
			}
		}
		
		
		
	}
}
