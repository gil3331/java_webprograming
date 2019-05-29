package DesignPackage;
//Title : ShapeFactory
//Date : 2019.05.24
//Author : 이길준
//Comment : .....

//객체를 대신 만들어줌-값비싼 new 객체들은 팩토리 클래스 내에서만 생성
public class ShapeFactory {
	
	   //use getShape method to get object of type shape 
	   public Shape getShape(String shapeType){//main에서 받을 shape를 받아올 메서드
	      if(shapeType == null){//만약 받아올 값이 null이면
	         return null;//null값을 리턴하고
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCLE")){//받아올 값이 CIRCLE이라면
	         return new Circle();//명령에 따라 circle을 리턴
	         
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){//받아올 값이 RECTANGLE이라면
	         return new Rectangle();//명령에 따라 rectangle을 리턴
	         
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){//받아올 값이 SQUARE이라면
	         return new Square();//명령에 따라 square을 리턴
	      }
	      
	      return null;//getShape의 리턴 값은 null로 받는다.
	   }
	}
