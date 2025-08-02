package app.labs.ex05.jdbc01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpEx {

	public static void main(String[] args) {
		
		AbstractApplicationContext context
		= new GenericXmlApplicationContext("classpath:config/di01/application-config.xml");
		
		context.close();
	}

}
