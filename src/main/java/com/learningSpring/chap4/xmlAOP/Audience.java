package com.learningSpring.chap4.xmlAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Audience {

	public void silenceCellPhones(){
		System.out.println("Silencing cell phones");
	}
	
	public void takeSeats(){
		System.out.println("Taking seats");
	}
	
	public void applause(){
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	public void demandRefund(){
		System.out.println("Demanding a refund!");
	}
	
	public void watchperformance(ProceedingJoinPoint jp)
	{
		try {
			System.out.println("...xml around...");
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!!");
		} catch (Throwable e) {
			System.out.println("Demanding a refund!");
		}
	}
}
