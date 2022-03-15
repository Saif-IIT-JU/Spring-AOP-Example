package com.saif;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvisor implements MethodBeforeAdvice{
	public void before(Method method, Object[] args, Object target)
	{
		System.out.println("Transaction is occuring!");
	}
}
