package java_chap15;

import java.util.ArrayList;
import java.util.List;
// import java.util.*; // 별 사용하면 둘다 포함됨 

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> listA = new ArrayList<String>();

		System.out.println("ArrayList 객체 listA의 크기 : " + listA.size());
		
		listA.add("아이유");
		listA.add("유재석");
		listA.add("유인나");
		
		System.out.println("ArrayList 객체 listA의 크기 : " + listA.size());
		
		String[] arrayA = new String[3];
		
		System.out.println("배열 arrayA의 크기 : " + arrayA.length);
		
		arrayA[0] = "아이유"; 
		arrayA[1] = "아이유"; 
		arrayA[2] = "아이유";
		
		System.out.println("배열 arrayA의 크기 : " + arrayA.length);
	
//		반복문을 사용하여 list의 요소 출력
//		get() 메서드를 사용하여 데이터 출력
		for (int i=0; i<listA.size(); i++) {
			System.out.println(listA.get(i));
		}
		
		for (int i=0; i<arrayA.length; i++) {
			System.out.println(arrayA[i]);
		}
		
//		list에 저장된 데이터 수정
//		set() 메서드를 사용하여 수정
		System.out.println(listA.get(0));
		listA.set(0, "정인선");
		System.out.println(listA.get(0));
		
//		문제 7) listA에 저장된 데이터를 삭제하세요
//				index 1번 삭제 후 모든 정보 출력
		listA.remove(1);
		for (int i=0; i <listA.size(); i++) {
			System.out.println(listA.get(0));
		}
		
		
	}

}
