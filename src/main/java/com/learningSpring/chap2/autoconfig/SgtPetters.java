package com.learningSpring.chap2.autoconfig;

import org.springframework.stereotype.Component;

@Component
public class SgtPetters implements CompactDisc {

	public void play() {
		System.out.println(1);
	}
}
