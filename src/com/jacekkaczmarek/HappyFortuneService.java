package com.jacekkaczmarek;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	
	@Override
	public int getForune() {
		int [] tab = {20,30,40};
		Random rand = new Random();
		int x = rand.nextInt(3);
		return tab[x];
	}

}
