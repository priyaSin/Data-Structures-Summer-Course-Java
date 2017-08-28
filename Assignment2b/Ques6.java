/* ASSIGNMENT - 2b QUESTION-6 

Problem Statement - You are given S a sequence of n integers S = s1,s2, ..., sn.
Please, compute if it is possible to split S into two parts : s1, s2, ..., si and si+1,
si+2, ....., sn (1 <= i < n) in such a way that the first part is strictly decreasing while the
second is strictly increasing one. First take n as input and then take n more integers, output yes
or no.

*/
import java.util.Scanner;
public class Ques6{

	public static Boolean detectSequence(int [] arr){
		Boolean flag = true;
		int count = 0;         // count is increased evertime we encounter a[i] < a[i+1]
		int a [] = new int[arr.length];   // For storing the index values where a[i] <a[i+1].
		//First element of which will give us the index where for the first time the sequence changes from decreasing to increasing.
		int j = 0;
		for(int i = 0 ; i < arr.length-1 ; i++){
			if(arr [i] < arr[i+1]){
				count++;
				a[j] = i;
				j++;
			}
		}
		System.out.println(count);
		if(count == arr.length-a[0]-1){   // a[0] is the index where the series firt time changed from decreasing to increasing
			flag = true;
		}
		else{
			flag = false;
		}
		return flag;


	}


	public static void main(String [] args){
		System.out.println("Enter the value of n:");
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter n integers:");
		for(int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		Boolean flag = detectSequence(arr);
		if(flag == true){
		System.out.println("Yes");
	    }
	    else{
	    	System.out.println("No");
	    }
	}
}