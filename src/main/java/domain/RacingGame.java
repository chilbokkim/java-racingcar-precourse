package domain;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class RacingGame {
	private List<String> carNames = new ArrayList<String>();
	private List<Car> cars = new ArrayList<Car>();
	private int repeateCount;
	public RacingGame(){
		
	};
	
	void setRepeateCount() {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		System.out.println("�õ��� Ƚ���� ��ȸ�ΰ���?");
		//Ƚ���� �´��! ���ۿ� ����ô�ϴ�
		count = scan.nextInt();
		this.repeateCount = count;
	}
	void setCarsName() {
		Scanner scan = new Scanner(System.in);
		String nameString;
		System.out.println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) �������� ����)");
		nameString = scan.nextLine();
		String[] nameArray = nameString.split(",");
		for(int i=0;i<nameArray.length;i++) {
			carNames.add(nameArray[i]);
		}
		scan.close();
	}
	String getCarName(int index) {
		return this.carNames.get(index);
	}
	int getCarNamesSize() {
		return this.carNames.size();
	}
	int getRepeateCount() {
		return this.repeateCount;
	}
	void makeCars() {
		for(int i=0;i<getCarNamesSize();i++) {
			Car tmpCar = new Car(getCarName(i));
			cars.add(tmpCar);
		}
	}
	boolean checkNameLength(String name) {
		return name.length()<=5;
	}
	int makeRandomNumber() {
		Random random = new Random();
		return random.nextInt(10);
		//make random number in range 0~9;
	}
	boolean shouldGo(int randomNumber) {
		return randomNumber>3;
		//more than 4 : go, less than 3 : stop
	}
}
