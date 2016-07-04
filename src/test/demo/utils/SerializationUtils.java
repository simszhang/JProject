package test.demo.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 序列化工具
 * @author zhangqingfeng
 *
 */
public class SerializationUtils {
	private static String FILE_NAME = "C:/obj.bin";
	
	//序列化
	public static void WriteObject(Serializable s){
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
			oos.writeObject(s);
			oos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	//反序列化
	public static Object ReadObject(){
		Object obj = null;
		try {
			ObjectInput input =  new ObjectInputStream(new FileInputStream(FILE_NAME));
			obj = input.readObject();
			input.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return obj;
	}
}
