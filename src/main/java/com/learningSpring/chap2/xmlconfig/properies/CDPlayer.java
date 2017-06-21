package com.learningSpring.chap2.xmlconfig.properies;

import org.springframework.beans.factory.annotation.Autowired;

import com.learningSpring.chap2.xmlconfig.CompactDisc;
import com.learningSpring.chap2.xmlconfig.MediaPlayer;

public class CDPlayer implements MediaPlayer {

	private CompactDisc compactDisc;
	
	@Autowired
	public void setCompactDisc(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}

	public void play() {
		compactDisc.play();
	}
}
