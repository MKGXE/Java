package condition;

import java.util.Scanner;

public class ifelse3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 변수 = sc.nextInt();
		
		// 1. 20세 이상이면 성인, 14~20세는 청소년, 14세 미만은 어린이로 구분
		
		// 2. 학점 계산(90이상은 A, 80이상은 B, 70이상은 C, 그 미만은 F)
		
		// 3. 비밀번호를 정해놓고 사용자가 비밀번호를 입력해서 맞추면 '비밀번호가 맞습니다.'
		// 틀리면 '비밀번호가 다릅니다'(비밀번호는 정수)
		
		// 1
		/*
		int yea = 0;
		
		Scanner year = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		yea = year.nextInt();
		
		if (yea < 14) {
			System.out.println("어린이입니다");
		}else if (yea >= 14 && yea < 20) {
			System.out.println("청소년입니다");
		}else if (yea >= 20) {
			System.out.println("성인입니다");
		}else {
			System.out.println("그 외");
		}
		*/
		
		// 2
		/*
		int score = 0;
		
		Scanner sco = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		score = sco.nextInt();
		
		if (score < 70) {
			System.out.println("F");
		}else if (score >= 70 && score < 80) {
			System.out.println("C");
		}else if (score >= 80 && score < 90) {
			System.out.println("B");
		}else if (score >= 90) {
			System.out.println("A");
		}else {
			System.out.println("그 외");
		}
		*/
		
		// 3
		/*
		int pass = 0;
		int word = 1358;
		
		Scanner num = new Scanner(System.in);
		System.out.print("비밀번호를 입력해주세요 : ");
		pass = num.nextInt();
		
		
		if (pass == word) {
			System.out.println("비밀번호가 맞습니다");
		}else {
			System.out.println("비밀번호가 틀립니다");
		}
		*/
		
		// 4
		/*
		
		int yea;
		Scanner year = new Scanner(System.in);
		System.out.print("년도를 입력해주세요 : ");
		yea = year.nextInt();
		
		if (yea % 4 == 0 && yea % 100 != 0) {
			System.out.printf(yea+"년은 윤년입니다");
		} else if (yea % 100 != 0 || yea % 400 == 0) {
			System.out.printf(yea+"년은 윤년입니다");
		} else {
			System.out.printf(yea+"년은 평년입니다");
		}
		*/
	}
}
