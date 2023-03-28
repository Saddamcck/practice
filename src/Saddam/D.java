package Saddam;

public class D {
public static void main(String[] args) {
	D d1=new D();
	d1.test1();
	D.test2();
	d1.test3();
}
public void test1() {
	System.out.println(100);
}
public static void test2() {
	System.out.println(200);
}
public void test3() {
	System.out.println(300);
}
}
