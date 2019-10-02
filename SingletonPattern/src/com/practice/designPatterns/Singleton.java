package com.practice.designPatterns;

public class Singleton {
	//Lazy Initialization
	//Volatile ensures the instance variable is read correctly by reading/writing from the main memory 
	private volatile static Singleton instance;
	
	private Singleton() {
		System.out.println("Singleton instance created !!!");
	}
	
	//Global point of access
	//Synchronize only for the first time when the instance is not yet created
	//Lazy Initialization
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
