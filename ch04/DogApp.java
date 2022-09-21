package ch04;

public class DogApp {

	public static void main(String[] args) {
		Dog d1 = new Dog(); // Dog.class에 static이 없어서 메모리에 띄우지 못하기 때문에 new 해서 Heap 공간에다가 띄움 (타입 변수명) 
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.type);
		
		// 1년이 지났다. 강아지가 염색을 노란색, 이름도 레르코로 했다.
		d1.age = d1.age + 1;
		d1.color = "노란색";
		d1.name = "레르코";
		// d1.type = "푸들";
		System.out.println(d1.name);
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.type);
		
	}

}
//age, color, name, type등을 변수 = 필드 = 전역변수 = 힙변수 = 상태
// 전역변수 = 지역변수가 아니다 = 메서드 내부에서 만든 것이 아니다.