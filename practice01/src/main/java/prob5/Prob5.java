package prob5;

public class Prob5 {

	public static void main(String[] args) {
		int num = 1;

		while (num < 100) {
			String strNum = Integer.toString(num);
			String[] strNumArr = strNum.split("");

			if (strNum.contains("3") || strNum.contains("6") || strNum.contains("9")) {
				System.out.print(strNum + " ");

				for (String clapNum : strNumArr) {
					if (Integer.parseInt(clapNum) == 3 || Integer.parseInt(clapNum) == 6
							|| Integer.parseInt(clapNum) == 9) {
						System.out.print("짝");
					}
				}
				System.out.print("\n");
			}
			num++;
		}
	}
}
