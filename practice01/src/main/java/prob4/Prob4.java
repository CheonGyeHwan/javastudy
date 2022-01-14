package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		String[] textArr = text.split("");
		
		int cnt = 0;
		for (int i = 0; i < textArr.length; i++) {
			for (int j = 0; j <= cnt; j++) {
				System.out.print(textArr[j]);
			}
			System.out.print("\n");
			cnt++;
		}

		scanner.close();
	}

}