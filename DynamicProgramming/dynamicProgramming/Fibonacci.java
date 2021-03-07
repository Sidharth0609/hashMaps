package dynamicProgramming;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int fibn=FibMemorized(n,new int[n+1]);
		System.out.println(fibn);
		scn.close();
	}
	public static int FibMemorized(int n,int[] qb) {
		if(n==0 || n==1) {
			return n;
		}
		if(qb[n]!=0) {
			return qb[n];
		}
		int fibnm1 = FibMemorized(n-1,qb);
		int fibnm2 = FibMemorized(n-2,qb);
		int fibn=fibnm1+fibnm2;
		qb[n]=fibn;
		System.out.print(fibn + " ");
		return fibn;
	}
}
