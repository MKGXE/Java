package cls;

public class Method4 {
	public static void main(String[] args) {
		MyClass7 mc7 = new MyClass7();
		
		mc7.p(2, 2);
		mc7.m(2, 2);
		mc7.x(2, 2);
		mc7.d(2, 2);
	}
}

class MyClass7 {
	// 더하기
	void p(int num1, int num2) {
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}
	// 빼기
	void m(int num1, int num2) {
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
	}
	// 곱하기
	void x(int num1, int num2) {
		System.out.println(num1+" x "+num2+" = "+(num1*num2));
	}
	// 나누기 (0으로 나누면 결과를 0으로)
	void d(int num1, int num2) {
		if (num2 == 0) {
			System.out.println(num1+" ÷ "+num2+" = 0");
		}else {
		System.out.println(num1+" ÷ "+num2+" = "+(num1 / num2));
		}
	}
}