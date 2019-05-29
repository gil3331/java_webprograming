package 프로젝트3;

import java.util.Scanner;

public class 메서드2응용리얼판 {
	public static Scanner in =new Scanner(System.in);
	public static String ticketName = " ",typeName = " ",ageTypeName=" ";
	public static int inputCount=0;
	//입력 메서드
	public static int inputTypeCommand() {
		int inputType = 0;
		do {
			try {
				System.out.print("권종을 택하시오 :\n 1.주간권\n 2.오후권\n 99.종료\n");// ticket의 종류를 설명하기 위해 주간권 오후권으로 출력함.
				inputType = in.nextInt();// 티켓 종류 기입
				if (inputType != 1 && inputType != 2 && inputType != 99) {
					System.out.println("올바른 형식이 아닙니다.");
				}
			} catch (Exception e) {
				System.out.println("잘못된 형식입니다.");
				
			}in.nextLine();
		} while (inputType != 1 && inputType != 2 && inputType != 99);
		return inputType;
	}
	public static int inputIDCommand() {
		int inputID = 0;
		String inputID_str;
		boolean isDigit = true;
		do {
			do {
				System.out.print("주민번호 앞자리를 입력하세요\n");
				inputID_str = in.nextLine();
			} while (inputID_str.length() != 6);
			isDigit = true;
			try {
				inputID = Integer.parseInt(inputID_str);
			} catch (Exception e) {
				isDigit = false;
			}
		} while (isDigit == false);
		return inputID;
	}
	public static int inputCountCommand() {
		
		do {
			try {
			System.out.println("몇 장을 주문하시겠습니까? : ");
			inputCount = in.nextInt();// 몇장을 구매할지 기입
			}catch (Exception e) {
				in.nextLine();
			}
		} while (inputCount <= 0 || inputCount >= 10);
		return inputCount;
	}
	public static int inputAdvantageCommand() {
		int inputAdvantage = 0;
		do {
			try {
			
			System.out.print("우대사항을 입력하세요 : \n0(일반)\n1(장애인)\n2(유공자)\n3(다자녀)\n4(임산부)\n");// 우대사항을 적게하는 출력문이자, 무슨
																						// 우대사항이 있는지를
																						// 출력
			inputAdvantage = in.nextInt();// 우대사항 기입
			}catch(Exception e) {
				in.nextLine();
			}
		} while (inputAdvantage != 1 && inputAdvantage != 2 && inputAdvantage != 3 && inputAdvantage != 4 && inputAdvantage != 0);
		return inputAdvantage;
	}
	
