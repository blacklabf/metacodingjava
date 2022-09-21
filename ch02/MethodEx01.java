package ch02;

class 손님{
	
	// 손님의 행위 , 만약 class 밖에 존재한다면 누구의 행위도 아니기 때문에 method가 아니다.
	void 커피마시기() {
		System.out.println("손님이 커피를 마셔요");
	}
}

public class MethodEx01 {
	
	// 메서드 = MethodEx01 클래스의 행위 (6번째 줄의 {}안에 실행하는 것들)
	static void start() {
		System.out.println("만나서 반갑습니다. " ); //String 타입
		System.out.println("start 메서드 종료");
		
}

	public static void main(String[] args) {
		MethodEx01.start();
		손님 s = new 손님(); //손님의 class가 메모리에 뜸 ( 실행이 되는 건 아님) 
		s.커피마시기(); //커피마시기의 내부가 실행이 된다.
	}
}
