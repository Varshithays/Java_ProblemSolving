package collectionframework;

import java.util.ArrayList;

public class Student {

	public static void main(String[] args) {
		Student s1=new Student(101,"arun",23);
		Student s2=new Student(102,"arjun",21);
		Student s3=new Student(103,"amogh",25);
		//creating arraylist
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1); //adding Student class object
		al.add(s2);
		al.add(s3);
		System.out.println(al);
		//Getting Iterator:iterate the elements of collection
		Iterator itr=al.iterator();
		//traversing elements of ArrayList object
		while(itr.hasNext())
		{
		Student st=(Student)itr.next();
		System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
