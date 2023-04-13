package ColmeiaTech;

import java.util.Scanner;

public class AtividadesJava {

	 public static void main(String[] args) {
		float salario, abono, NovoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Digite o salario:");
		salario = leia.nextFloat();
		
		System.out.printf("Digite o Abono:");
		abono = leia.nextFloat();
		NovoSalario = salario + abono;
		
		System.out.printf("\n novo salario será: %.2f",NovoSalario);
		

		
	}
}
 