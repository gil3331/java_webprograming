package DesignPackage;
//Title : Circle
//Date : 2019.05.24
//Author : 이길준
//Comment : .....
public class Circle implements Shape {//shape를 물려받는다.

	   @Override
	   public void draw() {//내부에는 implement 해서 구현해야하는 프로토콜을 지정
	      System.out.println("Inside Circle::draw() method.");//해당 내용을 출력한다.
	   }
	}
