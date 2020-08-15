package jinzhanggui;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:jinzhanggui.xml");
		MyPerson jinzhanggui = (MyPerson)classPathXmlApplicationContext.getBean("jinzhanggui");
		System.out.println(jinzhanggui.getAddress());
	}
}
