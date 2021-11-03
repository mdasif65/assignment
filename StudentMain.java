package Com.te.demo.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
	Set<Student1> set=new HashSet<Student1>();
	set.add(new Student1(5, "asif", 18, 34.5));
	set.add(new Student1(5, "asif", 18, 34.5));
	set.add(new Student1(6, "asi", 19, 36.5));
	set.add(new Student1(8, "asil", 14, 35.5));
	String ans;
	ArrayList arrayList=new ArrayList<Student1>(set);
	Scanner sc=new Scanner(System.in);
	do {
	System.out.println("enter the 1 for sorting using name");
	System.out.println("enter the 2 for sorting using age");
	System.out.println("enter the 3 for sorting using id");
	int type=sc.nextInt();
	
	
	switch (type) {
	case 1:{
	//	Collections.sort(arrayList, new SortbyName());
for (Student1 student : set) {
			System.out.println(arrayList);
}
		break;
	}
	case 2:{
//		Collections.sort(arrayList, new SortbyAge());
		for (Student1 student : set) {
		System.out.println(arrayList);
		}
		break;
	}
	case 3:{
	//	Collections.sort(arrayList, new SortbyId());
		for (Student1 student : set) {
		System.out.println(arrayList);
		}
		break;
	}
	default:
		throw new MyException("unexpected value not valid: "+ type);
	}
System.out.println("to continue press yes");
System.out.println("to continue press no");

ans=sc.next();
	}while(ans.contentEquals("yes"));

}
}