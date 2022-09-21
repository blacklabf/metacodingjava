package ch02;

public class StackEx02 {
	
	static int sum = 20; // 전역변수 (static 공간) , main메서드가 시작되기전에 sum이 할당되고 main 메서드가 종료될때 (자바프로그램이 종료될때) 사라진다.
	//static을 붙여야 메모리에 떠서 main 메서드에서 접근 가능
	int value = 50; // 전역변수 (heap 공간) // 더 이상 참조하지 않을 때 자동으로 사라진다. // 22번째 라인에서 사라짐

	static void a() {
		// a 메서드가 실행될 때 stack공간에 n1이 할당되고 a메서드가 종료되면 메모리에 사라져요.
		int n1 = 1; //a 메서드의 stack 영역에 저장됨 (지역변수,stack공간) - 외부에서는 절대 접근할 수가 없다.
		System.out.println(n1);
		
		// 16번 라인이 실행되려고 할 때 static 공간에 할당해야 하는데 불가능! - static공간 할당은 main메서드 실행전에만 가능하다.
		// 20번 라인에서 a의 메서드가 열리고 11,12,16라인 순으로 가는데 static은 main실행 전에 열리기 때문에 오류가 발생한다. 
		// static int n2 = 2;
	}
	
	public static void main(String[] args) {
		a(); // a의 메서드를 호출한다.
		// System.out.println(n1); //n1이 지역변수여서 외부에서 접근 불가
		System.out.println(sum); //static 에 떠서 전역변수이므로 외부에서도 접근가능!
		StackEx02 s= new StackEx02(); // 7번째 줄에서 메모리에 뜨지 않으니까 여기서 new를 해서 메모리를 띄움 / s는 변수명
	    // new 하면 main을 제외한 static이 아닌 모든 것들이 뜨는데 그래서 value가 heap 공간에 뜸 : 전역변수
	    System.out.println(s.value);
	    System.out.println("test1-더 이상 s변수를 참조하지 않기 때문에 heap공간에 떠 있던 value가 메모리에서 사라진다.");
	}

}

// 5번이 메모리 공간에서 제일 먼저 뜨고 main 메서드가 시작되기전에 sum이 할당된다.
// 23번 라인에서 heap 공간에 value가 할당된다. 

/*
 * 정리 : Stack(지역변수=메서드가 실행될 때 메모리에 할당돼요 = 메모리가 종료될 때(a메서드가 종료되면) 메모리에서 사라져요)
 *       : Heap(전역변수=new할 때 메모리에 할당돼요 = 더이상 참조하지 않을 때 메모리에서 사라져요)
 *       : Static(전역변수=main메서드가 실행되기 전에 메모리에 할당돼요 = main메서드가 종료되면(자바프로그램이 종료되면) 메모리에서 사라져요)
 */
