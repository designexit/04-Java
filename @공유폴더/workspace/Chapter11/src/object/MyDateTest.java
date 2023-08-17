package object;
class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof MyDate) {
			MyDate md = (MyDate)obj;
			if(this.day == md.day 
					&& this.month == md.month
					&& this.year == md.year) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(""+this.year+this.month+this.day);
	}
}

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(10,9,2004);
		MyDate date2 = new MyDate(10,9,2004);
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
	}
}











