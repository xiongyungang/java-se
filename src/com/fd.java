package com;

import java.util.Scanner;

public class fd {
		public static void main(String[] args) {
			double total = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ʒ���ۣ�");
			double price = sc.nextDouble();
			Scanner sn = new Scanner(System.in);
			System.out.println("��������Ʒ������");
			Integer num = sn.nextInt();
			total = price * num;
			
			System.out.println("���븶���");
			Scanner sm = new Scanner(System.in);
			double money = sm.nextDouble();
			
			System.out.println("����:"+money+"   ����:"+price +"    ����:"+num+"   ����:"+(money-sale(total)));
		
		}

		public static double sale(double total) {
			if (total >= 500) {
				total *= 0.8;
				return total;
			}else {
				return total;
			}
		}
}
