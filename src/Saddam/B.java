package Saddam;

public class B{
     public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=4;j++) {
				if(i==2&&j==2||i==2&&j==3||i==2&&j==4||i==4&&j==1||i==4&&j==2||i==4&&j==3) {
					System.out.print(" ");
				}else{
				System.out.print("S");
				}
				System.out.print(" ");
				}
			System.out.println(" ");		
		}
	}
}
