package ch07;

//자바의 서브 스레드
// SubThreads는 2개의 타입 (다형성) : SubThread , Runnable(부모)
class SubThread implements Runnable{ // target은 무조건 runnable 이어야 함.  
	//Runnable은 run이라는 추상메서드를 강제로 구현해줘야 함.
	@Override
	public void run() {
			for(int i=1; i<6; i++) {
				try {			
					System.out.println("서브스레드 :" +i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
}

public class ThreadEx01 {
	
	//자바의 메인 스레드
	public static void main(String[] args) {
		
		SubThread st = new SubThread();
		Thread t1 = new Thread(st); //()안의 자리가 target을 선정하는 자리 : thread가 다형성으로 runnable도 되니까 st 들어가도 됨.
		t1.start(); // run 메서드 실행
		for(int i=1; i<6; i++) {
			try {			
				System.out.println("메인스레드 :" +i);
				Thread.sleep(1000); //천천히 출력, 1000이 1초임, surround 이거 클릭
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}
