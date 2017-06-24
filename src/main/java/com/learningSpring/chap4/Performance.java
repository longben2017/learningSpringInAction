package com.learningSpring.chap4;

import org.springframework.stereotype.Component;

@Component
public class Performance implements IPerformance {

	@Override
	public void perform() {
		System.out.println("start the performance");
	}

}
