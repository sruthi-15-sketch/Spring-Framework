package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		 WithdrawlEventPublisher publisher = (WithdrawlEventPublisher) context.getBean("customEventPublisher");
		BankAccount acc1 = new SavingsAccount(101, "Sruthi", 2000000);
		double balance=acc1.withdraw(20000);
		publisher.publish(balance);
	}

}