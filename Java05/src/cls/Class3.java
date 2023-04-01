package cls;

public class Class3 {
	public static void main(String[] args) {
		Car 내차 = new Car();
		내차.차주인 = "최민혁";
		내차.차종 = "WRX STi";
		내차.색상 = "딥 블루";
		
		내차.차정보();
	}
}

class Car{
	// 데이터를 담기 위해선 변수가 필요
	String 차주인;
	String 차종;
	String 색상;
	
	void 차정보() {
		System.out.println("주인 : "+차주인+", 차종 : "+차종+", 색상 : "+색상);
	}
}
// class 자동차
// 데이터 : 차주인, 차종, 차색상
// 기능 : 차정보