package com.ch.test;

import java.util.Scanner;

public class FuncRevenue {
	double FuncRevenueAccount( double amount )
	{
		double rate = 1.0; // 设置折扣率
		if( amount <= 800 ) // 若账单不高于800元，则无折扣
			rate = 1.0;
		else if( amount > 800 && amount <= 1800 )
			rate = 0.9; // 9折
		else if( amount > 1800 && amount <= 4800 )
			rate = 0.8; // 8折
		else if( amount > 4800 )
			rate = 0.7; // 7折
		else if( amount <= 0 ){ // 否则，赋予一个负数，表示无效
			return -1000.0;
		}
		return amount * rate; // 返回经优惠计算之后的账单
	}
	
	public static void main(String[] args) {
		FuncRevenue f =new FuncRevenue();
		 Scanner scan = new Scanner(System.in);
		double amountBefore = 0.0;
		System.out.println( "请输入账单的消费数额（该数额应大于零）：" );
		 amountBefore=scan.nextDouble();  
		System.out.println( "输入的账单值为:"+amountBefore );
		double amountAfter = 0.0;
		amountAfter = f.FuncRevenueAccount( amountBefore );
		if( amountAfter <= 0 )
			System.out.println( "账单消费数额无效" );
		else
			System.out.println( "优惠计算后的账单值为"+amountAfter );
	}
}
