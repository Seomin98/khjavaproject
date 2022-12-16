package com.kh.practice.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.member.model.vo.Member;

public class MemberView {
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === === 회원관리 프로그램 === === ===");
		System.out.println("1. 회원정보 전체조회");
		System.out.println("2. 회원 아이디로 조회");
		System.out.println("3. 회원 이름으로 조회");
		System.out.println("4. 회원가입");
		System.out.println("5. 회원정보 변경");
		System.out.println("6. 회원탈퇴");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 선택  : ");
		int value = sc.nextInt();
		return value;
	}
	
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String memberId = sc.next();
		System.out.println("비밀번호 : ");
		String memberPwd = sc.next();
		System.out.println("이름 : ");
		String memberName = sc.next();
		System.out.println("나이 : ");
		int memberAge = sc.nextInt();
		System.out.println("성별 : ");
		String memberGender = sc.next();
		System.out.println("이메일 : ");
		String memberEmail = sc.next();
		System.out.println("전화번호 : ");
		String memberPhone = sc.next();
		System.out.println("주소 : ");
		sc.nextLine();
		String memberAdress = sc.nextLine();
		System.out.println("취미 : ");
		String memberHobby = sc.next();
		Member member = new Member();
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setMemberAge(memberAge);
		member.setMemberGender(memberGender);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAdress);
		member.setMemberHobby(memberHobby);
		return member; // 리턴값 안하면 값 사라짐!!!
	}
	
	public String inputMemberId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 아이디 입력 : ");
		String memberId = sc.next();
		return memberId;
	}
	
	public void showAllMember(List<Member> mList) {
		System.out.println("=== === === 회원정보 전체조회 === === ===");
		for(Member mOne : mList) {
			System.out.println("회원 아이디 : " + mOne.getMemberId());
			System.out.println("회원 이름 : " + mOne.getMemberName());
			System.out.println("회원 성별 : " + mOne.getMemberGender());
			System.out.println("회원 나이 : " + mOne.getMemberAge());
			System.out.println("회원 이메일 : " + mOne.getMemberEmail());
			System.out.println("회원 폰번호 : " + mOne.getMemberPhone());
			System.out.println("회원 주소 : " + mOne.getMemberAddress());
			System.out.println("회원 취미 : " + mOne.getMemberHobby());
			System.out.println("=== === === === === === === === === ===");

		}
	}
	
	public void printOneById(Member mOne) {
		System.out.println(mOne.toString());

	}
}

//	======= 회원관리 프로그램 =======
//			1. 회원정보 전체조회
//			2. 회원 아이디로 조회
//			3. 회원 이름으로 조회
//			4. 회원가입
//			5. 회원정보 변경
//			6. 회원탈퇴
//			0. 프로그램 종료
//			메뉴 선택 :