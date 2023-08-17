package classpart;

//public class Mydate {
//	public int day;
//	public int month;
//	public int year;
//
//	public void setDay(int day) {
//		if (month == 2) {
//			if (day < 1 || day > 28) {
//				System.out.println("오류");
//			} else {
//				this.day = day;
//			}
//		}
//	}
//
//	public void setMonth(int month) {
//		if (month < 1 || month > 12) {
//			System.out.println("오류");
//		} else {
//			this.month = month;
//		}
//	}
//
//	
//
//}

public class Mydate {
	private int day;
	private int month;
	private int year;
	public boolean isValid;
	
	public Mydate() {}
	public Mydate(int day, int month, int year, boolean isValid) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.isValid = isValid;
	}
	
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}
	

//	public void setDay(int day) {
//		if (month == 2) {
//			if (day < 1 || day > 28) {
//				System.out.println("오류");
//			} else {
//				this.day = day;
//			}
//		}
//	}
//
//	public void setMonth(int month) {
//		if (month < 1 || month > 12) {
//			System.out.println("오류");
//		} else {
//			this.month = month;
//		}
//	}

	public String isValid() {
		
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("유효하지 않는 날짜입니다.");
			} else {
				this.day = day;
			}
		}
	}


	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println("오류");
		} else {
			this.month = month;
		}
	}
	

}

