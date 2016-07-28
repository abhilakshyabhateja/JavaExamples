package com.training.domains;

public class FirstExample {

	public String understandFinally(){
		
		String number="Four";
		try{
			int val=Integer.parseInt(number);
			System.out.println("Value "+val);
		}catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
			
			return "Caught";
		}
		finally {
			
			System.out.println("Inside Finally Block");
		}
		
	
		
		return null;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstExample obj=new FirstExample();
		String msg=obj.understandFinally();
		
		System.out.println(msg);
		
		
		String s="Hello";
		
		try
		{
		System.out.println("String Length:"+s.length());
		}
		catch(NullPointerException e){
			
			System.err.println("String value is Null-Check");
			
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println("Inside Finally");
		}
		
		System.out.println("Bye");
		
	}

}
