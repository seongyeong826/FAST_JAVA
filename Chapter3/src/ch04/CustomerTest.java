package ch04;

public class CustomerTest {
	
	public static void main(String[] args) {
		
//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("�̼���");
//		customerLee.setCustomerID(10010);
		
		Customer customerLee = new Customer(1010, "�̼���");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		
		System.out.println(customerLee.showCustomerInfo() + price);
		
		
		
//		VIPCustomer customerKim = new VIPCustomer();
//		customerKim.setCustomerName("������");
//		customerKim.setCustomerID(10020);
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		
		System.out.println(customerKim.showCustomerInfo() + price);
		
	}

}
