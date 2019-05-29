package 프로젝트3;

import java.util.Scanner;

public class 메서드2응용 {
	public static int ticket = 0, count = 0, type = 0, price = 0 ,residentnumber = 0, age = 0, ageType = 0,total = 0;
	public static String ticketName = " ", agetypeName = " ", typeName = " ";
	public static final int MERIT_DAY_ADULT = 27000, MERIT_DAY_TEEN = 23000, MERIT_DAY_BOY = 21500,MERIT_NIGHT_ADULT = 22500,MERIT_NIGHT_TEEN = 19500, MERIT_NIGHT_BOY = 18000,MULTI_DAY_ADULT = 43000;
	public static final int MULTI_DAY_TEEN = 36000, MULTI_DAY_BOY = 34000, MULTI_NIGHT_ADULT = 36000, MULTI_NIGHT_TEEN = 31000,MULTI_NIGHT_BOY = 28000, PREGNANT_DAY = 45000,PREGNANT_NIGHT = 36000;
	public static final int DAY_ADULT = 54000,DAY_TEEN = 46000,DAY_BOY = 43000,NIGHT_ADULT = 45000,NIGHT_TEEN = 39000,NIGHT_BOY = 36000,DISABLED_DAY_ADULT = 33000,DISABLED_DAY_TEEN = 28000,DISABLED_DAY_BOY = 26000, DISABLED_NIGHT_ADULT = 27000,DISABLED_NIGHT_TEEN = 24000, DISABLED_NIGHT_BOY = 23000;
	public static Scanner in=new Scanner(System.in);
	public static void ticket() {
		do {
			try {
				System.out.print("권종을 택하시오 :\n 1.주간권\n 2.오후권\n 99.종료\n");
				ticket = in.nextInt();
				if (ticket != 1 && ticket != 2 && ticket != 99) {
					System.out.println("잘못된 형식입니다.");
				}
			} catch (Exception e) {
				System.out.println("잘못된 형식입니다.");
				in.nextLine();
			}
		} while (ticket != 1 && ticket != 2 && ticket != 99);//1이나, 2나, 99가 나오지 않으면 다시 권종으로 돌아감.
		
		}

