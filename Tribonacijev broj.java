package cetrnaestidomaci;

import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite N: ");
		int n = sc.nextInt();
		n = t(n);
		System.out.println(n + ". Tribonacijev broj je: " + tribonaci(n));
	}

	static int tribonaci(int n) {
		
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else if (n == 2)
			return 1;
		else
			return tribonaci(n - 1) + tribonaci(n - 2) + tribonaci(n - 3);
	}

	static int t(int n) {

		Scanner sc = new Scanner(System.in);

		while (n < 0 || n > 37) {
			System.err.println("Max. Tribonacijev broj je 37. Unesite ponovo: ");
			n = sc.nextInt();
		}
		return n;
	}
}