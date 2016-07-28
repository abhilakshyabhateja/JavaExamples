package com.training.domains;

public class GCApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Book bk = new Book(101,"A","B",200);
		
		//System.out.println(bk);
		
		//bk = null;
		
		System.gc();
		
		System.out.println("Bye");
		
		
	}

}
