package ��������������;

public class OrderListCollecion {//���������� �޴� ��� ��� ���� ���� �ݷ������� ������ ��.
	private String ticketType;//tickettype(����)�� ���� string���� �ޱ� ���� ����(private���� �ܺο��� �����Ҽ� ���� ����)
	private String typeName;//typeName(��������̸�)�� ���� string���� �ޱ� ���� ����(private���� �ܺο��� �����Ҽ� ���� ����)
	private int count;//count(�ο� ��)�� ���� int���� �ޱ� ���� ����(private���� �ܺο��� �����Ҽ� ���� ����)
	private int price;//price(��������)�� ���� int���� �ޱ� ���� ����(private���� �ܺο��� �����Ҽ� ���� ����)
	private String advantage;//advantage(�������)�� ���� string���� �ޱ� ���� ����(private���� �ܺο��� �����Ҽ� ���� ����)
	
	public OrderListCollecion(String ticketType, String typeName, int count, int price, String advantage) {
		//�� Ŭ�������� ������ ��������� �ݷ��� Ŭ������ ������� ������ �ְ� ������.
		super();
		this.ticketType = ticketType;//�� Ŭ���� ������ ticketType��� ������
		this.typeName = typeName;//�� Ŭ���� ������ typeName��� ������
		this.count = count;//�� Ŭ���� ������ count��� ������
		this.price = price;//�� Ŭ���� ������ price��� ������
		this.advantage = advantage;//�� Ŭ���� ������ advantage��� ������
	}
	public void setTicketType(String str) {//set���� ������ �������� �ް�,
		this.ticketType = str;
	}
	public String getTicketType() {//get���� �� �������� ������.
		return this.ticketType;
	}
	public String getTypeName() {//get���� �� �������� ������.
		return typeName;
	}
	void setTypeName(String typeName) {//set���� ������ �������� �ް�,
		this.typeName = typeName;
	}
	public int getCount() {//get���� �� �������� ������.
		return count;
	}
	public void setCount(int count) {//set���� ������ �������� �ް�,
		this.count = count;
	}
	public int getPrice() {//get���� �� �������� ������.
		return price;
	}
	public void setPrice(int price) {//set���� ������ �������� �ް�,
		this.price = price;
	}
	public String getAdvantage() {//get���� �� �������� ������.
		return advantage;
	}
	public void setAdvantage(String advantage) {//set���� ������ �������� �ް�,
		this.advantage = advantage;
	}
}
