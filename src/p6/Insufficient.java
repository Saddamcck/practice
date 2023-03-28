package p6;

public class Insufficient{

	public static void main(String[] args) {
		String str="121";
		String str2=" ";
		
		for (int i = str.length()-1; i>=0; i++) {
			str2=str2+str.charAt(i);
		}
		if(str2.equals(str2)) {
			System.out.println("pallindrom no");
		}else {
			System.out.println("not pallindrom");
		}
			
	}
}
