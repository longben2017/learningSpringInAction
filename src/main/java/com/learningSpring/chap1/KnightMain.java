package com.learningSpring.chap1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chap1/knights.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chap1/minstrel.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
 	}
}
