package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
	
	System.out.println(order);
	
	
	//convertendo string para enum
	//
	//criando um objeto do tipo OrderStatus, chamado de OS1
	OrderStatus os1 = OrderStatus.DELIVERED;
	OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
	
	System.out.println(os1);
	System.out.println(os2);
	
	}

}
