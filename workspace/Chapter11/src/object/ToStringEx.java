package object;

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
//	@Override
//	public String toString() {
//		return bookTitle + "," + bookNumber;
//	}
}



public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(200, "개미");
		Book book2 = new Book(300, "개미");
//		Book book2 = book1;
		
		System.out.println(book1);
//		System.out.println(book1.toString());
		System.out.println(book2);
		System.out.println(book1.equals(book2));
		
//		String str = new String("test");
//		Integer i1 = new Integer(100);
////		int i2 = 3; -->int. 대신 Integer로 불러야...
//		
//		System.out.println(str);
//		System.out.println(str.toString());
//		System.out.println(i1);
//		System.out.println(i1.toString());
////		i1 = i1.toString();
		
		
	}

}
