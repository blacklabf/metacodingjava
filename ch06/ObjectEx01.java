package ch06;

class Dog extends Object{ // extends Object 안 해도 저게 되어있는 거라서 상관x
	String name = "토토";
}

class Cat{
	String name = "야옹이";
}

public class ObjectEx01 {

	public static void main(String[] args) {
		Object o1 = new Dog(); // 다형성
		Object o2 = new Cat(); //
		
		// Dog d1 = o1; / o1은 타입이 오브젝트 타입이라서 이렇게 하면 안된다. - 아래처럼 dog라고 다운캐스팅
		Dog d1 = (Dog)o1;
		Cat c1 = (Cat)o2;
		
		System.out.println(d1.name);
		System.out.println(c1.name);
		
		//Cat c2 = (Dog)o1; / 이렇게는 다운캐스팅이 안됨. - 실행시에 오류가 남.
	}

}
