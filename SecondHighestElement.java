package com.assignment.test;

public class SecondHighestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={7,1,2,5,3,4,2,8,5,9,1,2,4,2,6,8};
		int secondHighestElement=secondHighestElement(arr);
		System.out.println(secondHighestElement);
		int[] arr2={-9,-9,-9,-9,-9,-1};
		secondHighestElement=secondHighestElement(arr2);
		System.out.println(secondHighestElement);
		int[] arr3={9,9,9,9,9,1};
		secondHighestElement=secondHighestElement(arr3);
		System.out.println(secondHighestElement);
		int[] arr4={9,-9,9,-2,0,-1};
		secondHighestElement=secondHighestElement(arr4);
		System.out.println(secondHighestElement);
		

	}
	
	public static int secondHighestElement(int[] arr){
		int max=arr[0];
		int secondHighest=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<max && arr[i]>secondHighest){
				secondHighest=arr[i];
			}else if(arr[i]>max){
				max=arr[i];
			}else if (secondHighest==max && arr[i]<secondHighest){
				secondHighest=arr[i];
			}
		}
		return max!=secondHighest?secondHighest:-1;
	}
}
