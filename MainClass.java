package minimal;

import java.util.*;

interface OperAble
{
	public int cal(int a, int b);
}

  class Addition implements OperAble {
  
  @Override public int cal(int a, int b) { return a+b;
  
  }
  
  }
 
class Sub implements OperAble
{

	@Override
	public int cal(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
}
class Multiple implements OperAble
{

	@Override
	public int cal(int a, int b) {
		
		return a*b;
	}
	
}

class Division implements OperAble
{

	@Override
	public int cal(int a, int b) {
		
		return a/b;
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
		//OperAble op=new Addition();
         //System.out.println(op.cal(20, 10));
	
		/*
		 * OperAble op=(int a, int b)-> { return a+b; };
		 */
	
	 	 OperAble op=(a,b)->a+b;
	 	 System.out.println(op.cal(30, 40));
	 	 
	 	// OperAble sub=new Sub();
	 	 //System.out.println(sub.cal(40, 20));
	     
	 	 OperAble op1=(a,b)->a-b;
	 	 System.out.println(op1.cal(60, 30));
	 	 
	 	OperAble mult=(a,b)->a*b;
	 	 System.out.println(mult.cal(6, 3));
	 	 
	 	OperAble div=(a,b)->a/b;
	 	 System.out.println(div.cal(6, 3));
	}
}
