package test.demo.uid;

import test.demo.utils.SerializationUtils;

/**
 * 处理反序列化内容 - 消费者
 * @author zhangqingfeng
 *
 */
public class Consumer {
	public static void main(String[] args) throws Exception{
		Person person = (Person)SerializationUtils.ReadObject();
		System.out.println("name=" + person.NameGetter());
	}
}
