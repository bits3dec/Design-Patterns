package com.practice.designPatterns;

public class Test {
	public static void main(String[] args) {
		Singleton instanceA = Singleton.getInstance();
		Singleton instanceB = Singleton.getInstance();
		Singleton instanceC = Singleton.getInstance();
		Singleton instanceD = Singleton.getInstance();

		if(instanceA == instanceD) {
			System.out.println("Both the instances are same");
		} else {
			System.out.println("Both the instances are different");
		}
		
		System.out.println(instanceA);
		System.out.println(instanceB);
		System.out.println(instanceC);
		System.out.println(instanceD);
	}
}
