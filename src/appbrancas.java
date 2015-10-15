import java.util.Scanner;

public class appbrancas {

	private static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		int v = 500000;
		long x = System.nanoTime();

		System.out.println("Entre el numero a buscar: ");
		int usernum = lector.nextInt();
		for (int i = 0; i < 500000; i++) {
			if (usernum == i) {
				long y = System.nanoTime();
				long time = (y - x) / 1000;
				System.out.println("El numero ha tardado en encontrarse " + time + " milisegundos.");
			}
		}

	}
}