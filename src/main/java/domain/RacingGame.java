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
	void printCarPosition(Car car) {
		String name = car.getName();
		int position = car.getPosition();
		System.out.print(name+" : ");
		for(int i=0;i<position;i++) {
			System.out.print("-");
		}
		System.out.println("");
	}
	void printCurrentCarsPosition() {
		for(int i=0;i<getCarNamesSize();i++) {
			printCarPosition(cars.get(i));
		}
	}
	void raceCars() {
		
	}
	void run() {
		setCarsName();
		makeCars();
		setRepeateCount();
		System.out.println("������");
		for(int i=0;i<getRepeateCount();i++) {
			
		}
	}
}
