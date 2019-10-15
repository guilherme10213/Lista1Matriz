import java.lang.*;

public class ex4verdadeiro {
	public static void main(String[] args) {
		int bingo[][]=new int [4][4],cartela[][]=new int[4][4],vetor[]=new int [17],cont=0,bin=0;
		boolean verific = true;
		//Criando os numeros do bingo.
		for(int i=0;i<17;i++) {
			vetor[i] = (int)(Math.random()*76)+1;
		}
		//Criando a cartela do bingo.
		for(int i=0,x=0;i<4;i++) {
			for(int j=0;j<4;j++,x++) {
				bingo[i][j]=vetor[x];
			}
		}
		//verificando se a tabela do mano é igual a do bingo
		while(verific = true) {
			//criando cartela do mano.
			for(int i=0,x=0;i<4;i++) {
				for(int j=0;j<4;j++,x++) {
					cartela[i][j]=vetor[(int)(Math.random()*16)];
				}
				if(verific == false)break;
			}
			for(int i=0,x=0;i<4;i++) {
				for(int j=0;j<4;j++,x++) {
					if(cartela[i][j] == bingo[i][j]) {
						bin++;
					}else {
						cont++;
					}
				}
				if(bin==16) {
					System.out.println("BINGO!");
					System.out.println("VOCE VENCEU DEPOIS DE "+cont+" RODADAS!");
					verific = false;
					break;
				}
				if(verific == false)break;
			}
			if(verific == false)break;
		}
	}
}
