package com.learningSpring.chap5.data;

import org.springframework.stereotype.Component;

import com.learningSpring.chap5.Spitter;

@Component
public class SpitterRepositoryImpl implements SpitterRepository {

	@Override
	public Spitter save(Spitter spitter) {
		return null;
	}

	@Override
	public Spitter findByUsername(String username) {
		return null;
	}

}
