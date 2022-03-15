package com.saif;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Transaction t = (Transaction)context.getBean("p");
		
		t.displayMessage(); 
		t.showBalance();
		t.Deposite(500);
		t.showBalance();
		t.withdraw(5000);
		t.showBalance();
		t.withdraw(10000000);
		t.showBalance();
	} 
}
