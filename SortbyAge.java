package Com.te.demo.Arraylist;

import java.util.Comparator;

public class SortbyAge implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1,Student1 o2) {
		
		return o1.age - o2.age;
	}

}
