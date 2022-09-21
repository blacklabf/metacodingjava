package ch05.srpdip;

interface CanAble {
	 public abstract void talk(); // 앞에 public abstract는 생략가능
}

abstract class 홀직원 implements CanAble{
	abstract void 청소();
	
	@Override
	public void talk() {
		System.out.println("손님과 대화");
		
	}
	
}


abstract class 종업원 extends 홀직원{
	void 서빙하기() {
		System.out.println("서빙하기");
	}
	// 전체 주석 : ctrl + /
//	void 주문받기() {
//		System.out.println("주문받기");
//	}	
}

abstract class 캐셔 extends 홀직원 {
	void 정산하기() {
		System.out.println("정산하기");
	}
	void 계산하기() {
		System.out.println("카드 계산하기");
	}
}

//package에 같은 이름 있으면 충돌남.
abstract class 요리사{
	abstract void 요리(); // 양식, 한식할 수도 있어도 구현하기가 힘들다. 
}

class 홍길동 extends 종업원{ // 홍길동에 오류나서 마우스 올려서 implement 하면 아래의 override가 뜨면서 void 청소() 됨. -> implements가 뭐임
	// 심지어 implements 를 하는 경우가 따로있음. override랑 implements랑 모르겠음
	
	//장보고 j;  // 이렇게 의존하면 망함
	요리사 j;  // 의존성 역전 원칙 : 추상적인 것에 의존하고 책임을 완벽하게 분리
	
	
	@Override
	void 청소() {
		System.out.println("화장실 청소");
	}


	
}

class 임꺽정 extends 종업원{

	@Override
	void 청소() {
		System.out.println("주방 청소");
	}
	
}

class 김유신 extends 캐셔{

	@Override
	void 청소() {
		System.out.println("홀청소");		
	}
	
}

class 이몽룡 extends 캐셔 {

	@Override
	void 청소() {
		System.out.println("테이블청소");		
	}
	
}
//
//class 장보고 extends 요리사{
//
//	@Override
//	void 요리() {
//		System.out.println("양식 만들기");		
//	}
//	
//}

class 정몽주 extends 요리사{

	@Override
	void 요리() {
		System.out.println("양식 만들기");		
	}
	
}

class 이순신 extends 요리사{

	@Override
	void 요리() {
		System.out.println("한식 만들기");		
		
	}
	 
}


public class OOPEx10 {

	public static void main(String[] args) {
		

	}

}
