package com.lijun;
public class Person 
{
	int id;
	int age;
	public Person(){
		id=10;
		age=100;
	}
	public Person(int t){
		id=t;
		age=100;
	}
	public Person(int t, int p){
		id=t;
		age=p;
	}
	void changedAge(int a){
		age=a;
	}
  public void saySb(){
	  System.out.println("You Are Sb!");
  }
public static void main(String[] args){
/*	Person p1=new Person();
	System.out.println(p1.id);

	Person p2=new Person(11);
	System.out.println(p2.id);

 	Person p3=new Person(11, 101);
    System.out.println(p3.id);
	
	int temp=19;
	p1.changedAge(temp);
	System.out.println(p1.age);

	p1.changedAge(temp++);
    System.out.println(p1.age);
	System.out.println(temp);  */
	
}
}