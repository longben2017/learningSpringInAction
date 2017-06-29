package com.learningSpring.chap4.xmlAOP;

import org.springframework.stereotype.Component;

@Component
public class Performance implements IPerformance {

	public void perform() {
		System.out.println("xmlAOP:start the performance");
	}

}
