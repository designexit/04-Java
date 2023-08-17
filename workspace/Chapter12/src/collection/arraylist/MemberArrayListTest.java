package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberArrayList = new MemberArrayList();
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		memberArrayList.showAllMember();
				
		memberArrayList.insertMember(memberHong, 0);		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember2(1004);
		memberArrayList.showAllMember();
		
	}

}
