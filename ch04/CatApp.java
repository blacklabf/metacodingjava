package ch04;

public class CatApp {

	public static void main(String[] args) {
		
		//new -> 메모리에 할당 (heap) -> String name, String color 가 heap공간에 뜬다.
		//Cat() -> 생성자 호출 -> 상태를 초기화 하기 위해서 생성자가 호출이 됨 
		//c1 -> heap 공간을 가르키는 주소
		// Cat : 커스텀 타입 (개발자가 만든 타입)
		
		Cat c1= new Cat("집사1", "하얀색"); // 고양이 한 마리가 힙공간에 만들어짐 , ctrl하고 new 뒤에 Cat클릭하면 Cat class 파일의 어떤 Cat인지 바로 이동가능
		// new 할 때 고양이가 탄생함이 실행됨 즉, new 할 때 생성자가 무조건 실행된다.
		//Cat c1= new Cat();  하면 위에 생성자 cat이 뜨고 매개변수를 넣어주면 다른 생성자 Cat이 뜬다. 
		System.out.println(c1.name); // null 자체도 데이터다. 값이 없음을 의미한다. heap 공간에 null 이라는 데이터가 들어가 있는 상태이다.
		System.out.println(c1.color);
		
		Cat c2= new Cat("집사2", "노란색"); // 새로운 고양이 한 마리가 힙공간에 만들어짐.
		System.out.println(c2.name); 
		System.out.println(c2.color);


	}

}
