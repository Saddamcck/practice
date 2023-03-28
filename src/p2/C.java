package p2;

import java.util.Scanner;

public class C{
	
  public static void main(String[] args) {
   int balance=500;
   Scanner scan = new Scanner(System.in);
	 System.out.println("Enter Amount"); 
	 int amount = scan.nextInt();
	 if(balance>amount) {
		 System.out.println("please collect the cash");
	 }else {
		 try {
			throw new InsufficientFund();
		} catch (InsufficientFund e) {
         System.out.println(e);
         System.out.println("low balance");
		}
	 }
}
}
