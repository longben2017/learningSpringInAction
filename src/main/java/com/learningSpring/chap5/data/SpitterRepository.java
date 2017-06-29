package com.learningSpring.chap5.data;

import com.learningSpring.chap5.Spitter;

public interface SpitterRepository {
	Spitter save(Spitter spitter);
	
	Spitter findByUsername(String username);
}
