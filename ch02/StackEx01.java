package ch02;

public class StackEx01 {

	static void a() {
		StackEx01.b(); // b랑 클래스명이 같아서 StackEx01.을 생략하고 적어도 됨
		System.out.println("a2");
		System.out.println("a3");
		System.out.println("a4");
	
	}
	
	static void b() {
		System.out.println("b1");
		System.out.println("b2");
		System.out.println("b3");
	}
	
	public static void main(String[] args) {
		System.out.println("m1");
		System.out.println("m2");
		StackEx01.a();
		System.out.println("m4");
		System.out.println("m5");
		
	}

}
