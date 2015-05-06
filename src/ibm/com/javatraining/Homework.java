package ibm.com.javatraining;

import java.util.ArrayList;


public class Homework {
	
	public static double Sqrt(double d){
		double r;
		r = Math.sqrt(d);
		return r;
	}
	
	public static void PrintSeven(int maxNum,int flag){
		String temp,sFlag;
		sFlag = String.valueOf(flag);
		
		for (int i = 1;i<maxNum;i++){
			
			temp = String.valueOf(i);
			if (temp.contains(sFlag) || i % flag == 0)
				System.out.println(i);
			
		}
	}
	
	public static int FindMaxnumInThree(int a,int b, int c){
		int temp;
		if (a > b){
			temp = a;
		
		}else{
			temp = b;	
		}
		if (c > temp){
			temp =c;
		}
		
		return temp;
		
	}
	
	
	public static String IntegerToBinary(int i){
		String s;
		s = Integer.toBinaryString(i);
		return s;
	}
	
	public static ArrayList<Integer> findDivisor(int num){
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		
		for(int i = 1; i <= num; i++){
			 if(num % i == 0){
			 	resultList.add(i);
			 }
		 }
		
		return resultList;
		
	}
	
	public static int CheckOddEnevResult(int i){
		if (i % 2 ==0){
			return 1;
		}
		else{
			return 0;
		}
		
		
	}
	
	public static void main(String args[]){
		double x = -1.1;
		int maxNum = 100;
		int seven = 7;
		int a =100,b=101,c=102,result;
		int integerNum = 4;
		String binary;
		ArrayList<Integer> divisorResult ;
		
		divisorResult = findDivisor(50);
		
		for(int i = 0;i < divisorResult.size(); i ++){
			System.out.println(divisorResult.get(i));
		}
		
//		binary =IntegerToBinary(integerNum);
//		
//		System.out.println(binary);
		
//		result = FindMaxnumInThree(a,b,c);
//		System.out.println(result);
		
//		x = Sqrt(x);
//		if (x == Float.NaN)
//		{
//			System.out.println(x);
//		}
		
//		PrintSeven(maxNum,seven);
	
	}


}


