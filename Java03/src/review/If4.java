package review;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		// 복습퀴즈
		// 사용자에게 정수를 입력받고
		// 천의 자리로 ,를 넣어주세요
		
		/*
		100 ==> 100
		1000 ==> 1,000
		1000000 ==> 1,000,000
		10000 ==> 10,000
		10억까지만 해주세요
		
		String str = "";
		int num = 0;
		double dnum = 0.0;
		dnum = (double)num;
		str = Integer.toString(num);		// int -> string
		num = Integer.parseInt(str);		// String -> int
		*/
		
		// 금액을 입력받아서 형변환하고 처리해보세요
		
		int money;
		String num;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		money = sc.nextInt();
		
		int t = 0;
		int tr;
		String str_n = null;
		
		num = Integer.toString(money);
		
		if (money <= 999) {
			System.out.println(money);
		}else if ((money / 1000) >= 1) {
			t = money / 1000;
			tr = money % 1000;
			if (tr < 10) {
				str_n = "00"+tr;
			}else if (tr < 100) {
				str_n = "0"+tr;
			}else if (tr < 1000) {
				str_n = ""+tr;
			}
			System.out.println(t+","+str_n);
		}
		
		
	}
}
