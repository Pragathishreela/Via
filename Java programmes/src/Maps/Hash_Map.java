package Maps;

import java.util.HashMap;

public class Hash_Map {
	public static void main(String[] args) {
		HashMap h1 = new HashMap<>();
		h1.put(1, "Pragathi");
		h1.put(2,"Praveen");
		h1.put("Name", "Meghana");
		h1.put("School name", "BGS PUBLIC SCHOLL");
		h1.put(3, "Meghana");
		System.out.println(h1);
		h1.put(3, "Meghanaa");
		HashMap h2 = new HashMap<>();
		h2.putAll(h1);
		h2.put(4, "Praveen");
		System.out.println(h2);
		System.out.println(h2.size());
		System.out.println(h2.isEmpty());
		System.out.println(h2.containsKey(1));
		System.out.println(h2.containsValue("Meghanaa"));
		System.out.println(h2.get(2));
		System.out.println(h2.remove(4));
		System.out.println(h2);
		System.out.println(h2.keySet());
		System.out.println(h2.values());
		System.out.println(h2.entrySet());
		//h2.clear();
		System.out.println(h2);
		for( Object i : h2.entrySet()) {//we can store it in Set type becoz it returns Set of keys
			System.out.println(i);
		}
		for( Object i : h2.values()) {
			System.out.println(i);
		}
		for( Object i : h2.keySet()) {
			System.out.println(i);
		}
		System.out.println(h2.get(9));
	}
}
