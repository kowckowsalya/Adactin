package com.Maven_Project;

public class Pojo_Swe {
	
	
	public static void main(String[] args) {
		Poja_kow p = new Poja_kow();
		
		int a = p.getA();
		System.out.println(a);
		
		p.setA(1000);
		
		int a2 = p.getA();
		System.out.println(a2);
		
	    p.setA(5000);
	    int a3 = p.getA();
	    System.out.println(a3);
		
	
	}

}
