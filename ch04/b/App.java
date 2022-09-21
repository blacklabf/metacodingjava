package ch04.b;

import ch04.a.Cal; // 직접 패키지,파일명을 다 적어도 되고 9번라인에서 Cal을 적고 ctrl+space를 통해 자동완성하면 import가 됨

//main이 있는 자바파일이 실행파일 (ch04.a의 패키지의 Cal.class은 실행파일이 아님)
public class App {

	//JVM이 main메서드를 찾으려면 public이 필요 : 공개/ 아래에서 public을 지우면 static이라 메모리에 뜨지만 jvm에서 접근을 못해서 실행이 안됨
	//JVM이 mian메서드를 찾으려면 static이 필요 : 메모리에 올린다는 뜻 / 아래에서 static 지우면 메모리에 안 떠서 실행 안됨.
	//main 메서드만 retrun 타입을 허용하지 않는다. : 무조건 void / return을 안 할 거면 void를 적고 return을 할거면 void 대신에 변수의 자료형을 적고 마지막에 return을 해줘야 함 - return 1;
	//메서드의 이름은 main이다.
	//String[] args 은 매개변수이다. 
	// 그 다음 {}은 stack의 영역으로 코드가 실행되는 공간이다. 
	// 14,15,16은 Queue에 담겨서 순차적으로 실행이 될 거고 Cal c 라는 변수는 stack 내부에서 만들어 졌으므로 지역변수(메서드 내부에서 만든 변수)
	// new 하면 Cal의 static을 제외한 모든 것들이 heap 메모리 공간에 뜬다.
	public static void main(String[] args) {
		Cal c = new Cal(); //Cal은 Static이 없어서 메모리에 뜨는 게 없기 때문에 new를 통해 heap공간에다가 올림
		c.minus();
		// System.out.println(c.num);
		 

	}

}
