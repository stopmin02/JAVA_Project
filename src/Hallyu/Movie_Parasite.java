package Hallyu;

// 5. 인터페이스의 매개변수 다형성의 구현객체
public class Movie_Parasite implements Movie{
	@Override
	public void info() {
		System.out.println("영화 감독 : 봉준호");
		System.out.println("영화 내용 : 상류층과 하류층, 두 가족의 만남을 다룬 대한민국의 블랙 코미디 가족 드라마 영화이다.");
	}
}