	//처리 메서드
	public static int calcAge(int memberID) {
		int returnAge = 0;
		memberID = memberID / 10000;// 주민번호를 통해서 나이를 구하기 위해 우선 주민번호를 10000으로 나눈 몫으로 함.
		if (returnAge <= 19) {
			returnAge = 2019 - (returnAge + 2000) + 1;// 2000년대의 경우는 앞자리가 00으로 시작하기 때문에 나이에 2000을 더하고, 2019를 빼면 나이가 나옴
		} else {
			returnAge = 2019 - (returnAge + 1900) + 1;// 1900년대의 경우는 나온 결과값에 1900을 더한 뒤, 2019를 빼주면 나이가 나옴.
		}
		return returnAge;
	}
	public static int getAgeType(int memberAge) {
		int returnAgeType = 0;
		if (memberAge < 3) {// 에버랜드의 규정상 나이가 3세 미만의 경우는 아이로 분류하여, 표값을 받지 아니함.
			returnAgeType = 0;// 나이가 조건에 해당하는 경우를 0으로 규정
			ageTypeName = "아이";
			// 나이가 조건에 해당하는 경우를 아이로 규정
		}
		if (memberAge >= 3 && memberAge < 13 || memberAge > 65) {// 에버랜드 규정으로 나이가 3세 이상이면서 나이가 13세 미만이거나, 65세를 넘는 경우 소인 혹은 노인으로 분류하게
												// 되어있음.
			returnAgeType = 1;// 나이가 조건에 해당하는 경우를 1로 규정
			ageTypeName = "소인/경로";
			// 나이가 조건에 해당하는 경우를 소인으로 규정
		}
		if (memberAge >= 13 && memberAge < 19) {// 에버랜드 규정상 나이가 13세 이상이면서, 19세 미만이면, 청소년을 규정함.
			returnAgeType = 2;// 나이가 조건에 해당하는 경우를 2로 규정
			ageTypeName = "청소년";
			// 나이가 조건에 해당하는 경우를 청소년으로 규정
		}
		if (memberAge >= 19 && memberAge <= memberAge) {// 에버랜드 규정상 19세 이상이면서 65세 이하로는 성인으로 규정함.
			returnAgeType = 3;// 나이가 조건에 해당하는 경우를 3으로 규정
			ageTypeName = "성인";
		}
		return returnAgeType;
	}
	public static int getTicketPrice(int inputType, int returnAgeType, int inputAdvantage) {
		int returnPrice = 0;
		
		if (inputType == 1) {
			ticketName = "종일권";// ticket이 1인 경우를 "종일권"이라고 조건을 부여
			switch (returnAgeType) {// switch에 나이에 해당하는 타입을 넣고,
			case 0:// 나이 타입이 0일때, 곧 아이의 경우
				returnPrice = 0;// 표값이 무료임.
				typeName="아이";
				break;

			case 1: // 1일때, 소인의 경우
				switch (inputAdvantage) {// 나이 타입이 1인 경우(소인의 경우) 다시 거기에 switch로 우대사항을 분류
				case 0:// 우대사항이 일반 소인의 경우
					returnPrice = 43000;
					typeName="일반 소인";
					break;
				case 1: // 우대사항이 장애인 소인의 경우
					returnPrice = 26000;
					typeName="장애인 소인";
					break;
				case 2: // 우대사항이 유공자 소인의 경우
					returnPrice = 21500;
					typeName="유공자 소인";
					break;
				case 3: // 우대사항이 다자녀 소인의 경우
					returnPrice = 34000;
					typeName="다자녀 소인";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			case 2: // 나이 타입이 2일때, 청소년의 경우
				switch (inputAdvantage) {// 나이 타입이 2인 경우(청소년의 경우) 다시 거기에 switch로 우대사항을 분류
				case 0:// 우대사항이 일반 청소년의 경우
					returnPrice = 46000;
					typeName="일반 청소년";
					break;
				case 1: // 우대사항이 장애인 청소년의 경우
					returnPrice = 28000;
					typeName="장애인 청소년";
					break;
				case 2: // 우대사항이 유공자 청소년의 경우
					returnPrice = 23000;
					typeName="유공자 청소년";
					break;
				case 3: // 다자녀 청소년의 경우
					returnPrice = 36000;
					typeName="다자녀 청소년";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			case 3: // 성인의 경우
				switch (inputAdvantage) {
				case 0:// 일반 성인의 경우
					returnPrice = 54000;
					typeName="일반 성인";
					break;
				case 1: // 장애인 성인의 경우
					returnPrice = 33000;
					typeName="장애인 성인";
					break;
				case 2: // 유공자 성인의 경우
					returnPrice = 27000;
					typeName="유공자 성인";
					break;
				case 3: // 다자녀 성인의 경우
					returnPrice = 43000;
					typeName="다자녀 성인";
					break;
				case 4: // 임산부 성인의 경우
					returnPrice = 45000;
					typeName="임산부";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			}
		}
		if (inputType == 2) {
			ticketName = "오후권";// ticket이 2인 경우를 "오후권"로 조건을 부여함.
			switch (returnAgeType) {
			case 0: // 아이의 경우
				returnPrice = 0;
				typeName="아이";
				break;

			case 1: // 소인의 경우
				switch (inputAdvantage) {
				case 0:// 일반 소인의 경우
					returnPrice = 36000;
					typeName="일반 소인";
					break;
				case 1: // 장애인 소인의 경우
					returnPrice = 23000;
					typeName="장애인 소인";
					break;
				case 2: // 유공자 소인의 경우
					returnPrice = 18000;
					typeName="유공자 소인";
					break;
				case 3: // 다자녀 소인의 경우
					returnPrice = 28000;
					typeName="다자녀 소인";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			case 2: // 청소년의 경우
				switch (inputAdvantage) {
				case 0:// 일반 청소년의 경우
					returnPrice = 39000;
					typeName="일반 청소년";
					break;
				case 1: // 장애인 청소년의 경우
					returnPrice = 24000;
					typeName="장애인 청소년";
					break;
				case 2: // 유공자 청소년의 경우
					returnPrice = 19500;
					typeName="유공자 청소년";
					break;
				case 3: // 다자녀 청소년의 경우
					returnPrice = 31000;
					typeName="다자녀 청소년";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
				break;
			case 3: // 성인의 경우
				switch (inputAdvantage) {
				case 0:// 일반 성인의 경우
					returnPrice = 45000;
					typeName="일반 성인";
					break;
				case 1: // 장애인 성인의 경우
					returnPrice = 27000;
					typeName="장애인 성인";
					break;
				case 2: // 유공자 성인의 경우
					returnPrice = 22500;
					typeName="유공자 성인";
					break;
				case 3: // 다자녀 성인의 경우
					returnPrice = 36000;
					typeName="다자녀 성인";
					break;
				case 4: // 임산부 성인의 경우
					returnPrice = 36000;
					typeName="임산부";
					break;
				default:
					System.out.println("올바른 형식이 아님");
					break;
				}
			}
			return returnPrice;
		}
		return returnPrice;
		}
	
	//출력 메서드
	public static void printTicket(int outputPrice) {
		System.out.printf("가격은 %d원 입니다.\n감사합니다.\n", outputPrice);
		System.out.printf("=================에버랜드====================\n");
		System.out.printf("권종:%s %s %d장 총액 : %d원 %s 우대입니다.\n", ticketName, ageTypeName, inputCount, outputPrice, typeName);
		System.out.printf("===========================================\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputType = 0, inputID = 0, inputCount = 0, inputAdvantage = 0;		
		int outputPrice = 0;		
		int age=0, ageType=0;
		while (true) {
			// 1이나, 2나, 99가 나오지 않으면 다시 권종으로 돌아감.
			inputType = inputTypeCommand();
			if (inputType == 99) {// 종료넘버인 99가 나오면 끝냄.
				break;
			}
			inputID = inputIDCommand();
			inputCount = inputCountCommand();
			inputAdvantage = inputAdvantageCommand();
			age = calcAge(inputID);
			ageType = getAgeType(age);
			outputPrice = getTicketPrice(inputType, ageType, inputAdvantage);
			outputPrice = outputPrice * inputCount;
			printTicket(outputPrice);


			
						
		}
		in.close();
	}

}
