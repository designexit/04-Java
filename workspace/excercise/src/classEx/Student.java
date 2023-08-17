package classEx;

public class Student {
	int sNO;
	String name;
	String dept;
	int scores1;
	int scores2;
	int scores3;
	int total; // = scores1 + scores2 +scores3 ;
	double avg; // = (scores1 + scores2 +scores3) / 3;
	int rank;
	
	public Student(int sNO, String name, String dept, int scores1, int scores2, int scores3, int total, double avg, int rank) {
		this.sNO = sNO;
		this.name = name;
		this.dept = dept;
		this.scores1 = scores1;
		this.scores2 = scores2;
		this.scores3 = scores3;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
	}
	
	public int getsNO() {
		return sNO;
	}
	public void setsNO(int sNO) {
		this.sNO = sNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getScores1() {
		return scores1;
	}
	public void setScores1(int scores1) {
		this.scores1 = scores1;
	}
	public int getScores2() {
		return scores2;
	}
	public void setScores2(int scores2) {
		this.scores2 = scores2;
	}
	public int getScores3() {
		return scores3;
	}
	public void setScores3(int scores3) {
		this.scores3 = scores3;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void showStudentInfo() {
		System.out.println(sNO + name + dept + scores1 + scores2 + scores3 + total + avg + rank);
//		System.out.println(name);
//		System.out.println(dept);
//		System.out.println(scores1);
//		System.out.println(scores2);
//		System.out.println(scores3);
//		System.out.println(total);
//		System.out.println(avg);
//		System.out.println(rank);
		
	}
	

	
	

}
