package test.demo.uid;

import java.io.Serializable;

import javax.xml.bind.ValidationEvent;

/*
 * �̳����л���
 */
public class Person implements Serializable {
	private String name;
	//name��getter
	public String NameGetter(){
		return this.name;
	}
	//namd��setter
	public void NameSetter(String name){
		this.name = name;
	}
}
