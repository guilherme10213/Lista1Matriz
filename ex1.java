import java.util.*;
public class ex1 {
	public static void main(String[] args) {
		int matriz [][]=new int [4][4],x=2;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				matriz[i][j] = x;  
				x=x*2;
			}
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("[ "+matriz[i][j]+" ]");
				if(j==3)System.out.println();
			}
		}
	}
}
