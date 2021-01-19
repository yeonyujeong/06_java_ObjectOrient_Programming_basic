package step6_01.classObject;

class Student {
	String name;
	int score;
}

public class ClassEx02 {

	public static void main(String[] args) {

		//같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
		// (구체적인 접근 제어자는 객체지향 기법에서 자세히 공부)
		
		
		
		Ex01 e = new Ex01();
		
		Character c = new Character();
		
		Student std = new Student();
		
		
		
	}

}
