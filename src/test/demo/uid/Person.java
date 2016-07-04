package test.demo.uid;

import java.io.Serializable;

import javax.xml.bind.ValidationEvent;

/*
 * 继承序列化类
 */
public class Person implements Serializable {
	private static final long serialVersionUID = 55799L;
	private String name;
	private int age;
	//name的getter
	public String NameGetter(){
		return this.name;
	}
	//namd的setter
	public void NameSetter(String name){
		this.name = name;
	}
	public int AgeGetter(){
		return this.age;
	}
	//namd的setter
	public void AgeSetter(int age){
		this.age = age;
	}
}
