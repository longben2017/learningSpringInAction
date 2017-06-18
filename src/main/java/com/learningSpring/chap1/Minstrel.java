package com.learningSpring.chap1;

import java.io.PrintStream;

public class Minstrel {
	private PrintStream stream;
	
	public Minstrel(PrintStream stream){
		this.stream = stream;
	}
	
	public void singBeforeQuest(){
		stream.println("...sing before quest...");
	}
	
	public void singAfterQuest(){
		stream.println("...sing after quest...");
	}
}
