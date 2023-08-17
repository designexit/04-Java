package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.print(s + " ")); // -> 위에 선언된 stream은 한번 사용하면 다시 사용 할 수 없기 때문에 sList.stream으로 새로 생성함
		System.out.println();
		
		sList.stream().sorted().filter(s -> s.length()>=5).forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		System.out.println(sList.stream().sorted().filter(s -> s.length()>5).count());
		
		
		
	}

}
