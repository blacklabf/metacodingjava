package ch04;

public class People { 
	String name; // 다양성을 위해서 초기화하지않음.
	int age;
	
	//디폴트 생성자가 있을까요? 넹 ; 따로 내가 생성자를 안 만들었으므로 
	//. java를 .class 파일로 컴파일 할 때 자바가 자동을 코드를 만들어줌
	// 아래 코드를 통해 내가 직접 생성자를 정의해주면 디폴트 생성자를 적어주어야 함!
	// 아니면 People App 파일에서 매개변수를 직접 적어주면 String name = "홍길동", int age =25 가 되면서 오류가 안남.
	// 이 때는 디폴트 생성자를 안 적어줘도 됨 - 왜??!!
	public People(String name, int age) { // 괄호안에 있는 거 매개변수 (동전투입구)
		System.out.println("People 메서드 스택 name : " +name);
		System.out.println("People 메서드 스택 age : " +age);
		// name = name; / 우리는 4번 name에 다가 12번의 name을 하고 싶은데 둘이 변수명이 같아서 이렇게 하면 12번의 name만 부름 => 해결방법 : this
		this.name= name; // this는 자기 자신의 heap공간을 가리킨다. (4,5번 라인) 
		this.age = age; // p1도 people의 heap 공간을 가리키지만 people 파일에서는 알 수 없기 때문에 this라는 키워드를 사용
	}
}

// this는 자기 자신의 heap 공간을 가리킨다. 