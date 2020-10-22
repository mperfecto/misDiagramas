import java.util.Scanner;

public class existencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int existencias = 3200;
		int entregadas;

		Scanner sc = new Scanner(System.in);

		while (existencias >= 100) {

			System.out.println("Selecciona el nº de existencias a pedir");
			entregadas = sc.nextInt();
			existencias = existencias - entregadas;

			System.out.println("Existencias actuales: " + existencias);
		}
		System.out.println("No existen existencias disponibles");

	}

}
