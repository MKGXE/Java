package cls;

public class Class7 {
	public static void main(String[] args) {
		Human hm = new Human();
		HumanView hv = new HumanView();
		
		hm.setName("최민혁");
		hm.setGender("남성");
		hm.setAge(17);
		
		hv.printInfo(hm);
	}
}

// 멤버변수 private
// 메서드는 public

class Human{
	private String name;
	private String gender;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

class HumanView{
	public void printInfo(Human hm) {
		System.out.println("이름 : "+hm.getName()+", 성별 : "+hm.getGender()+", 나이 : "+hm.getAge());
	}
}