package DesignPackage;
//Title : FactoryMain
//Date : 2019.05.24
//Author : �̱���
//Comment : .....
public class FactoryMain {
	public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();//shapeFactory�� ����ϱ� ���ؼ� ���� ����

	      //get an object of Circle and call its draw method.
	      Shape shape1 = shapeFactory.getShape("CIRCLE");
	      //interface�� �����ϰ�, shapeFactory�� getShape �޼��带 �̿��ؼ� CIRCLE�� ����
	      //call draw method of Circle
	      shape1.draw();//shape1���� Circle�� �����Ǵ��� Ȯ��

	      //get an object of Rectangle and call its draw method.
	      Shape shape2 = shapeFactory.getShape("RECTANGLE");
	      //shapeFactory�� getShape �޼��带 �̿��ؼ� RECTANGLE�� ����
	      //call draw method of Rectangle
	      shape2.draw();//shape2���� Rectangle�� �����Ǵ����� Ȯ��

	      //get an object of Square and call its draw method.
	      Shape shape3 = shapeFactory.getShape("SQUARE");
	      //shapeFactory�� getShape �޼��带 �̿��ؼ� SQUARE�� ����
	      //call draw method of square
	      shape3.draw();//shape3���� Square�� ����
	   }
	}

