package oata;
import java.util.*;

public class ArrayListDemo {
	public static void main(String args[]){
		ArrayList<String> al= new ArrayList<String>();
		
		System.out.println("initial size of all:"+ al.size());
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("E");
		al.add("D");
		al.add("F");
		al.add(1,"A2");
		
		System.out.println("Size of al after insertion:"+ al.size());
		System.out.println("contents of al:"+ al);
		
		al.remove("D");
		al.remove(4);
		
		System.out.println("size of al after deletion"+al.size());
		System.out.println("contents of al:"+ al);
		
	}
}
