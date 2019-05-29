package 객체지향에버랜드프로젝트;

public class TicketTypeClass {

	String[] ticketN;
	String[] typeN;
	int returnPricearr[];

	TicketTypeClass() {
		ticketN = new String[20];
		typeN = new String[20];
		returnPricearr = new int[20];

	}

	public void getTicketPrice(int ticket, int returnAgeType, int inputAdvantage, String[] ticketName,
			String[] typeName, int tryCount) {
		// 이 클래스는 내부의 식이 외부의 정보들을 요구함으로, 클래스내에 외부의 변수, 정보들을 받을 수 있게 변수들을 부여한다.
		if (ticket == 1) {
			ticketN[tryCount] = "종일권";// ticket이 1인 경우를 "종일권"이라고 조건을 부여
			switch (returnAgeType) {// switch에 나이에 해당하는 타입을 넣고,
			case 0:// 나이 타입이 0일때, 곧 아이의 경우
				returnPricearr[tryCount] = 0;// 표값이 무료임.
				typeN[tryCount] = "유아";
				break;

			case 1: // 1일때, 소인의 경우
				switch (inputAdvantage) {// 나이 타입이 1인 경우(소인의 경우) 다시 거기에 switch로 우대사항을 분류
				case 0:// 우대사항이 일반 소인의 경우
					returnPricearr[tryCount] = 43000;
					typeN[tryCount] = "일반 소인";
					break;
				case 1: // 우대사항이 장애인 소인의 경우
					returnPricearr[tryCount] = 26000;
					typeN[tryCount] = "장애인 소인";
					break;
				case 2: // 우대사항이 유공자 소인의 경우
					returnPricearr[tryCount] = 21500;
					typeN[tryCount] = "유공자 소인";
					break;
				case 3: // 우대사항이 다자녀 소인의 경우
					returnPricearr[tryCount] = 34000;
					typeN[tryCount] = "다자녀 소인";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			case 2: // 나이 타입이 2일때, 청소년의 경우
				switch (inputAdvantage) {// 나이 타입이 2인 경우(청소년의 경우) 다시 거기에 switch로 우대사항을 분류
				case 0:// 우대사항이 일반 청소년의 경우
					returnPricearr[tryCount] = 46000;
					typeN[tryCount] = "일반 청소년";
					break;
				case 1: // 우대사항이 장애인 청소년의 경우
					returnPricearr[tryCount] = 28000;
					typeN[tryCount] = "장애인 청소년";
					break;
				case 2: // 우대사항이 유공자 청소년의 경우
					returnPricearr[tryCount] = 23000;
					typeN[tryCount] = "유공자 청소년";
					break;
				case 3: // 다자녀 청소년의 경우
					returnPricearr[tryCount] = 36000;
					typeN[tryCount] = "다자녀 청소년";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			case 3: // 성인의 경우
				switch (inputAdvantage) {
				case 0:// 일반 성인의 경우
					returnPricearr[tryCount] = 54000;
					typeN[tryCount] = "일반 성인";
					break;
				case 1: // 장애인 성인의 경우
					returnPricearr[tryCount] = 33000;
					typeN[tryCount] = "장애인 성인";
					break;
				case 2: // 유공자 성인의 경우
					returnPricearr[tryCount] = 27000;
					typeN[tryCount] = "유공자 성인";
					break;
				case 3: // 다자녀 성인의 경우
					returnPricearr[tryCount] = 43000;
					typeN[tryCount] = "다자녀 성인";
					break;
				case 4: // 임산부 성인의 경우
					returnPricearr[tryCount] = 45000;
					typeN[tryCount] = "임산부";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			}
		}
		if (ticket == 2) {
			ticketN[tryCount] = "오후권";// ticket이 2인 경우를 "오후권"로 조건을 부여함.
			switch (returnAgeType) {
			case 0: // 아이의 경우
				returnPricearr[tryCount] = 0;
				typeN[tryCount] = "아이";
				break;

			case 1: // 소인의 경우
				switch (inputAdvantage) {
				case 0:// 일반 소인의 경우
					returnPricearr[tryCount] = 36000;
					typeN[tryCount] = "일반 소인";
					break;
				case 1: // 장애인 소인의 경우
					returnPricearr[tryCount] = 23000;
					typeN[tryCount] = "장애인 소인";
					break;
				case 2: // 유공자 소인의 경우
					returnPricearr[tryCount] = 18000;
					typeN[tryCount] = "유공자 소인";
					break;
				case 3: // 다자녀 소인의 경우
					returnPricearr[tryCount] = 28000;
					typeN[tryCount] = "다자녀 소인";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			case 2: // 청소년의 경우
				switch (inputAdvantage) {
				case 0:// 일반 청소년의 경우
					returnPricearr[tryCount] = 39000;
					typeN[tryCount] = "일반 청소년";
					break;
				case 1: // 장애인 청소년의 경우
					returnPricearr[tryCount] = 24000;
					typeN[tryCount] = "장애인 청소년";
					break;
				case 2: // 유공자 청소년의 경우
					returnPricearr[tryCount] = 19500;
					typeN[tryCount] = "유공자 청소년";
					break;
				case 3: // 다자녀 청소년의 경우
					returnPricearr[tryCount] = 31000;
					typeN[tryCount] = "다자녀 청소년";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			case 3: // 성인의 경우
				switch (inputAdvantage) {
				case 0:// 일반 성인의 경우
					returnPricearr[tryCount] = 45000;
					typeN[tryCount] = "일반 성인";
					break;
				case 1: // 장애인 성인의 경우
					returnPricearr[tryCount] = 27000;
					typeN[tryCount] = "장애인 성인";
					break;
				case 2: // 유공자 성인의 경우
					returnPricearr[tryCount] = 22500;
					typeN[tryCount] = "유공자 성인";
					break;
				case 3: // 다자녀 성인의 경우
					returnPricearr[tryCount] = 36000;
					typeN[tryCount] = "다자녀 성인";
					break;
				case 4: // 임산부 성인의 경우
					returnPricearr[tryCount] = 36000;
					typeN[tryCount] = "임산부";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
			}

		}
	}
}
