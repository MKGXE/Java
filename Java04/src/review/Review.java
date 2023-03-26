//package review;

//import java.util.Scanner;

//public class Review {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		// 1. 1 ~ 10 중 짝수만 출력하기
//		
//		for (int j = 2; j <= 10; j++) {
//			if(j % 2 == 1) {
//				continue;
//			}
//			System.out.println("짝수 : "+j);
//		}

		// 2. 정수형태 비밀번호 맞추기 (기회는 5번, 맞추면 맟췄다하고 종료, 기회를 모두 사용하면 접속불가)

//		int pass = 0;
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 5; i >= 0; i--) {
//			System.out.print("비밀번호를 입력하세요 : ");
//			pass = sc.nextInt();
//			if (pass == 1358) {
//				System.out.println("비밀번호가 맞습니다");
//				break;
//			} else if (pass != 1358) {
//				if (i < 1) {
//					System.out.println("비밀번호가 틀립니다 접속차단");
//					break;
//				}
//				System.out.println("비밀번호가 틀립니다 " + i + "번의 기회가 남았습니다");
//			}
//		}
		// 3. 시험합격 점수는 국어,영어,수학이 각각 40점 이상이고, 총점수가 150점 이상이면 합격
		// 40점 이하의 점수가 있으면 과락, 각 과목이 40점 이상이나 총점이 미달되었으면 총점미달
		
//		int k = 40;
//		int e = 40;
//		int m = 40;
//		
//		if (k >= 40 && e >= 40 && m >= 40) {
//			if ((k + e + m) < 150) {
//				System.out.println("총점미달");
//			}else if ((k + e + m) >= 150) {
//				System.out.println("합격");
//			}
//		}else if (k < 40 || e < 40 || m < 40) {
//			System.out.println("과락");
//		}
		
		// 4. 1 ~ 10까지의 함 구하기(반복문)
//		int sum = 0;
//		for (int i = 0; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println("합계는 "+sum);
		
		// 5. 10 ~ 1까지 거꾸로 출력하기(반복문)
//		for (int i = 10; i > 0; i--) {
//			System.out.print(i+" ");
