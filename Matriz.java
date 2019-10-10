

public class Matriz {
	public static void main(String[] args) {
		int matriz [][] = new int [3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matriz[i][j] = (int)(Math.random()*10);
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("[ "+matriz[i][j]+" ]");
				if(j==2) {
					System.out.println();
				}
			}
		}
		
	}
}
