package 에버랜드최종판;

public class TicketTypeClass {

	String ticketN;
	String typeN;
	int returnPricearr;

	TicketTypeClass() {
		ticketN = " ";
		typeN = " ";
		returnPricearr = 0;

	}

	public void getTicketPrice(int ticket, int returnAgeType, int inputAdvantage, String ticketName,
			String typeName) {
		// 이 클래스는 내부의 식이 외부의 정보들을 요구함으로, 클래스내에 외부의 변수, 정보들을 받을 수 있게 변수들을 부여한다.
		if (ticket == 1) {
			ticketN = "종일권";// ticket이 1인 경우를 "종일권"이라고 조건을 부여
			switch (returnAgeType) {// switch에 나이에 해당하는 타입을 넣고,
			case 0:// 나이 타입이 0일때, 곧 아이의 경우
				returnPricearr = 0;// 표값이 무료임.
				typeN = "유아";
				break;

			case 1: // 1일때, 소인의 경우
				switch (inputAdvantage) {// 나이 타입이 1인 경우(소인의 경우) 다시 거기에 switch로 우대사항을 분류
				case 0:// 우대사항이 일반 소인의 경우
					returnPricearr = 43000;
					typeN = "일반 소인";
					break;
				case 1: // 우대사항이 장애인 소인의 경우
					returnPricearr = 26000;
					typeN = "장애인 소인";
					break;
				case 2: // 우대사항이 유공자 소인의 경우
					returnPricearr = 21500;
					typeN = "유공자 소인";
					break;
				case 3: // 우대사항이 다자녀 소인의 경우
					returnPricearr = 34000;
					typeN = "다자녀 소인";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			case 2: // 나이 타입이 2일때, 청소년의 경우
				switch (inputAdvantage) {// 나이 타입이 2인 경우(청소년의 경우) 다시 거기에 switch로 우대사항을 분류
				case 0:// 우대사항이 일반 청소년의 경우
					returnPricearr = 46000;
					typeN = "일반 청소년";
					break;
				case 1: // 우대사항이 장애인 청소년의 경우
					returnPricearr = 28000;
					typeN = "장애인 청소년";
					break;
				case 2: // 우대사항이 유공자 청소년의 경우
					returnPricearr = 23000;
					typeN = "유공자 청소년";
					break;
				case 3: // 다자녀 청소년의 경우
					returnPricearr = 36000;
					typeN = "다자녀 청소년";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			case 3: // 성인의 경우
				switch (inputAdvantage) {
				case 0:// 일반 성인의 경우
					returnPricearr = 54000;
					typeN = "일반 성인";
					break;
				case 1: // 장애인 성인의 경우
					returnPricearr = 33000;
					typeN = "장애인 성인";
					break;
				case 2: // 유공자 성인의 경우
					returnPricearr = 27000;
					typeN = "유공자 성인";
					break;
				case 3: // 다자녀 성인의 경우
					returnPricearr = 43000;
					typeN = "다자녀 성인";
					break;
				case 4: // 임산부 성인의 경우
					returnPricearr = 45000;
					typeN = "임산부";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			}
		}
		if (ticket == 2) {
			ticketN = "오후권";// ticket이 2인 경우를 "오후권"로 조건을 부여함.
			switch (returnAgeType) {
			case 0: // 아이의 경우
				returnPricearr = 0;
				typeN = "아이";
				break;

			case 1: // 소인의 경우
				switch (inputAdvantage) {
				case 0:// 일반 소인의 경우
					returnPricearr = 36000;
					typeN = "일반 소인";
					break;
				case 1: // 장애인 소인의 경우
					returnPricearr = 23000;
					typeN = "장애인 소인";
					break;
				case 2: // 유공자 소인의 경우
					returnPricearr = 18000;
					typeN = "유공자 소인";
					break;
				case 3: // 다자녀 소인의 경우
					returnPricearr = 28000;
					typeN = "다자녀 소인";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			case 2: // 청소년의 경우
				switch (inputAdvantage) {
				case 0:// 일반 청소년의 경우
					returnPricearr = 39000;
					typeN = "일반 청소년";
					break;
				case 1: // 장애인 청소년의 경우
					returnPricearr = 24000;
					typeN = "장애인 청소년";
					break;
				case 2: // 유공자 청소년의 경우
					returnPricearr = 19500;
					typeN = "유공자 청소년";
					break;
				case 3: // 다자녀 청소년의 경우
					returnPricearr = 31000;
					typeN = "다자녀 청소년";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			case 3: // 성인의 경우
				switch (inputAdvantage) {
				case 0:// 일반 성인의 경우
					returnPricearr = 45000;
					typeN = "일반 성인";
					break;
				case 1: // 장애인 성인의 경우
					returnPricearr = 27000;
					typeN = "장애인 성인";
					break;
				case 2: // 유공자 성인의 경우
					returnPricearr = 22500;
					typeN = "유공자 성인";
					break;
				case 3: // 다자녀 성인의 경우
					returnPricearr = 36000;
					typeN = "다자녀 성인";
					break;
				case 4: // 임산부 성인의 경우
					returnPricearr = 36000;
					typeN = "임산부";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
			}

		}
	}
}
