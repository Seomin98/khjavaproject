package com.kh.practice.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.member.model.vo.Member;

public class MemberController {
	List<Member> mList;
	
	public MemberController() {
		mList = new ArrayList<Member>();
	}
	
	public void registerMember(Member member) {
		// c[i] = new Circle();
		mList.add(member);
	}
	
	public List<Member> printAllMember() {
		return mList;
	}
	// ���� ���� ���� �� �ε����� ����
	public Member findMemberId(String memberId) {
		for(int i = 0; i < mList.size(); i++) {
			// memberId�� ���� �����Ͱ� 
			// mList�� �ִ��� ã�ƺ���!
			Member mOne = mList.get(i);
			// �Ѱܹ��� memberId�� mOne�� �ִ��� Ȯ��
			if(memberId.equals(mOne.getMemberId())) {
				return mOne; //return i;
			}
		}
		return null; // return -1;
	}
	// ���ϵ� �ε��� ���� �̿��Ͽ� �����͸� ã��
//	public Member printOneByIndex(int index) {
//		Member member = mList.get(index);
//		return member;
//	}
	
	public void findMemberName() {
		
	}
}
