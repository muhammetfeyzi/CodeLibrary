package com.GreekCode;

import java.util.Random;

public class PairWithgivenSumInSortedArray {
	/*
	 *Muammet Feyzi Saðlam 06.11.2018
	 
	 * We sum a pair of elements in the array, we find equal pairs in the array's own element.
	 * example we will has got a array and array consist of {1,2,3,4,5,6,7} elements
	 * and we will caluclate which pair total equals arrays member
	 * 
	 * ALgorithm performnance analysis = first for O(n) * second for O(n) * last for O(n) = O(n^3)
	 */
	
	static Random rnd; //Random array object referans
	static int []randomArray; // array refrans
	static int[]sortedArray;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int test[]={1,2,3,4,5,6,7,8};
		findPairSum(test);
	}

	private static void findPairSum(int[] pairSumArray) {
		// TODO Auto-generated method stub
		int count=0;
		int pair=0;
		for (int i = 0; i < pairSumArray.length; i++) {
			 for (int j = pairSumArray.length-1; j > i; j--) {
				  pair=pairSumArray[j]+pairSumArray[i];
				  for (int k = 0; k < pairSumArray.length; k++) {
					    if(pair==pairSumArray[k]){
					    	System.out.println(" ( "+pairSumArray[j]+"+"+pairSumArray[i]+" ) "+pair );
					    	count++;
					    }
				}
			}
		}
		
	}



}
