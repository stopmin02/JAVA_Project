package Hallyu;

// 2. Hallyu_world 클래스를 상속하여 중국에 대한 클래스와 생성자를 생성
public class Hallyu_China extends Hallyu_world{

	Hallyu_China(String nation, double movie, double kpop, double drama, double entertainment){
		this.nation  = nation;
		this.movie = movie;
		this.kpop = kpop;
		this.drama = drama;
		this.entertainment = entertainment;
	}
}
