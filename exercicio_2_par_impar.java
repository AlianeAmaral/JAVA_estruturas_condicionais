import java.util.Scanner;

public class exercicio_2_par_impar {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite um n�mero: ");
	int numero = sc.nextInt();
	
	if (numero % 2 == 0) {
		System.out.println("O n�mero digitado foi " + numero + ", um n�mero que � PAR.");
	}
	
	else {
		System.out.println("O n�mero digitado foi " + numero + " um n�mero que � �MPAR.");
	}
	
	sc.close();

	}

}
