package ch05;

// 접근제어자 = 디폴트 접근제어자, public 접근제어자, private 접근제어자
class Player{
	// 상태 = 필드 (전역변수)
	String name; // 이름 - 상태1 
	private int thirty; // 목마름(0~100) - 상태2 // 외부클래스에서 접근 불가능
	
    public Player(String name, int thirty) { //초기화 하기 위해서 생성자가 필요함.
    	this.name = name; //7번라인() 안에 stack으로 받은 변수를 4,5번의 heap에다가 넣어 준다.
    	this.thirty = thirty;
    	}
    
    //행위 = 메서드 = 값을 변경 but 접근을 못함
    void 물마시기() { //행위를 만듦
    	System.out.println("물마시기 행위");
    	this.thirty = this.thirty - 50; // 물을 한 잔 마실 때마다 갈증지수가 50씩 감소
    }
    
    int 목마름상태확인() {
    	return this.thirty; // thirty에 바로 접근 못하고 행위로 접근함
    }
}// 기본 클래스가 만들어짐.
public class OOPEx01 {

	public static void main(String[] args) {
		Player p1 = new Player("홍길동",100); //디폴트 생성자를 안 적었기 때문에(위에서 생성자를 개발자가 만들어서 꼭 적어줘야 함) 괄호 안에 아무것도 없으면 안됨
		System.out.println("이름은 :" +p1.name);
		System.out.println("갈증지수 :" +p1.목마름상태확인()); // thirty가 private가 되었기 때문에 p1.thirty를 변경해야 함
		
		//1.첫번째 시나리오 = 마법 (이렇게 하면 안돼요)
		//p1.thirty  = 50; // 아무런 원인없이 갈증지수 변경 = 마법
		//System.out.println("갈증지수 :" +p1.thirty); // 원인없이 상태가 변경되면 객체지향 프로그래밍이 아니다.
		
		//2. 두번째 시나리오 = 상태가 행위를 변경함 (이렇게 하면 안돼요) - 신입이 실수할 수 있음.
		//p1.물마시기();  // 행위를 통해해서 상태를 변경한 거는 맞지만 
		//p1.thirty = 50; // 신입의 실수 : 이렇게 하면 값은 50이지만 method를 이용한 게 아니므로 객체지향 아님
		//System.out.println("갈증지수 :" +p1.thirty);
		
		//3.세번째 시나리오 - 이렇게 해야 함! : 객체지향 프로그래밍!
		//p1.thirty = 50; // 이렇게 하면 오류가 남- 실수를 용납하지 않음.
		p1.물마시기();
		System.out.println("갈증지수 :" +p1.목마름상태확인());
		
		

	}

}
