package loop;

import java.util.Scanner;

public class For2 {
	public static void main(String[] args) {
		// for문을 통해서 구현해보세요
		
		// 1. 안녕 5번
		
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕");
		}
		
		// 2. 1 ~ 10가지 합계 구하기
		
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum += j;
		}
		System.out.println("합계는 "+sum);
		
		// 3. 1 ~ 입력값까지 합계 구하기
		
		int num;
		int su = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		for (int n = 0; n < num; n++) {
			su += n;
		}
		System.out.println("합계는 "+su);
	}
}
