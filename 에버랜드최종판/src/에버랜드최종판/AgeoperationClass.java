package 에버랜드최종판;

public class AgeoperationClass {

	int memberAge;
	int returnAgeType;
	String ageTypeName;

	public AgeoperationClass() {
		ageTypeName = " ";

	}

	public int calcAge(int memberAge) {

		memberAge = memberAge / 10000;// 주민번호를 통해서 나이를 구하기 위해 우선 주민번호를 10000으로 나눈 몫으로 함.
		if (memberAge <= 19) {
			memberAge = 2019 - (memberAge + 2000) + 1;// 2000년대의 경우는 앞자리가 00으로 시작하기 때문에 나이에 2000을 더하고, 2019를 빼면 나이가 나옴
		} else {
			memberAge = 2019 - (memberAge + 1900) + 1;// 1900년대의 경우는 나온 결과값에 1900을 더한 뒤, 2019를 빼주면 나이가 나옴.
		}

		return memberAge;// 나온 결과 값을 멤버에이지로 받음.
	}

	public int getAgeType(int age) {// 상위의 memberage라는 결과 값을 age로 받고, 하위의 식으로 나이별로 분류하게 함.

		returnAgeType = 0;
		if (age < 3) {// 에버랜드의 규정상 나이가 3세 미만의 경우는 아이로 분류하여, 표값을 받지 아니함.
			returnAgeType = 0;// 나이가 조건에 해당하는 경우를 0으로 규정
			ageTypeName = "유아";
			// 나이가 조건에 해당하는 경우를 아이로 규정
		}
		if (age >= 3 && age < 13 || age > 65) {// 에버랜드 규정으로 나이가 3세 이상이면서 나이가 13세 미만이거나, 65세를 넘는 경우 소인 혹은 노인으로 분류하게
												// 되어있음.
			returnAgeType = 1;// 나이가 조건에 해당하는 경우를 1로 규정
			ageTypeName = "소인/경로";
			// 나이가 조건에 해당하는 경우를 소인으로 규정
		}
		if (age >= 13 && age < 19) {// 에버랜드 규정상 나이가 13세 이상이면서, 19세 미만이면, 청소년을 규정함.
			returnAgeType = 2;// 나이가 조건에 해당하는 경우를 2로 규정
			ageTypeName = "청소년";
			// 나이가 조건에 해당하는 경우를 청소년으로 규정
		}
		if (age >= 19 && age <= 65) {// 에버랜드 규정상 19세 이상이면서 65세 이하로는 성인으로 규정함.
			returnAgeType = 3;// 나이가 조건에 해당하는 경우를 3으로 규정
			ageTypeName = "성인";
		}
		return returnAgeType;// age를 통해 분류된 조건들을 returnagetype란 결과값으로 받음.
	}

}
