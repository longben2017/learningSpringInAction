package com.learningSpring.chap5.data;

import java.util.List;

import com.learningSpring.chap5.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max,int count);
	
	Spittle findOne(long id);
}
