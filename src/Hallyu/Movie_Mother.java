package Hallyu;

// 5. 인터페이스의 매개변수 다형성의 구현객체
public class Movie_Mother implements Movie{
	@Override
	public void info() {
		System.out.println("영화 감독 : 봉준호");
		System.out.println("영화 내용 : 살인 혐의를 받은 아들의 무죄를 주장하기 위해 분투하는 엄마의 이야기를 담은 영화.");
	}
}
