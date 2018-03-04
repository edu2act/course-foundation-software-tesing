package lww.class3;

import java.util.Arrays;

public class Calculator {
	protected int a;
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		/*int total = calculator.calcutatNums(10, 11);
		System.out.println("10到20之间的数字和：" + total);*/
		
//		System.out.println(calculator.calcutatNumsWhileTest());
		calculator.calculateNumsForTest();
	}
	
	/**
	 * 计算任意给定的两个数之间的所有数之和
	 * 
	 * @param beginNum 开始数字
	 * @param endNum  结束的数字
	 * @return  和
	 */
	public int calcutatNums(int beginNum, int endNum){
		//和变量
		int sum = 0;
		for(int i = beginNum; i <= endNum; i++){
			sum += i;
		}
		return sum;
	}
	
	public int calcutatNumsWhileTest(){
		//和变量
		int sum = 0;
		//循环变量
		int i = 1;
		while(sum < 1000){
			sum += i * (i+1);
			i++;
		}
		return i;
	}
	
	public int calculateNumsForTest(){
		int[] nums = {1,2,7,6,5,13,7,35,0,4};
		Arrays.sort(nums);
		int sum = 0;
		for(int i:nums){
//			sum += i;
			System.out.println(i);
		}
		System.out.println(Arrays.binarySearch(nums, 2));
		return 0;
	}
}
