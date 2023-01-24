package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {

		// HashMap
		// 1. no ordering maintained -- no indexing
		// 2. stores data in -- key-value pair <k,v>
		// 3. key can't be duplicate
		// 4. key are case sensitive
		// 5. we can store 'n' no of null values, but only one null key
		// 6. HashMap is not thread-safe -- unsynchronized

		// HashMap<keyGeneric,valueGeneric> variableName = new
		// HashMap<keyGeneric,valueGeneric>();
		HashMap<String, String> cityName = new HashMap<String, String>();

		// put("key","value")
		cityName.put("mah", "mumbai");
		cityName.put("guj", "surat");
		cityName.put("raj", "jaipur");
		
		// if we use duplicate key then new key-value will override old value
		cityName.put("guj", "ahmedabad");
		// if we use duplicate null key then new null key-value will override old value
		cityName.put(null, "indore");
		cityName.put(null, "shimla");

		cityName.put("UP", null);
		cityName.put("AP", null);
		cityName.put("bihar", "bihar city");

		// get("key") -- returns corresponding value
		System.out.println(cityName.get("mah"));
		System.out.println(cityName.get("guj"));
		// if key not present then null is returned
		System.out.println(cityName.get("goa"));
		System.out.println(cityName.get(null));

		System.out.println(cityName.get(null));

		System.out.println(cityName.get("UP"));
		System.out.println(cityName.get("AP"));
		System.out.println(cityName.get("bihar"));

		System.out.println("-----------");

		// remove("key") -- removes key-value pair
		cityName.remove("bihar");
		// directly printing HashMap
		System.out.println(cityName);

		// iterator: over the keys : by using sets
		Iterator<String> cityKeys = cityName.keySet().iterator();
		while (cityKeys.hasNext()) {
			String key = cityKeys.next();
			String value = cityName.get(key);
			System.out.println("key = " + key + " value = " + value);
		}
		System.out.println("---entrySet()-----");

		// iterate: over the set(pair) : using enrtySet()
		// Entry interface stores values in key value pair
		Iterator<Entry<String, String>> i1 = cityName.entrySet().iterator();

		while (i1.hasNext()) {
			Entry<String, String> pair1 = i1.next();
//			System.out.println(pair1);
			System.out.println(pair1.getKey() + "  " + pair1.getValue());
		}
		System.out.println("-*-*-*-*-*-*-");
		Iterator<Entry<String, String>> i2 = cityName.entrySet().iterator();
		while (i2.hasNext()) {
			Map.Entry<String, String> pairs = (Map.Entry<String, String>) i2.next();
			System.out.println(pairs.getKey() + " * " + pairs.getValue());
		}
		System.out.println("----forEach----");
		// iterate HashMap using forEach and lambda
		cityName.forEach((k, v) -> System.out.println(k + "  " + v));

	}

}
