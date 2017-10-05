package br.com.spring.utils;

import java.util.Random;

public class SpringUtils {

	public static Integer generateRandomValues(Integer max){
		
		return new Random().nextInt((max - 5) +1)+5;
	}
	
	
}
