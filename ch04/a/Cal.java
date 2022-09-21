package ch04.a;

public class Cal {
	
	int num = 10; // 디폴트 접근 제어자임 , 메서드 뿐만 아니라 변수에서도 접근 제어자가 있음
	
	void add() { //void는 리턴한다는 뜻이고 void를 무시하고 보면 add 앞에 아무것도 없는 것 : 디폴트 접근 제어자 (동일한 패키지에서만 접근 가능)
		System.out.println("더하기 메서드");
	}
	
	public void minus() { //public 접근 제어자 (다른 패키지에서도 접근가능)
		System.out.println("빼기 메서드");
	}
	
	private void multi() { //private 접근 제어자 (동일한 class 에서만 접근 가능)
		System.out.println("곱하기 메서드");
	}
	
	public void divide() {
		System.out.println("나누기 메서드");
		multi(); // private 접근 제어자인 multi를 같은 class에 있는 divide가 접근 가능
	}
}
