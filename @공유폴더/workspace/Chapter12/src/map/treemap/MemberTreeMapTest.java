package map.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		memberTreeMap.addMember(new Member(1003,"박서훤"));
		memberTreeMap.addMember(new Member(1001,"이지원"));
		memberTreeMap.addMember(new Member(1001,"이지투"));
		memberTreeMap.addMember(new Member(1004,"홍길동"));
		memberTreeMap.addMember(new Member(1002,"손민국"));
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1004);
		memberTreeMap.showAllMember();
		
	}

}




