package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 1 ~ 10 중 짝수만 출력하기
		
		for (int j = 2; j <= 10; j++) {
			if(j % 2 == 1) {
				continue;
			}
			System.out.println("짝수 : "+j);
		}
		
		// 2. 정수형태 비밀번호 맞추기 (기회는 5번, 맞추면 맟췄다하고 종료, 기회를 모두 사용하면 접속불가)
		
		int pass = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호를 입력하세요 : ");
		pass = sc.nextInt();
	}
}
