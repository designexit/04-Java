package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("횽연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));

		System.out.println(hashSet);

	}

}
