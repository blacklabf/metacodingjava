package ch04;

// 값을 초기화 하지 않는 이유는 new 할 때 마다 다른상태를 가진 고양이를 만들기 위해서다!!
public class Cat {
	String name; // 값을 안 넣었다. = 초기화하지 않았다.
	String color;
	
	// Cat() 생성자를 디폴트(기본) 생성자라고 한다. : 매개변수가 없는 것 , Cat()에서 ()안 에 아무것도 없우므
	// 개발자가 생략 가능한 코드
	public Cat() {// 디폴트 생성자(메서드) : 빈공간에 ctrl+space 하면 constructor가 나옴
		
	}
	
	// 개발자가 직접 생성자 구현함 = 디폴트 생성자가 생기지 않음 = 디폴트 생성자를 무조건 적어야 함.
	public Cat(String n, String c) { // String n , String c 가 매개변수 생성자(메서드) 
		System.out.println("고양이가 탄생함");
		System.out.println("n :" + n);
		System.out.println("c :" +c);
		
		// String n, String c 는 지역변수 = Cat() 이라는 생성자(메서드)가 가진 지역변수
		name = n;
		color = c;
		// 메모리에 뜨게 된다면 10번부터 12번 라인은 heap 공간 , 15벝부터 22번은 stack 공간
		// 21번 , 22번을 통해 stack 공간에 있는 걸 heap 공간으로 넣어줌.
	}
}
// 디폴트 생성자 : 
// 개발자가 적지 않아도 있는 것! (생략가능한 코드)
// 내가 직접 생성자를 구현하게 되면 디폴트 생성자가 생략될 수 없다.
//개발자가 직접 생성자를 구현함. - 그래서 원래는 10번부터 12라인까지 생략 가능한데 이 경우에는 무조건 적어주어야 CatApp 파일에서 오류가 안 남.
