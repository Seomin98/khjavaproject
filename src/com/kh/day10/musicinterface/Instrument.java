package com.kh.day10.musicinterface;

public interface Instrument {
	// 상수
	// 추상메소드
	void play();
	public abstract void makeSound();
}
// instrument - 각종 악기 - musician - 각 악기에 implements -
// musician에 하나로 받을 수 있게 묶어줌 - 인터페이스에 있는 게 아닌
// 오버라이딩된 것으로 stagerun값에서 실행
