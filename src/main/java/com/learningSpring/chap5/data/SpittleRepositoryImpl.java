package com.learningSpring.chap5.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.learningSpring.chap5.Spittle;

@Component
public class SpittleRepositoryImpl implements SpittleRepository{

	@Override
	public List<Spittle> findSpittles(long max, int count) {
		List<Spittle> spittles = new ArrayList<>();
		for(int i = 0;i < count; i++){
			spittles.add(new Spittle("Spittle " + i,new Date()));
		}
		return spittles;
	}

	@Override
	public Spittle findOne(long id) {
		return new Spittle("Hello",new Date());
	}
	
	

}
