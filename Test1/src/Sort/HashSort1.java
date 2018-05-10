package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashSort1 {
	public static void main(String[] args) {
		HashMap<Integer,User> hashMap=new HashMap<>();
		hashMap.put(5, new User("皮皮1",30));
		hashMap.put(16, new User("皮皮2",14));
		hashMap.put(1, new User("皮皮3",20));
		hashMap.put(3, new User("皮皮1",100));
		hashMap.put(11, new User("皮皮2",60));
		hashMap.put(122, new User("皮皮3",-9));
		Set<Entry<Integer,User>> entrySet = hashMap.entrySet();
		List<Entry<Integer,User>> list=new ArrayList<>(entrySet);
		list.add(null);
		System.out.println(list);
		Collections.sort(list, new Comparator<Entry<Integer,User>>() {

			@Override
			public int compare(Entry<Integer, User> o1, Entry<Integer, User> o2) {
				// TODO Auto-generated method stub
				return o1.getKey()-o2.getKey();
/*				return o1.getValue().getAge()-o2.getValue().getAge();
*/			}
		});
		LinkedHashMap<Integer, User> linkedHashMap=new LinkedHashMap<>();
		for (Entry<Integer, User> entry : list) {
			linkedHashMap.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(linkedHashMap);
		HashMap<Integer,User> sorthashMap=linkedHashMap;
	}
	
}
