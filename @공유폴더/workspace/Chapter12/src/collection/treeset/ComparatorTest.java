package collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2) * -1;
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<String>(new MyComparator());
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		System.out.println(set);
	}

}










