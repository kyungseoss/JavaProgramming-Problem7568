package problem7568;

import java.util.Scanner;

/*
 * 백준 7568번 문제 
 */

public class Problem7568 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int deongchi[][] = new int[num][2];
		int rank[] = new int[num];
		
		for(int i=0; i<num; i++) {
			rank[i] = 1;
			deongchi[i][0] = scan.nextInt();
			deongchi[i][1] = scan.nextInt();
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(deongchi[i][0]>deongchi[j][0] && deongchi[i][1] > deongchi[j][1]) {
					rank[j]++;
				}
			}
		}
		
		for(int i=0; i<num; i++) {
			System.out.print(rank[i] + " ");
		}	
	}
}
