package ch05;

interface MoveAble{ // 인터페이스 : 행위에 대한 제약 / 위아래왼오로만 할 수 있음.
	// 아래의 void 앞에 public abstract가 생략되어 있음. 안 적어도 있는 거임.
	void 위(); // 다들 추상메서드임.
	void 아래();
	void 왼쪽();
	void 오른쪽();
	void 냄새맡기();

}

interface MoveAble2{
	// 아래의 void 앞에 public abstract가 생략되어 있음. 안 적어도 있는 거임.
	void 위(); // 다들 추상메서드임.
	void 아래();
	void 왼쪽();
	void 오른쪽();
	void 땅바닥숨기();

}

abstract class 사나운동물 implements MoveAble{
	 // 추상클래스가 아니라 그냥 클래스이면 implements 하면 오류남 . - 그냥 클래스로 하면 void 위아래왼오 모두 구현을 해줘야함 override
	//  추상클래스 이므로 자식 클래스들이 위아래왼오를 구현해야함.
	// 근데 이러면 구현할 게 많아서 그냥 부모클래스에서 구현하도록 함 - ctrl + space
	@Override
	public void 아래() {
		System.out.println("아래로 이동");
		
	}@Override
	public void 왼쪽() {
		System.out.println("왼쪽으로 이동");

		
	}@Override
	public void 오른쪽() {
		System.out.println("오른쪽으로 이동");

		
	}@Override
	public void 위() {
		System.out.println("위쪽으로 이동");

		// 완성을 시킨다. 이유는 다 코로 냄새를 맡을 거니까!
	}@Override
	public void 냄새맡기() {
		System.out.println("코로 냄새맡기");
	}
	
	abstract void 공격(); // 미완성된 메서드 (추상메서드)
}

abstract class 온순한동물 implements MoveAble2{
	abstract void 채집(); // 미완성된 메서드

	// 행위에 제약
	@Override
	public void 위() {
		System.out.println("위쪽으로 이동");
	}

	@Override
	public void 아래() {
		System.out.println("아래쪽으로 이동");
		
	}

	@Override
	public void 왼쪽() {
		System.out.println("왼쪽으로 이동");
		
	}

	@Override
	public void 오른쪽() {
		System.out.println("오른쪽으로 이동");
		
	}

	@Override
	public void 땅바닥숨기() {
		System.out.println("땅바닥에 숨기");
		
	}
	

	
}

// 구현이 자식 클래스로 위임 (위, 아래 , 왼 , 오) 근데 이러면 구현할 게 많아서 그냥 부모 클래스에서 구현함. - 이게 왜 가능이냐고!

class 원숭이 extends 온순한동물{

	@Override // 어노테이션 = JVM이 실행시에 분석해서 확인 = JVM의 힌트
	void 채집() {
		System.out.println("바나나 채집");
	}
	
}

class 소 extends 온순한동물 {

	@Override
	void 채집() {
		System.out.println("풀 채집");

		
	}
	
}

//신입아 말 (상속 온순한 동물)

class 말 extends 온순한동물{

	@Override
	void 채집() {
		System.out.println("풀을 먹다.");
		
	}
	
}

// 신입아 하이에나 (상속 사나운동물)
 class 하이에나 extends 사나운동물{

	@Override
	void 공격() {
		System.out.println("이빨로 공격");
	}


	 
 }

class 호랑이 extends 사나운동물{

	@Override
	void 공격() {
		System.out.println("이빨로 공격");

		
	}


	
}

class 코뿔소 extends 사나운동물{

	@Override
	void 공격() {
		System.out.println("몸통 박치기로 공격");
	}
	
		
	}
	
	// 여기다가 구현하면 새로운 사나운 동물이 생길 때 구현을 못하기 때문에 부모메서드에다가 구현해야함.
	// 근데 사나운동물(부모)메서드에다가 구현하는 순간 호랑이,코뿔소,하이에나(자식)들한테도 다 구현해야함.
	//void 냄새맡기() {
	//	System.out.println("냄새맡기");
	//}
	


public class OOPEx09 {
	
	//오버로딩 : 경우의 수가 적을 때만 사용가능한데 여기서는 온순한동물이랑 사나운동물 밖에 없어서 사용함.
	
	static void 조이스틱(온순한동물 u1) { //온순한 동물대신 소라고 하면 148번라인에서 u2를 못 넣음 // 여기에 u1은 무엇인가.
		u1.채집();
		u1.땅바닥숨기();
		u1.위();
		u1.아래();
		u1.오른쪽();
		u1.왼쪽();
		System.out.println("===============");
		
		
	}
	static void 조이스틱(사나운동물 u1) { 
		u1.공격();
		u1.위();
		u1.아래();
		u1.오른쪽();
		u1.왼쪽();
		u1.냄새맡기();  
		System.out.println("===============");
	}
		

	public static void main(String[] args) {//여기 밑에 다 동적바인딩된거임.
		소 u1 = new 소();
		//u1.채집();
		//u1.땅바닥숨기(); - 아래 조이스틱으로 하기
		조이스틱(u1);
		원숭이 u2 = new 원숭이();
		조이스틱(u2);
		호랑이 u3 = new 호랑이();
		조이스틱(u3);
		코뿔소 u4 = new 코뿔소();
		조이스틱(u4);
		말 u5 = new 말();
		조이스틱(u5);
		
	}
}
