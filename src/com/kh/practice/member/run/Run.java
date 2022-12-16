package com.kh.practice.member.run;

import java.util.List;

import com.kh.practice.member.controller.MemberController;
import com.kh.practice.member.model.vo.Member;
import com.kh.practice.member.view.MemberView;

public class Run {
	public static void main(String [] args) {
		MemberView view = new MemberView();
		MemberController mCon = new MemberController();
		done:
		while(true) {
			int choice = view.mainMenu();
			switch(choice) {
			case 1 : List<Member> mList = mCon.printAllMember();
			view.showAllMember(mList);
			break;
			case 2 : 
				String memberId = view.inputMemberId("검색");
				Member mOne = mCon.findMemberId(memberId);
				if(mOne == null) {
					// 없습니다 메시지 출력
				}
//				int index = mCon.findMemberId(memberId);
//				if(index == -1) {
//					
//				}
//				Member mOne = mCon.printOneByIndex(index);
				view.showOneMember(mOne);
				break;
			case 3 : 
				String memberName = view.inputMemberName();
				Member memberOne = mCon.findMemberName(memberName);
				view.showOneMember(memberOne);
				break;
			case 4 :
				Member member = view.inputMember();
				view.inputMember();
				mCon.registerMember(member);
				view.displaySuccess("가입이 완료되었습니다");
				break;
			case 5 : 
				member = view.modifyMember();
				mCon.updateMember(member);
				view.displaySuccess("수정이 완료되었습니다");
				break;
			case 6 : 
				memberId = view.inputMemberId("삭제");
				int index = mCon.findMemberIndex(memberId);
				mCon.removeMember(index);
				view.displaySuccess("계정이 삭제 되었습니다.");
				break;
			case 0 : break done;
			}
		}
	}
}
