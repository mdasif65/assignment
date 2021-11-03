package Com.te.demo.Arraylist;

public class Student1 {
int id;
String name;
int age;

public Student1(int id, String name, int age, double marks) {

	this.id = id;
	this.name = name;
	this.age = age;
}

@Override
public int hashCode() {
	return id;
}

@Override
public boolean equals(Object obj) {

	Student1 stu = (Student1) obj;
	return this.id==stu.id;
}

@Override
public String toString() {
	return "Student1 [id=" + id + ", name=" + name + ", age=" + age + "]";
}

}
