package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashSet memberHashSet = new MemberHashSet();
		
		memberHashSet.addMember(new Member(1001,"이지원"));
		memberHashSet.addMember(new Member(1002,"손민국"));
		memberHashSet.addMember(new Member(1004,"박서훤"));
		memberHashSet.showAllMember();
		
		memberHashSet.addMember(new Member(1003,"홍길동"));
		memberHashSet.showAllMember();
	}

}
