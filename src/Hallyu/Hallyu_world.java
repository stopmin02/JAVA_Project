package Hallyu;

// 2. 국가명, 영화, k-pop, 드라마, 예능을 필드로 가지고 있는 클래스이다. 이 클래스를 바탕으로 Hallyu_(국가명).java에서 국가별 정보를 상속
public class Hallyu_world {
	String nation;
	double movie;
	double kpop;
	double drama;
	double entertainment;
	
	void info() {
		System.out.println(nation + "의 한류 선호도 비율에서 영화는 " + movie + "%, kpop은 " + kpop + "%, 드라마는 " + drama  + "%, 예능은 " + entertainment + "%를 차지했습니다." );
	}
	
}
