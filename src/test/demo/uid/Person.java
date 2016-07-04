package test.demo.uid;

import java.io.Serializable;

import javax.xml.bind.ValidationEvent;

/*
 * 继承序列化类
 */
public class Person implements Serializable {
	private String name;
	//name的getter
	public String NameGetter(){
		return this.name;
	}
	//namd的setter
	public void NameSetter(String name){
		this.name = name;
	}
}
