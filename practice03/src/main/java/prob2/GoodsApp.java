package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		Goods item = null;
		for(int i = 0; i < goods.length; i++) {
			String input = scanner.nextLine();
			String[] inputArr = input.split(" ");
			
			item = new Goods();
			item.setName(inputArr[0]);
			item.setPrice(Integer.parseInt(inputArr[1]));
			item.setCnt(Integer.parseInt(inputArr[2]));
			
			goods[i] = item;
		}
		
		System.out.println();

		// 상품 출
		for(Goods tmp : goods) {
			System.out.printf("%s(가격: %d원)이 %d개 입고 되었습니다.\n", tmp.getName(), tmp.getPrice(), tmp.getCnt());
		}
		
		// 자원정리
		scanner.close();
	}

}
