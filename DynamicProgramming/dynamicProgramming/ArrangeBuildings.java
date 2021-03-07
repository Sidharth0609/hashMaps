package dynamicProgramming;

import java.util.Scanner;

public class ArrangeBuildings {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		long n=scn.nextLong();
		long oczeroes=1;
		long ocones=1;
		for(int i=2;i<=n;i++) {
			long nczeroes=ocones;
			long ncones=oczeroes+ocones;
			ocones=ncones;
			oczeroes=nczeroes;
		}
		long totalWays=oczeroes+ocones;
		totalWays*=totalWays;
		System.out.println(totalWays);
		scn.close();
	}

}
