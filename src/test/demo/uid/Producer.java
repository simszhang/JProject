package test.demo.uid;

import test.demo.utils.SerializationUtils;

/**
 * 消息的生产者
 * @author zhangqingfeng
 *
 */
public class Producer {
	public static void main(String[] args) throws Exception{
		Person person = new Person();
		person.NameSetter("混世魔王");
		//序列化保存到本地磁盘
		SerializationUtils.WriteObject(person);
	}
}
