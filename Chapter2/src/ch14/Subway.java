package ch14;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int busNumber) {
		this.lineNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showLineInfo() {
		System.out.println(lineNumber + "���� �°� ����" + passengerCount + "�� �̰�, ������" + money + "�� �Դϴ�.");
	}
}
