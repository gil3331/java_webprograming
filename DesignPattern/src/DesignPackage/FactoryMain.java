package DesignPackage;
//Title : FactoryMain
//Date : 2019.05.24
//Author : 이길준
//Comment : .....
public class FactoryMain {
	public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();//shapeFactory를 사용하기 위해서 새로 선언

	      //get an object of Circle and call its draw method.
	      Shape shape1 = shapeFactory.getShape("CIRCLE");
	      //interface를 생성하고, shapeFactory의 getShape 메서드를 이용해서 CIRCLE을 생성
	      //call draw method of Circle
	      shape1.draw();//shape1에서 Circle이 생성되는지 확인

	      //get an object of Rectangle and call its draw method.
	      Shape shape2 = shapeFactory.getShape("RECTANGLE");
	      //shapeFactory의 getShape 메서드를 이용해서 RECTANGLE을 생성
	      //call draw method of Rectangle
	      shape2.draw();//shape2에서 Rectangle이 생성되는지를 확인

	      //get an object of Square and call its draw method.
	      Shape shape3 = shapeFactory.getShape("SQUARE");
	      //shapeFactory의 getShape 메서드를 이용해서 SQUARE를 생성
	      //call draw method of square
	      shape3.draw();//shape3에서 Square를 생성
	   }
	}

