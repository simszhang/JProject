package test.demo.uid;

import test.demo.utils.SerializationUtils;

/**
 * �������л�����
 * @author zhangqingfeng
 *
 */
public class Consumer {
	public static void main(String[] args) throws Exception{
		Person person = (Person)SerializationUtils.ReadObject();
		System.out.println("name=" + person.NameGetter());
	}
}
