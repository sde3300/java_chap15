package java_chap15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
//		Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();

//		put() 데이터 추가하기
//		get() 데이터 가져오기
//		객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 동일한 키를 사용할 경우 해당 키의 데이터를 변경
//		size() hashmap에 저장된 데이터 수 확인 
		System.out.println("총 Entry 수 : " + map.size());
		
//		객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
//		객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
//		객체 찾기 
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		
//		객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
//		객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}

}