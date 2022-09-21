package ch05;

class 임꺽정{
	
	void 달리기() {
		System.out.println("달리기1");
	}
	
	//오버로딩 : 메서드명은 같지만 다른 함수로 인식
	void 달리기(int speed) {
		System.out.println("달리기2");
	}
	
	//오버로딩 : 메서드명은 같지만 다른 함수로 인식
	void 달리기(double speed) {
		System.out.println("달리기3");
	}
	
	//오버로딩 : 메서드명은 같지만 다른 함수로 인식
		void 달리기(int speed, double power) {
			System.out.println("달리기4");
		}
		
		void 달리기2() {
			System.out.println("달리기5");
		}
}

//오버로딩 문법은 끝~!
// 오버로딩을 왜 사용하는가? 굳이 달리기2를 만들어서 호출하지 않고 오버로딩을 하는 이유!

public class OOPEx04 {

	public static void main(String[] args) {
		임꺽정 e = new 임꺽정(); // 5번에 static 없으니까 new 해서 heap에 띄움
		e.달리기();
		e.달리기(1);
		e.달리기(5.0);
		e.달리기(1 , 5.0);
		e.달리기2();
		

	}

}
