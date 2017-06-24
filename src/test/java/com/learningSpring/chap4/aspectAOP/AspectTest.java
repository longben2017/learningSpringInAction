package com.learningSpring.chap4.aspectAOP;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.learningSpring.chap4.IPerformance;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AspectConfig.class)
public class AspectTest {

	@Autowired
	private IPerformance p;
	
	@Test
	public void aspectTest(){
		p.perform();
	}
}
