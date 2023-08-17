package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Computer c = new Computer(); // -->추상클래스는 불러올 수 없다(abstract class가 있는 클래스)
		Desktop d = new Desktop();
		//NoteBook n = new NoteBook();
		MyNoteBook m = new MyNoteBook();
		
		d.display();
		d.typing();
		m.display();
		m.typing();
	}

}
