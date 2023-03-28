package practice;

public class Emplyee {

//	      Object initialize through Method.
//	String name;
//	int Id;
//	public void test(String n,int i) {
//		name=n;
//     	Id=i;
//		//System.out.println(n+" "+i);
//}
//	public static void main(String[] args) {
//		Emplyee e=new Emplyee();
//		e.test("saddam", 1001);
//		System.out.println(e.name+" "+e.Id);
//	}
	
// 	Object Initialize by refrence Variable
	
//	String color;
//	int age;
//	
//	public static void main(String[] args) {
//		Emplyee e=new Emplyee();
//		e.color="red";
//		e.age=10;
//		System.out.println(e.color+" "+e.age);
//	}
	
//     Object Initialize by Constructor
	
	String name;
	int Id;
	
	Emplyee(String name,int Id){
		this.name=name;
		Id=Id;
	}
	
	public static void main(String[] args) {
		Emplyee e=new Emplyee("saddam",101);
		e=new Emplyee("ayat",102);
		System.out.println(e.name);
	}
	
}

