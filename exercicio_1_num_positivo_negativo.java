import java.util.Scanner;

public class exercicio_1_num_positivo_negativo {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um n�mero, podendo ser negativo ou positivo: ");
	
	double x = sc.nextDouble();
	
	if (x < 0) {
	System.out.println("O n�mero digitado � NEGATIVO.");	
	}
	
	if (x == 0) {
	System.out.println("O n�mero digitado � um n�mero neutro, � 0.");	
	}
	
	else {
	System.out.println("O n�mero digitado � um n�mero POSITIVO.");
	}
		
	
	sc.close();

	}

}
