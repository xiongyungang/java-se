package com.ThreadDemo;

public class Hero {
	public String name;
	public float hp;
	public int damage;
	public boolean flag = false;

	public Hero() {
	}

	public Hero(String name, float hp, int damage) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}

	public synchronized void attackHero(Hero h) {
		if (flag) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			h.hp -= damage;
			System.out.printf("%s攻击了%s,%s的HP为%.0f%n", name, h.name, h.name, h.hp);
			if (h.isDead())
				System.out.println(h.name + "死了");
		}else
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean isDead() {
		return 0 >= hp ? true : false;
	}

	public String toString() {
		return "" + name + hp + damage;
	}
}
