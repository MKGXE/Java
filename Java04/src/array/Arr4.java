package array;

import java.util.Scanner;

public class Arr4 {
	public static void main(String[] args) {
		// 국가와 수도 (5개)
		// ex) 대한민국의 수도는 서울입니다.
		String conts[] = {"대한민국", "일본", "중국", "미국", "러시아"};
		String caps[] = {"서울", "도쿄", "베이징", "워싱턴D.C", "모스크바"};
		
//		for (int i=0;i<conts.length;++i) {
//			System.out.println(conts[i]+"의 수도는 "+caps[i]+"입니다.");
//		}
		
		// 사용자 입력으로 국가를 받아서
		// 해당 국가의 수도를 알려주는 프로그램을 만들어보세요
		
		String con;
		Scanner sc = new Scanner(System.in);
	
		System.out.print("국가명를 입력하세요 : ");
		con = sc.next();	
		for (int i=0;i<conts.length;++i) {
			if (con.equals(conts[i]) == true) {
				System.out.println(conts[i]+"의 수도는 "+caps[i]+"입니다");
				break;
			}else if (con.equals(conts[i]) == false) {
				System.out.println("잘못된 입력입니다");
				break;
			}
		}
	}
}
