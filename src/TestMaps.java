import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestMaps {
	public static void main(String[] args) {
		Map<String, Employee> map = new HashMap();
		Map<String, Employee> linkedmap = new LinkedHashMap();
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("XYZ");
		e1.setSalary(1000.0);
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("XYZ");
		e2.setSalary(2000.0);
		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("XYZ");
		e3.setSalary(500.0);
		map.put("1", e1);
		map.put("2", e2);
		map.put("3", e3);
	/*	TreeMap<Employee, String> treeMap = new TreeMap<Employee, String>();
		treeMap.put(e1, "1");
		treeMap.put(e2, "2");
		treeMap.put(e3, "3");
		System.out.println(treeMap);*/
		/*Iterator<Entry<Employee, String>> itr = treeMap.entrySet().iterator();
		while (itr.hasNext()){
			Entry<Employee, String>  pointer = itr.next();
			map.put(pointer.getValue(),pointer.getKey() );
		}
		System.out.println(map);*/
		List<Entry<String , Employee>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Employee>>() {
			
			public int compare(Entry<String, Employee> e1, Entry<String, Employee> e2){
				if (e1.getValue().getSalary() > e2.getValue().getSalary()) {
					return 1;
				} else if (e1.getValue().getSalary() < e2.getValue().getSalary()) {
					return -1;
				} else
					return 0;
			}
		});
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Map.Entry entry = (Map.Entry) itr.next();
			linkedmap.put((String)entry.getKey(), (Employee)entry.getValue());
		}
		System.out.println(linkedmap);
		/*producer-consumer
		print odd even sequentially using 2 threads.
		deadlock code*/
		
		
	}
}
