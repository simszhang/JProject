package test.demo.uid;

import test.demo.utils.SerializationUtils;

/**
 * ��Ϣ��������
 * @author zhangqingfeng
 *
 */
public class Producer {
	public static void main(String[] args) throws Exception{
		Person person = new Person();
		person.NameSetter("����ħ��");
		//���л����浽���ش���
		SerializationUtils.WriteObject(person);
	}
}
