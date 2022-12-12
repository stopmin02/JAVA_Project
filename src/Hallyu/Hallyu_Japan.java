package Hallyu;

// 2. Hallyu_world 클래스를 상속하여 일본에 대한 클래스와 생성자를 생성
public class Hallyu_Japan extends Hallyu_world {

	Hallyu_Japan(String nation, double movie, double kpop, double drama, double entertainment){
		this.nation  = nation;
		this.movie = movie;
		this.kpop = kpop;
		this.drama = drama;
		this.entertainment = entertainment;
	}
}
