package com.ngxson;

class Fibonaci {
	/*
	 * https://projecteuler.net/problem=2
	Each new term in the Fibonacci sequence is generated by adding the previous two terms.
	 By starting with 1 and 2, the first 10 terms will be:

	1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

	By considering the terms in the Fibonacci sequence whose values do not exceed four million,
	find the sum of the even-valued terms.
	 */
	public static void main(String[] arg) {
		int[] fibo = new int[100000];
		fibo[1] = 1;
		fibo[2] = 2;
		int count = 2;
		int i = 1;
		while(fibo[count] < 4000000) {
			System.out.print(fibo[count] + " ------- ");
			i = i + fibo[count];
			System.out.println(i);
			count = count +1;
			int ca = count - 1;
			int cb = count -2;
			fibo[count] = fibo [ca] + fibo [cb];
		}
		//System.out.println(fibo[count]);
	}
}