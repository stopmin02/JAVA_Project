package Hallyu;

// 5. 인터페이스의 매개변수 다형성의 구현객체
public class Kpop_Butter implements Pop{
	@Override
	public void info() {
		System.out.println("노래 가수 : BTS");
		System.out.println("노래 정보 : 2021년 5월 21에 발매된 방탄소년단의 디지털 싱글 영어곡이다.");
	}

}