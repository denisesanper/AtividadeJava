package JavaExercicios;

public class ex3 {
	
	public static void main(String args[]) {
		
		//Fa�a um programa que mostre uma contagem na tela de 233 a 456, s� que
		//contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando n�o
		//estiver.
		int x=0;
		int y=0;
		for(int i=233;i<457;i+=3) {
			if(i>300 && i<400) {
				x=x+1;	
				
			}else {
				i+=2;
				y=y+1;
		
			}
		}
		System.out.println("H� "+y+ " algarismos no intervalo de [233,300[ e ]400,456], contados de 5 em 5 e h� "+x+ " algarismos no intervalo [300,400] contados de 3 em 3.");

			}
}