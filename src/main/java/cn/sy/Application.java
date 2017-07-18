package cn.sy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring.xml");

		// camel context start后，会随着spring停止而停止。
		try {
			while(true) Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