	public static void residentNumber() {

		do {
			System.out.print("주민번호 앞자리를 입력하시오 : ");// 주민번호 기입을 위한 출력문
			residentnumber = in.nextInt();// 주민번호 기입
		} while (residentnumber > 999999);
	}
	public static void ticketCount() {
		do {
			System.out.println("몇 장을 주문하시겠습니까? : ");
			count = in.nextInt();// 몇장을 구매할지 기입
		} while (count <= 0 || count >= 10);//0이하거나, 10이상이면 몇장을 구할지로 돌림

	}
	public static void ageAndagetype() {
		age = residentnumber / 10000;// 주민번호를 통해서 나이를 구하기 위해 우선 주민번호를 10000으로 나눈 몫으로 함.
		if (age <= 19) {
			age = 2019 - (age + 2000) + 1;// 2000년대의 경우는 앞자리가 00으로 시작하기 때문에 나이에 2000을 더하고, 2019를 빼면 나이가 나옴
		} else {
			age = 2019 - (age + 1900) + 1;// 1900년대의 경우는 나온 결과값에 1900을 더한 뒤, 2019를 빼주면 나이가 나옴.
		}
		System.out.println("나이는" + age + "세");// 나이 출력
		if (age < 3) {// 에버랜드의 규정상 나이가 3세 미만의 경우는 아이로 분류하여, 표값을 받지 아니함.
			ageType = 0;// 나이가 조건에 해당하는 경우를 0으로 규정
			agetypeName = "아이";// 나이가 조건에 해당하는 경우를 아이로 규정
		}
		if (age >= 3 && age < 13 || age > 65) {// 에버랜드 규정으로 나이가 3세 이상이면서 나이가 13세 미만이거나, 65세를 넘는 경우 소인 혹은 노인으로 분류하게
												// 되어있음.
			ageType = 1;// 나이가 조건에 해당하는 경우를 1로 규정
			agetypeName = "소인";// 나이가 조건에 해당하는 경우를 소인으로 규정
		}
		if (age >= 13 && age < 19) {// 에버랜드 규정상 나이가 13세 이상이면서, 19세 미만이면, 청소년을 규정함.
			ageType = 2;// 나이가 조건에 해당하는 경우를 2로 규정
			agetypeName = "청소년";// 나이가 조건에 해당하는 경우를 청소년으로 규정
		}
		if (age >= 19 && age <= 65) {// 에버랜드 규정상 19세 이상이면서 65세 이하로는 성인으로 규정함.
			ageType = 3;// 나이가 조건에 해당하는 경우를 3으로 규정
			agetypeName = "성인";// 나이가 조건에 해당하는 경우를 성인으로 규정
		}
		System.out.println(agetypeName);// 규정에 의해 어떤 조건의 사람인지를 판단하는 출력문

	}
	public static void ableType() {
		do {
			System.out.print("우대사항을 입력하세요 : \n0(일반)\n1(장애인)\n2(유공자)\n3(다자녀)\n4(임산부)\n");// 우대사항을 적게하는 출력문이자, 무슨
																						// 우대사항이 있는지를 출력

			type = in.nextInt();// 우대사항 기입
		} while (type != 1 && type != 2 && type != 3 && type != 4 && type != 0);// 범위의 숫자가 아니면 다시 우대사항으로 돌림

		// 0(자동 성인),1(장애인),2(유공자),3(다자녀),4(임산부)
		// 권종 분류로 진행 되는 if switch 복합문
		if (type == 0) {
			typeName = "일반";
		} // 우대사항이0일때, "일반"이라고 조건을 부여함.
		if (type == 1) {
			typeName = "장애인";
		} // 우대사항이1일때, "장애인"이라고 조건을 부여함.
		if (type == 2) {
			typeName = "유공자";
		} // 우대사항이2일때, "유공자"이라고 조건을 부여함.
		if (type == 3) {
			typeName = "다자녀";
		} // 우대사항이3일때, "다자녀"이라고 조건을 부여함.
		if (type == 4) {
			typeName = "임산부";
		} // 우대사항이4일때, "임산부"이라고 조건을 부여함.
		if (ticket == 1) {
			ticketName = "종일권";// ticket이 1인 경우를 "종일권"이라고 조건을 부여
			switch (ageType) {// switch에 나이에 해당하는 타입을 넣고,
			case 0:// 나이 타입이 0일때, 곧 아이의 경우
				price = 0;// 표값이 무료임.
				break;

			case 1: // 1일때, 소인의 경우
				switch (type) {// 나이 타입이 1인 경우(소인의 경우) 다시 거기에 switch로 우대사항을 분류
				case 0:// 우대사항이 일반 소인의 경우
					price = DAY_BOY;
					break;
				case 1: // 우대사항이 장애인 소인의 경우
					price = DISABLED_DAY_BOY;
					break;
				case 2: // 우대사항이 유공자 소인의 경우
					price = MERIT_DAY_BOY;
					break;
				case 3: // 우대사항이 다자녀 소인의 경우
					price = MULTI_DAY_BOY;
					break;
				default:
					System.out.println("올바른 형식이 아님");
					System.exit(0);
					break;
				}
				break;
			case 2: // 나이 타입이 2일때, 청소년의 경우
				switch (type) {// 나이 타입이 2인 경우(청소년의 경우) 다시 거기에 switch로 우대사항을 분류
				case 0:// 우대사항이 일반 청소년의 경우
					price = DAY_TEEN;
					break;
				case 1: // 우대사항이 장애인 청소년의 경우
					price = DISABLED_DAY_TEEN;
					break;
				case 2: // 우대사항이 유공자 청소년의 경우
					price = MERIT_DAY_TEEN;
					break;
				case 3: // 다자녀 청소년의 경우
					price = MULTI_DAY_TEEN;
					break;
				default:
					System.out.println("올바른 형식이 아님");
					System.exit(0);
					break;
				}
				break;
			case 3: // 성인의 경우
				switch (type) {
				case 0:// 일반 성인의 경우
					price = DAY_ADULT;

					break;
				case 1: // 장애인 성인의 경우
					price = DISABLED_DAY_ADULT;
					break;
				case 2: // 유공자 성인의 경우
					price = MERIT_DAY_ADULT;

					break;
				case 3: // 다자녀 성인의 경우
					price = MULTI_DAY_ADULT;
					break;
				case 4: // 임산부 성인의 경우
					price = PREGNANT_DAY;
					break;
				default:
					System.out.println("올바른 형식이 아님");
					System.exit(0);
					break;
				}
				break;
			}
		}
		if (ticket == 2) {
			ticketName = "오후권";// ticket이 2인 경우를 "오후권"로 조건을 부여함.
			switch (ageType) {
			case 0: // 아이의 경우
				price = 0;
				break;

			case 1: // 소인의 경우
				switch (type) {
				case 0:// 일반 소인의 경우
					price = NIGHT_BOY;
					break;
				case 1: // 장애인 소인의 경우
					price = DISABLED_NIGHT_BOY;
					break;
				case 2: // 유공자 소인의 경우
					price = MERIT_NIGHT_BOY;
					break;
				case 3: // 다자녀 소인의 경우
					price = MULTI_NIGHT_BOY;
					break;
				default:
					System.out.println("올바른 형식이 아님");
					System.exit(0);
					break;
				}
				break;
			case 2: // 청소년의 경우
				switch (type) {
				case 0:// 일반 청소년의 경우
					price = NIGHT_TEEN;
					break;
				case 1: // 장애인 청소년의 경우
					price = DISABLED_NIGHT_TEEN;
					break;
				case 2: // 유공자 청소년의 경우
					price = MERIT_NIGHT_TEEN;
					break;
				case 3: // 다자녀 청소년의 경우
					price = MULTI_NIGHT_TEEN;
					break;
				default:
					System.out.println("올바른 형식이 아님");
					System.exit(0);
					break;
				}
				break;
			case 3: // 성인의 경우
				switch (type) {
				case 0:// 일반 성인의 경우
					price = NIGHT_ADULT;

					break;
				case 1: // 장애인 성인의 경우
					price = DISABLED_NIGHT_ADULT;
					break;
				case 2: // 유공자 성인의 경우
					price = MERIT_NIGHT_ADULT;
					break;
				case 3: // 다자녀 성인의 경우
					price = MULTI_NIGHT_ADULT;
					break;
				case 4: // 임산부 성인의 경우
					price = PREGNANT_NIGHT;
					break;
				default:
					System.out.println("올바른 형식이 아님");
					System.exit(0);
					break;
				}
			}
		}
	}
	public static void result() {
		total = count * price;
		System.out.printf("가격은 %d원 입니다.\n감사합니다.\n", total);
		System.out.printf("=================에버랜드====================\n");
		System.out.printf("권종:%s %s %d장 총액 : %d원 %s 우대입니다.\n", ticketName, agetypeName, count, total, typeName);
		System.out.printf("===========================================\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (true) {//내부의 내용을 잘 처리하면 다시 이곳으로 돌아옴.
			ticket();
			if (ticket == 99) {//종료넘버인 99가 나오면 끝냄.
				break;
				}
			residentNumber();
			ticketCount();
			ageAndagetype();
			ableType();
			result();			
		}
			in.close();	
	}
	
}
		
	


