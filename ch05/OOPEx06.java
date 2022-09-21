 package ch05;

class 프로토스유닛{
	String name = "프로토스유닛";
	void 기본공격(프로토스유닛 e1) {} // 오버라이드에 의해 무효화 됨.
		// System.out.println("프로토스유닛 메서드"); - 오버라이드해서 어차피 실행안됨.
	
	String 이름확인() { // 오버라이드에 의해 무효화 됨.
		return "?";
	}
	
}

class 질럿 extends 프로토스유닛{
	String name = "질럿";
	
	// 오버라이드 = 부모의 메서드를 무효화하다. 
	// 같은 이름으로 자식이 메서드를 가지면 부모의 메서드를 무효화한다.
	// 프로토스유닛의 메서드를 기본공격 무효화 시킴 - sysout("프로토닛 메서드") 실행 안됨.
	void 기본공격 (프로토스유닛 e1) { // 추상화된 프로토스유닛을 넣어야 함.
		//System.out.println("질럿 메서드");
		//System.out.println("질럿이 " + e1.이름확인() + "을 공격합니다.");
			System.out.println(this.name + "이 " + e1.이름확인() + "을 공격합니다.");
		}
	
	
	// 오버라이드 = 부모의 메서드를 무효화한다. 
	String 이름확인() {
		return name;
	}
}

class 드라군 extends 프로토스유닛{
	String name = "드라군";
	
	//오버라이드 : 부모의 메서드를 무효화하다. 
	void 기본공격 (프로토스유닛 e1) { // 추상화된 프로토스유닛을 넣어야 함
		System.out.println(this.name + "이 " + e1.이름확인() + "을 공격합니다.");
	}
	// 오버라이드 = 부모의 메서드를 무효화한다. 
	String 이름확인() {
		return name;
	}
}

class 다크템플러 extends 프로토스유닛{
	String name = "다크템플러";
	
	//오버라이드 : 부모의 메서드를 무효화하다. 
		void 기본공격 (프로토스유닛 e1) { // 추상화된 프로토스유닛을 넣어야 함
			System.out.println(this.name + "이 " + e1.이름확인() + "을 공격합니다.");
		}
	
	// 오버라이드 = 부모의 메서드를 무효화한다. 
	String 이름확인() {
		return name;
}
}

// 신입아 리버라는 유닛을 오버라이드 해서 만들어. 
//1) 프로토스 유닛으로 상속  
// 2) 공격메서드, 이름을 확인하는 메서드 필요
// 3) name 이라는 변수도 하나 만들어
// 4) 프로토스유닛타입으로 받아서 전부를 공격해라.
// 5) 질럿으로 리버를 공격해봐
// 6) String 이름체크()로 하면 오버라이딩(무효화)가 안돼서 질럿이 ?를 공격합니다. 이렇게 뜸.
class 리버 extends 프로토스유닛{
	String name = "리버";
	
		void 기본공격 (프로토스유닛 e1) { 
			System.out.println(this.name + "이 " + e1.이름확인() + "을 공격합니다.");
		}
	
	String 이름확인() {
		return name;
}
}


public class OOPEx06 {

	public static void main(String[] args) {
		프로토스유닛 u1 = new 질럿(); //(질럿, 프로토스유닛V) // 질럿 u1을 다형성이니까 프로토스유닛 u1으로 변경 -> heap공간에 프로토스유닛을 바라봄
		프로토스유닛 u2 = new 드라군(); //(드라군, 프로토스유닛V)
		프로토스유닛 u3 = new 다크템플러(); //(다크템플러, 프로토스유닛V)
		프로토스유닛 u4 = new 리버();
		
		u1.기본공격(u3);
		u2.기본공격(u1);
		u2.기본공격(u3);
		u1.기본공격(u4);
		u4.기본공격(u1);
		
		

	}

}
