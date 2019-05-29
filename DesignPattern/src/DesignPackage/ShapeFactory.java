package DesignPackage;
//Title : ShapeFactory
//Date : 2019.05.24
//Author : �̱���
//Comment : .....

//��ü�� ��� �������-����� new ��ü���� ���丮 Ŭ���� �������� ����
public class ShapeFactory {
	
	   //use getShape method to get object of type shape 
	   public Shape getShape(String shapeType){//main���� ���� shape�� �޾ƿ� �޼���
	      if(shapeType == null){//���� �޾ƿ� ���� null�̸�
	         return null;//null���� �����ϰ�
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCLE")){//�޾ƿ� ���� CIRCLE�̶��
	         return new Circle();//��ɿ� ���� circle�� ����
	         
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){//�޾ƿ� ���� RECTANGLE�̶��
	         return new Rectangle();//��ɿ� ���� rectangle�� ����
	         
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){//�޾ƿ� ���� SQUARE�̶��
	         return new Square();//��ɿ� ���� square�� ����
	      }
	      
	      return null;//getShape�� ���� ���� null�� �޴´�.
	   }
	}
