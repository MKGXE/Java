package loop;

import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		// while문의 플래그를 활용하여
		// 1~10의 합계를 구해보세요
		
		// int i = 0;
		// int sum = 0;
		
		// while (i <= 10) {
		// 	sum += i;
		// 	i++;
		// }
		// System.out.println(sum);
		// }
	
	int num;
	int sum = 0;
	int i = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("숫자를 입력하세요 : ");
	num = sc.nextInt();
	
	while (i <= num) {
		sum += i;
		i++;
	}
		System.out.println(sum);
	}
	
	
}
