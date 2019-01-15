package com;

import java.util.Scanner;

public class fd {
		public static void main(String[] args) {
			double total = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入商品单价：");
			double price = sc.nextDouble();
			Scanner sn = new Scanner(System.in);
			System.out.println("请输入商品数量：");
			Integer num = sn.nextInt();
			total = price * num;
			
			System.out.println("输入付款金额：");
			Scanner sm = new Scanner(System.in);
			double money = sm.nextDouble();
			
			System.out.println("收您:"+money+"   单价:"+price +"    数量:"+num+"   找零:"+(money-sale(total)));
		
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
