package ColmeiaTech;

import java.util.Scanner;

public class exercicio3 {

	private static final int Horasextras = 0;

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		float salariobruto,adicionalnoturno,Horasextras,descontos,salarioliquido;
		
		System.out.println("Digite salario bruto");
		 salariobruto = leia.nextFloat();
		
		System.out.println("Adicional Noturno");
		 adicionalnoturno = leia.nextFloat();
		
		System.out.println("Horas extras");
		 Horasextras = leia.nextFloat();
		
		System.out.println("Digite Descontos");
		 descontos = leia.nextFloat();
		
		salarioliquido = salariobruto + adicionalnoturno +(Horasextras*5)-descontos;
		
		System.out.println("salario Liquido: "+String.format("%.2f" , salarioliquido)) ;
		
		
		leia.close();
		
		
	}
}
