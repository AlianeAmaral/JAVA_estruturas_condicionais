import java.util.Scanner;

public class exercicio_3_reconhecer_multiplos {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int A, B;
	
	System.out.println("Digite um n�mero: ");
	A = sc.nextInt();
	
	System.out.println("Digite outro n�mero: ");
	B = sc.nextInt();
	
	if (A % B == 0 || B % A == 0) {
		System.out.println("Sim, s�o n�meros m�ltiplos.");
	}
	
	else {
		System.out.println("N�o, n�o s�o n�meros m�ltiplos.");
	}
	
	sc.close();

	}

}
