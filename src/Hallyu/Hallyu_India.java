package Hallyu;

// 2. Hallyu_world 클래스를 상속하여 인도에 대한 클래스와 생성자를 생성
// 인도는 다른나라와 달리 애니메이션의 선호도가 3위로 상당히 높아 매소드 오버라이딩을 통해 정보출력문을 변형해줌
public class Hallyu_India extends Hallyu_world{
	double animation;
	
	Hallyu_India(String nation, double movie, double kpop, double drama, double entertainment, double animation){
		this.nation  = nation;
		this.movie = movie;
		this.kpop = kpop;
		this.drama = drama;
		this.entertainment = entertainment;
		this.animation = animation;
	}
	
		@Override
		void info() {
			System.out.println(nation + "의 한류 선호도 비율에서 영화는 " + movie + "%, kpop은 " + kpop + "%, 드라마는 " + drama  + "%, 예능은 " + entertainment + "%, 애니메이션은 " + animation + "%를 차지했습니다." );
	}
}
