/*
	객체지향 프로그래밍 평과과제 (배점 25점)
	학과: 컴퓨터공학부
	학번: 202103173
	이름: 정지민
	
	과제주제: 아시아 주요 국가의 분야별 한류 관심사와 최대 관심사 매체에 대한 정보
 */

package Hallyu;

import java.util.*;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class About_Hallyu {

	public static void main(String[] args) throws Exception{
		// 4. 예외처리 : 에러가 발생했을 시 Exception.printStackTrace()를 호출하면 로그에 Stack trace가 출력되어 에러를 찾기 편리해짐
		try {
			// 8. 기존 C폴더에 있는 txt파일을 불러오기 위해 입출력 스트림 중 BufferedInputStream을 활용
			// 8. Hallyu.txt에서 한류의 정의를 불러왔다.
			// 8. 대상 파일
			String filePath = "C:\\JAVA_HW\\Hallyu.txt"; 
			// 8. 파일 스트림
			FileInputStream fileStream = null;
			// 8. 파일 스트림 생성
			fileStream = new FileInputStream( filePath );
			
			// 8. 버퍼 선언
			byte[] readBuffer = new byte[fileStream.available()];
			
			while (fileStream.read( readBuffer ) != -1){}
			// 8. 출력
			System.out.println(new String(readBuffer));
			// 8. 스트림 닫기
			fileStream.close();
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		System.out.println();
		// 국가명을 입력으로 받기
		Scanner scanner = new Scanner(System.in);
		String nation;
		
		// 6. 참조타입(배열)로 4개의 국가 정보를 NationArr에 저장하여 활용할 수 있도록 함
		String[] NationArr = new String[4];
		NationArr[0] = "중국";
		NationArr[1] = "일본";
		NationArr[2] = "말레이시아";
		NationArr[3] = "인도";
		
		
		
		System.out.println("<한류에 대한 반응이 좋은 4개 국가에 대한 분야별 한류의 관심도>");
		System.out.println();
		
		// 6. 참조타입(열거타입) 변수를 선언하기
		Category cat_m = null;
		Category cat_k = null;
		Category cat_d = null;
		Category cat_e = null;
		Category cat_a = null;
		
		// 6. 선언한 변수에 열거 상수를 대입하기
		cat_m = Category.MOVIE;
		cat_k = Category.KPOP;
		cat_d = Category.DRAMA;
		cat_e = Category.ENTERTAINMENT;
		cat_a = Category.ANIMATION;
		
		// Hallyu_world로부터 상속받은 각 국가 클래스들을 선언해준다. 매개변수에 들어가는 내용은 국가명과 선호도 퍼센트임
		Hallyu_China china = new Hallyu_China("중국", 47.2, 43.6, 42.4, 40.2);
		Hallyu_Japan japan = new Hallyu_Japan("일본", 14.2, 14.8, 13.4, 11.8);
		Hallyu_Malaysia malaysia = new Hallyu_Malaysia("말레이시아", 48.8, 38.0, 43.0, 43.2);
		Hallyu_India india = new Hallyu_India("인도", 63.6, 52.0, 57.0, 60.0, 52.2);
		
		// 각 국가의 info() 매소드를 이용해 국가명과 선도호 퍼센트를 담고 있는 정보를 출력함
		china.info();
		System.out.println();
		japan.info();
		System.out.println();
		malaysia.info();	
		System.out.println();
		india.info();
		System.out.println();
		
		// 8. 나라별 관심도에 따른 추가 정보를 제공하기 위해 참조타입(배열)을 이용하여 국가를 나열하고, 하나의 국가명을 입력받음
		System.out.println(NationArr[0] +  ", " + NationArr[1] + ", " + NationArr[2] + ", " + NationArr[3] + "중 해당 국가의 한류 관심도에 대해 알아보고자 하는 국가의 이름을 입력하시오 : ");
		nation = scanner.nextLine();
		
		// 6. 참조타입(열거)의 변수를 이용하여 한류 관심사 순위를 나타냄
		// 7. 배열을 컬렉션프레임워크의 List컬렉션으로 변경하고, boolean contains(Object o) 매소드를 이용해 주어진 객체(국가명)이 리스트에 존재한다면 해당 국가의 관심사를 나열하고 최고순위 관심사에 대한 정보를 제공하겠다는 문구를 출력함
		if(Arrays.asList(NationArr[0]).contains(nation) == true) {
			System.out.println(NationArr[0] + "의 한류_상위 관심사 순위는 " + cat_m + ", " + cat_k + ", " + cat_d + ", " + cat_e + "순이므로 한류_영화에 대한 정보를 제공해드리겠습니다.");
		}
		if(Arrays.asList(NationArr[1]).contains(nation) == true) {
			System.out.println(NationArr[1] + "의 한류_상위 관심사 순위는 " + cat_k + ", " + cat_m + ", " + cat_d + ", " + cat_e + "순이므로 한류_케이팝에 대한 정보를 제공해드리겠습니다.");
		}
		if(Arrays.asList(NationArr[2]).contains(nation) == true) {
			System.out.println(NationArr[2] + "의 한류_상위 관심사 순위는 " + cat_m + ", " + cat_e + ", " + cat_d + ", " + cat_k + "순이므로 한류_영화에 대한 정보를 제공해드리겠습니다.");
		}
		if(Arrays.asList(NationArr[3]).contains(nation) == true) {
			System.out.println(NationArr[3] + "의 한류_상위 관심사 순위는 " + cat_m + ", " + cat_e + ", " + cat_d + ", " + cat_a + ", " + cat_k + "순이므로 한류_영화에 대한 정보를 제공해드리겠습니다.");
		}
		System.out.println();
		
		// 6. 배열의 원소 사용, 7. 배열을 컬렉션프레임워크의 List컬렉션으로 변경하여 contains()메소드를 활용하여 최고 한류 관심사가 영화인 중국, 말레이시아, 인도에 해당하는 경우 영화에 대한 추가정보를 제공함
		if(Arrays.asList(NationArr[0]).contains(nation) == true || Arrays.asList(NationArr[2]).contains(nation) == true || Arrays.asList(NationArr[3]).contains(nation) == true) {
			// 8. 파일 입출력의 프린터 보조 스트림을 이용하여 라인 단위로 출력함
			// 8. 바이트 기반 출력 스트림을 생성하고 프린트 스트림 보조 스트림 연결하기
			FileOutputStream fos = new FileOutputStream("C:\\JAVA_HW\\Hallyu_info.txt");
			// 8. 프린트 스트림 생성
			PrintStream ps = new PrintStream(fos);
			
			// 7. 컬렉션 프레임워크의 List 컬렉션에서 String을 저장하는 kmovie_list을 생성함
			List<String> kmovie_list = new ArrayList<String>();
			// 7. 주어진 String 영화 객체 3개를 저장 
			kmovie_list.add("기생충");
			kmovie_list.add("마더");
			kmovie_list.add("올드보이");
			
			
			System.out.println("<유명 한류_영화 목록>");
			System.out.println();
		
			// 7. int size() 메소드를 이용하여 저장된 모든 객체 수를 리턴함
			int size_kmovie = kmovie_list.size();
			System.out.println("정보를 담고 있는 한류_영화의 수 : " + size_kmovie);
			
			// 8. 라인 단위로 txt 파일에 문자열을 출력함
			ps.println("<추천 하는 한류_영화 작품명>");
			// 7. E get(int index) 메소드를 이용하여 모든 영화의 목록을 출력하고, 8. 라인 단위로 txt 파일에 모든 영화의 목록을 문자열로 출력함 
			for(int i = 0; i < size_kmovie; i++) {
				String str_kmovie = kmovie_list.get(i);
				System.out.println(i+1 + ":" + str_kmovie);
				ps.println(i+1 + ":" + str_kmovie);
			}
			System.out.println();
			
			// 5. 인터페이스의 다형성을 이용하여 kmovie 객체를 생성함
			Hallyu_movie kmovie = new Hallyu_movie();
			
			// 5. 2개의 영화정보를 담은 3개의 인터페이스 매개변수 다형성 구현객체를 생성
			Movie_Parasite parasite = new Movie_Parasite();
			Movie_Mother mother = new Movie_Mother();
			Movie_Oldboy oldboy = new Movie_Oldboy();
			
			System.out.println("<한류_영화 간략 소개>");
			System.out.println();
			
			// 7. E get(int index) 메소드를 이용하여 영화의 제목을 불러옴
			String kmovie_title1 = kmovie_list.get(0);
			System.out.println("1: " + kmovie_title1);
			// 5. 인터페이스 다형성 구현객체로 생성한 영화정보 출력 메소드를 사용. 타입 변환을 통해 영화의 정보를 출력
			kmovie.information(parasite);
			System.out.println();
			
			String kmovie_title2 = kmovie_list.get(1);
			System.out.println("2: " + kmovie_title2);
			kmovie.information(mother);
			System.out.println();
			
			String kmovie_title3 = kmovie_list.get(2);
			System.out.println("3: " + kmovie_title3);
			kmovie.information(oldboy);
			System.out.println();
			
			// 8. 버퍼에 잔류하는 문자열을 모두 보내고, 출력 스트림 닫기
			ps.flush();
			ps.close();	
			
		}
	
		// 7. 배열을 컬렉션프레임워크의 List컬렉션으로 변경하여 contains()메소드를 활용하여 최고 한류 관심사가 케이팝인 일본에 해당하는 경우 영화에 대한 추가정보를 제공함
		else if(Arrays.asList(NationArr[1]).contains(nation) == true) {
			// 8. 파일 입출력의 프린터 보조 스트림을 이용하여 라인 단위로 출력함
			// 8. 바이트 기반 출력 스트림을 생성하고 프린트 스트림 보조 스트림 연결하기
			FileOutputStream fos = new FileOutputStream("C:\\JAVA_HW\\Hallyu_info.txt");
			// 8. 프린트 스트림 생성
			
			PrintStream ps = new PrintStream(fos);
			// 7. 컬렉션 프레임워크의 List 컬렉션에서 String을 저장하는 kpop_list을 생성함
			List<String> kpop_list = new ArrayList<String>();
			// 7. 주어진 String 케이팝 객체 3개를 저장 
			kpop_list.add("Butter");
			kpop_list.add("Pink Venom");
	
		
			System.out.println("<유명 한류_케이팝 목록>");
			System.out.println();
		
			// 7. int size() 메소드를 이용하여 저장된 모든 객체 수를 리턴함
			int size_kpop = kpop_list.size();
			System.out.println("정보를 담고 있는 한류_케이팝의 수 : " + size_kpop);
			
			// 8. 라인 단위로 txt 파일에 문자열을 출력함
			ps.println("<추천 하는 한류_케이팝 곡명>");
			// 7. E get(int index) 메소드를 이용하여 모든 케이팝의 목록을 출력하고, 8. 라인 단위로 txt 파일에 모든 영화의 목록을 문자열로 출력함 
			for(int i = 0; i < size_kpop; i++) {
				String str_kpop = kpop_list.get(i);
				System.out.println(i+1 + ":" + str_kpop);
				ps.println(i+1 + ":" + str_kpop);
			}
			System.out.println();
		
			// 5. 인터페이스의 다형성을 이용하여 kpop 객체를 생성함
			Hallyu_kpop kpop = new Hallyu_kpop();
		
			// 5. 2개의 노래 정보를 담은 2개의 인터페이스 매개변수 다형성 구현객체를 생성
			Kpop_Butter butter = new Kpop_Butter();
			Kpop_Pinkvenom pinkvenom = new Kpop_Pinkvenom();
		
			System.out.println("<한류_케이팝 간략 소개>");
			System.out.println();
		
			// 7. E get(int index) 메소드를 이용하여 케이팝의 제목을 불러옴
			String kpop_title1 = kpop_list.get(0);
			System.out.println("1: " + kpop_title1);
			// 5. 인터페이스 다형성 구현객체로 생성한 케이팝정보 출력 메소드를 사용. 타입 변환을 통해 케이팝의 정보를 출력
			kpop.information(butter);
			System.out.println();
		
			String kpop_title2 = kpop_list.get(1);
			System.out.println("2: " + kpop_title2);
			kpop.information(pinkvenom);
			System.out.println();
			
			// 8. 버퍼에 잔류하는 문자열을 모두 보내고, 출력 스트림 닫기
			ps.flush();
			ps.close();
			
		}
		// 지정된 국가명이 아닌 다른 입력값을 입력했을 경우
		else {
			// 8. 바이트 기반 출력 스트림을 생성하고 프린트 스트림 보조 스트림 연결하기
			FileOutputStream fos = new FileOutputStream("C:\\JAVA_HW\\Hallyu_info.txt");
			// 8. 프린트 스트림 생성
			PrintStream ps = new PrintStream(fos);
			
			System.out.println("잘못된 값을 입력하였습니다. 다시 실행해주세요.");
			 
			// 8. 아무 작업도 하지 않고 출력 스트림 닫기 -> 빈 텍스트파일
			ps.flush();
			ps.close();
		}

	}
	
}

