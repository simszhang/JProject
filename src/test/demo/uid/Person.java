package test.demo.uid;

import java.io.Serializable;

import javax.xml.bind.ValidationEvent;

/*
 * �̳����л���
 */
public class Person implements Serializable {
	private static final long serialVersionUID = 55799L;
	private String name;
	private int age;
	//name��getter
	public String NameGetter(){
		return this.name;
	}
	//namd��setter
	public void NameSetter(String name){
		this.name = name;
	}
	public int AgeGetter(){
		return this.age;
	}
	//namd��setter
	public void AgeSetter(int age){
		this.age = age;
	}
}
