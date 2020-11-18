package com.yueqian;

public class Test01 {

	public static void main(String[] args) {
		test2();
	}

	public static void test2(){
		for(int i = 1 ; i <= 9 ; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.printf("%sx%s=%-5s",i,j,i*j);
			}
			System.out.println();
		}
	}

	public void play() {
		System.out.println("hello world");
	}

}
