package prob1;

import java.util.Scanner;

public class Prob1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		int total;
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("금액 : ");
		total = scanner.nextInt();
		
		for (int money : MONEYS) {
			System.out.printf("%d원 : %d개\n", money, total/money);
			total = total%money;
		}
		
		scanner.close();
 	}

}
