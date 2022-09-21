package ch05;

//추상클래스 : 도대체 장점은 뭐고 추상클래스를 안 쓰면 어떻게 구현할 수 있는거지?
abstract class Animal{
	// void speak() {} // 어차피 무효화 되어서 {} 안에 뭐가 있더라도 실행되지 않음.
	abstract void speak(); // 추상메서드 (몸체 ,{} 부분이 없다)
	
	void Hello() {
		System.out.println("!!!");
		/// 추상 클래스안에 추상메서드랑 일반 메서드 모두 구현 가능하지만 추상 메서드는 자식들이 꼭 구현을 해야한다. 
	}
}

class Dog extends Animal{ // dog ,cat, bird 모두 animal로 extends 해서 타입이 일치됨.
	// 오버라이드 (Animal의 speak()가 무효화 된다.)
	void speak() {
		System.out.println("멍멍");
	}
	
}

class Cat extends Animal{
	// 오버라이드 (Animal의 speak()가 무효화 된다.)
	void speak() {
		System.out.println("야옹");
	}
	
}

// 신입아 bird를 만들어, Animal을 상속해서 만들어 // sysout 짹짹
class Bird extends Animal{

	// 추상메서드를 부모가 가지고 있으면 자식은 추상메서드를 반드시 구현해야 한다. 
	@Override
	void speak() {
		System.out.println("짹짹");
	}
	
}

public class OOPEx07 {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Bird();
		a1.speak(); // 동적바인딩 된다. 왜? 부모의 메서드가 무효화되니까! : Animal의 speak를 호출하러 갔다가 무효화 되어있어서 각각 Dog,Cat의 speak를 호출
		a2.speak();
		a3.speak();
		
		
		// Animal a3 = new Animal(); // Animal이 추상클래스여서 new 할 수 없다.
	}

}
