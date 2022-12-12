package Hallyu;

// 5. 인터페이스의 매개변수 다형성의 구현객체
public class Kpop_Pinkvenom implements Pop{
	@Override
	public void info() {
		System.out.println("노래 가수 : 블랙핑크");
		System.out.println("노래 정보 : 2022년 8월 19일에 발매된 걸그룹 블랙핑크의 정규 2집의 선공개곡이다.");
	}
}
