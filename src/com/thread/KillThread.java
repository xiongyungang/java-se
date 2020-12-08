package com.thread;

public class KillThread extends Thread{
	Hero hero1;
	Hero hero2;
	public KillThread(Hero hero1,Hero hero2){
		this.hero1=hero1;
		this.hero2=hero2;
	}
	public void run(){
		while(!hero2.isDead()){
			hero1.attackHero(hero2);
		}
	}
}
