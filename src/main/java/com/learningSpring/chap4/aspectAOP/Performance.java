package com.learningSpring.chap4.aspectAOP;

import org.springframework.stereotype.Component;

@Component
public class Performance implements IPerformance {

	@Override
	public void perform() {
		System.out.println("aspectAOP:start the performance");
	}

}
