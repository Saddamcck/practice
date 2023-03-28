package Saddam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;

public class List {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(100);
		list.add(300);
	
		
		Vector<Integer> obj=new Vector<>();
		obj.add(10000);
		obj.add(20000);
		obj.add(30000);
		obj.add(40000);
		obj.addAll(3, list);
		
		obj.forEach(e->{System.out.println(e);});
		
//		for(int x:list) {
//			System.out.println(x);
//		}
		
//		Iterator<Integer> itr = list.iterator();
//		while(itr.hasNext()) {
//			Integer itr1 = itr.next();
//			System.out.println(itr1);
//		
//		ListIterator<Integer> listitr = list.listIterator(list.size());
//		while(listitr.hasPrevious()) {
//			Integer litr = listitr.previous();
//			System.out.println(litr);
//		}
//		}
//		
//		TreeSet<Integer> hash = new TreeSet<>();
//		hash.addAll(list);
//		System.out.println(hash);
//		hash.forEach(e->{System.out.println(e);});
//		for(int x:hash) {
//			System.out.println(x);
//		}
		
//		HashMap<String,Integer> hash = new HashMap<>();
//		hash.put("Vivek", 100);
//		hash.put("Moin", 80);
//		hash.put("subham", 90);
//		System.out.println(hash);
	
		
	}
}
