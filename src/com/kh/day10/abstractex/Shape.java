package com.kh.day10.abstractex;

// 4. The type Line must implement 
// the inherited abstract method Shape.draw()
abstract class Line extends Shape {
	
}

// 3. The type Shape must be an abstract class 
// to define abstract methods
public abstract class Shape {
	public Shape() {}
	public void paint() {}
	abstract public void draw();
	// 2. The abstract method draw in type Shape 
	// can only be defined by an abstract class 
	// 1. Abstract methods do not specify a body
}
