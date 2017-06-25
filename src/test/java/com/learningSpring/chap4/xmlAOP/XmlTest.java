package com.learningSpring.chap4.xmlAOP;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:chap4/xmlTest-context.xml")
public class XmlTest {
	@Autowired
	private IPerformance p;
	
	@Test
	public void xmlTest(){
		p.perform();
	}
}
