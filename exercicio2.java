package ColmeiaTech;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub

		System.out.println("participante");
		float nota1,nota2,nota3,nota4,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota:");
		nota1 = leia.nextFloat();
		System.out.println("Entre com a segunda nota:");
		nota2 = leia.nextFloat();
		System.out.println("Entre com a terceira nota:");
		nota3 = leia.nextFloat();
		System.out.println("Entre com a quarta nota:");
		nota4 = leia.nextFloat();
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("\n média: %.1f " ,media);
		 
		leia.close();
	}

}
