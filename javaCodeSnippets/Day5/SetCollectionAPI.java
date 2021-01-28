package javaCodeSnippets.Day5;

import java.util.HashMap;
import java.util.Map;

public class SetCollectionAPI {
	public static void main(String[] args) {
		
		Map hMap = new HashMap();
		hMap.put(123,"name1");
		hMap.put("key",12.34);
		hMap.put(null, "123");
		hMap.put(123, "name 2");
		System.out.println("Map Elements ::" + hMap);
		System.out.println("Value is     ::" + hMap.get(null));
		System.out.println("Keys are     ::"+ hMap.keySet());
		System.out.println("Values are   ::"+ hMap.values());
		
	}
}
