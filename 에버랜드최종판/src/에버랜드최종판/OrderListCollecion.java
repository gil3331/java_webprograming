package 에버랜드최종판;

public class OrderListCollecion {//최종적으로 받는 모든 결과 값에 대해 콜랙션으로 수집을 함.
	private String ticketType;//tickettype(권종)에 대한 string값을 받기 위한 변수(private으로 외부에서 변경할수 없게 막음)
	private String typeName;//typeName(우대조건이름)에 대한 string값을 받기 위한 변수(private으로 외부에서 변경할수 없게 막음)
	private int count;//count(인원 수)에 대한 int값을 받기 위한 변수(private으로 외부에서 변경할수 없게 막음)
	private int price;//price(최종가격)에 대한 int값을 받기 위한 변수(private으로 외부에서 변경할수 없게 막음)
	private String advantage;//advantage(우대조건)에 대한 string값을 받기 위한 변수(private으로 외부에서 변경할수 없게 막음)
	
	public OrderListCollecion(String ticketType, String typeName, int count, int price, String advantage) {
		//각 클래스에서 나오는 결과값들을 콜랙션 클래스로 결과값을 받을수 있게 지정함.
		super();
		this.ticketType = ticketType;//현 클래스 내에서 ticketType라고 지정함
		this.typeName = typeName;//현 클래스 내에서 typeName라고 지정함
		this.count = count;//현 클래스 내에서 count라고 지정함
		this.price = price;//현 클래스 내에서 price라고 지정함
		this.advantage = advantage;//현 클래스 내에서 advantage라고 지정함
	}
	public void setTicketType(String str) {//set으로 상위의 정보들을 받고,
		this.ticketType = str;
	}
	public String getTicketType() {//get으로 그 정보들을 보낸다.
		return this.ticketType;
	}
	public String getTypeName() {//get으로 그 정보들을 보낸다.
		return typeName;
	}
	void setTypeName(String typeName) {//set으로 상위의 정보들을 받고,
		this.typeName = typeName;
	}
	public int getCount() {//get으로 그 정보들을 보낸다.
		return count;
	}
	public void setCount(int count) {//set으로 상위의 정보들을 받고,
		this.count = count;
	}
	public int getPrice() {//get으로 그 정보들을 보낸다.
		return price;
	}
	public void setPrice(int price) {//set으로 상위의 정보들을 받고,
		this.price = price;
	}
	public String getAdvantage() {//get으로 그 정보들을 보낸다.
		return advantage;
	}
	public void setAdvantage(String advantage) {//set으로 상위의 정보들을 받고,
		this.advantage = advantage;
	}
}
