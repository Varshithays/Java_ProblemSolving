package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

class Student1
{
int rollno;
String name;
int age;
Student1(int rollno,String name,int age)
{
this.rollno=rollno;
this.name=name;
this.age=age;
}
}
public class Arraylistpgm {

	public static void main(String[] args) {
		
		Student1 s1=new Student1(101,"arun",23);
		Student1 s2=new Student1(102,"arjun",21);
		Student1 s3=new Student1(103,"amogh",25);
		//creating ArrayList
		ArrayList<Student1> al=new ArrayList<Student1>();
		al.add(s1); //adding Student class object
		al.add(s2);
		al.add(s3);
		System.out.println(al);
		//Getting Iterator:iterate the elements of collection
		Iterator itr=al.iterator();
		//traversing elements of ArrayList object
		while(itr.hasNext())
		{
		Student1 st=(Student1)itr.next();
		System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}

}
