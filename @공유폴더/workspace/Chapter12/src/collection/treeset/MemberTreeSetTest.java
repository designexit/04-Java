package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		memberTreeSet.addMember(new Member(1003,"c"));
		memberTreeSet.addMember(new Member(1001,"b"));
		memberTreeSet.addMember(new Member(1002,"a"));
		memberTreeSet.showAllMember();
		
		memberTreeSet.addMember(new Member(1003,"c"));
		memberTreeSet.showAllMember();
	}

}









