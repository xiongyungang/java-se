package com.thread;

public class KillRunnable implements Runnable{
	Hero hero1=new Hero();
	Hero hero2=new Hero();
	public KillRunnable(Hero hero1,Hero hero2){
		this.hero1=hero1;
		this.hero2=hero2;
	}
	public void run() {
		while(!hero2.isDead()){
			hero1.attackHero(hero2);
		}
	}

}
