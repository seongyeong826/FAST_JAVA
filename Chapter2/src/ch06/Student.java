package ch06;

public class Student {

	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {}
	
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		
	}
	
	public String showStudentInfo() {
	
		
		return studentNumber + "�л��� �й��� " + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
		
		
	}
	
}
