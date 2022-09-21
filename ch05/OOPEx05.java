package ch05;

class 전사{ //검
	String name = "전사";
	
	void 기본공격(궁수 e1) {
		System.out.println("검으로 " +e1.name +"  공격하기");
	}
	
	// 오버로딩 : 아랫줄에  ()안의 type이 다르니까 오버로딩 가능, 기본공격2 말고 메서드 이름 같게 해도 됨
	// 유닛이 100개라면 기본공격1, 기본공격2, ... 등으 다 외워야 하므로 오버로딩 하면 좋다. 
	// 유닛은 기본공격이랑 class 한덩이 이런게 다유닛인가? 
	// 아래에 void 여러 개 한 것이 오버로딩임.
	void 기본공격(광전사 e1) {
		System.out.println("검으로 " +e1.name +"  공격하기");
	}
	void 기본공격(마법사 e1) {
		System.out.println("검으로 " +e1.name +"  공격하기");
	}
	void 기본공격(엘프 e1) {
		System.out.println("검으로 " +e1.name +"  공격하기");
	}
	void 기본공격(흑마법사 e1) {
		System.out.println("검으로 " +e1.name +"  공격하기");
	}
	
	//유닛이 100개라면 기본공격 메서드가 100개 되어야 한다. 엄청난 단점!!
	//오버로딩은 어느 정도 경우의 수의 제한이 있다면 좋다. 하지만 경우의 수가 많다면? 힘들어요 -> 다형성적용(OOPEx06)
	
}

class 궁수{//활
	String name = "궁수";
	
	void 기본공격(광전사 e1) { // 광전사 e1을 안 넣고 빈 상태일 때랑 넣은 거랑 뭐가다름?
		System.out.println("활로 " +e1.name +"  공격하기");
		
	}
	
}

class 광전사{// 도끼
	String name = "광전사";
	
	void 기본공격(전사 e1) {
		System.out.println("도끼로 " +e1.name +"  공격하기");
		
	}
}
	
class 마법사{// 마법
		String name = "마법사";
		
		void 기본공격(전사 e1) {
			System.out.println("마법으로 " +e1.name +"  공격하기");
			
		}
}
		
class 엘프{// 활
		String name = "엘프";
			
		void 기본공격(전사 e1) {
			System.out.println("활로 " +e1.name +"  공격하기");
				
		}
}
class 흑마법사{// 흑마법
			String name = "흑마법사";
				
			void 기본공격(전사 e1) {
				System.out.println("흑마법으로 " +e1.name +"  공격하기");
					
			}
}


public class OOPEx05 {
	
	//static void attack(전사 u1) {
		//u1.기본공격();}
	// 88번을 attack(u1)을 하려면 위의 줄이 필요함. 
		
	

	public static void main(String[] args) {
		전사 u1 = new 전사();
		궁수 u2 = new 궁수(); // 맨 앞에 궁수랑 광전사 이런 게 머였지 => type!
		광전사 u3 = new 광전사();
		마법사 u4 = new 마법사();
		엘프 u5 = new 엘프();
		흑마법사 u6 = new 흑마법사();
		
		
		// 오버로딩에 의해서 기억해야 할 메서드 이름이 기본공격();만 알게 됨.
		u1.기본공격(u2); //u2를 받음?? 뭔 소리지?
		u2.기본공격(u3);
		u3.기본공격(u1);
		u1.기본공격(u3);
		u1.기본공격(u4);
		u1.기본공격(u5);
		u1.기본공격(u6);
		//88번 에서 u1.기본공격(); : attack(u1); 왜 주석처리한대로 안하고 앞에 처럼 하라고 하지? 결과는 같은데!

	}

}
