package p2;

public class B1 {

	public static void main(String[] args) {
		B b1=new B();
		b1.setName("Saddam Ansari");
		String name = b1.getName();
		b1.setMobile("9608356476");
		String str = b1.getMobile();
		b1.setEmail("Saddam@gmail.com");
		String str1 = b1.getEmail();
		
		System.out.println("Name--"+name+"   Email-- "+str+"  Mobile-- "+str1);
		
	}
}
