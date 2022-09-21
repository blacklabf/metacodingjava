package ch05;

class Engine {
	int power = 2000;
}

class Car{ // 자동차는 엔진이 아니기 때문에 상속할 수 없다.
	
	//컴퍼지션(결합)! - 잘 만들어진 걸 가져다 쓰는 거
	
	Engine e;
	
	public Car(Engine e) { //괄호안에 Engine e 왜 썼냐
		this.e =e;
	}
}

class Hamburger {
	String name = "기본햄버거";
	String 재료1 = "양상추";
	String 재료2 = "패티";
}

// 상속은 상태와 행위를 물려받을 수 있지만 꼭 타입이 일치될 수 있어야 한다.
//extends 하면 Hamburger의 코드가 CheeseHamburger에에 들어온 거임.
class CheeseHamburger extends Hamburger { // 치즈햄버거도 햄버거 이기 때문에 콤포지션 말고 상속가능
	// 겹치지 않는 상태(필드)만 물려받는다. - 겹치면 물려받지 않고 내꺼 씀
	String name = "치즈햄버거";
	
}

class ChickenHamburger{ //상속을 할 수 있지만 안 해도 상관없어서 결합함
	String name = "치킨햄버거";
	Hamburger h;
	
	public ChickenHamburger(Hamburger h) {
		this.h = h;
	}
	
}

public class OOPEx02 {

	public static void main(String[] args) {
		Engine e1 = new Engine();
		Car c1 = new Car(e1);
		System.out.println("자동차의 엔진 마력은 ; " +c1.e.power);
		
		Hamburger ch1 = new CheeseHamburger();
		System.out.println("햄버거의 이름은 : " +ch1.name); //cheese hamburger는 name이 없지만 상속받아서 사용 가능
		//cheese hamburger에다가 name을 만들어주었을 때 name이 겹치는데 그 때는 자기꺼(cheese hamburger)의 name을 쓴다.
		System.out.println("재료 : " +ch1.재료1);
		System.out.println("재료 : " +ch1.재료2);
		
		//상속이 가능하지만 결합하는 거에 대한 문법임.
		Hamburger h1 = new Hamburger();
		ChickenHamburger ckh1 = new ChickenHamburger(ch1); // 이거 할려면 윗줄 해야함. 와이!
		System.out.println(ckh1.name);
		System.out.println(ckh1.h.재료1);
		System.out.println(ckh1.h.재료2);
	}

}
