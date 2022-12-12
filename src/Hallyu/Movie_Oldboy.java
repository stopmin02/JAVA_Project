package Hallyu;

// 5. 인터페이스의 매개변수 다형성의 구현객체
public class Movie_Oldboy implements Movie {
	@Override
	public void info() {
		System.out.println("영화 감독 : 박찬욱");
		System.out.println("영화 내용 : 오대수라는 인물이 15년 동안 갇혀 있던 방에서 탈출하면서 벌어지는 이야기를 담은 영화이다.");
	}
}
