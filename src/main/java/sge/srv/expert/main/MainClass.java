package sge.srv.expert.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		// beans.xml 파일을 로딩한다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("sge/srv/expert/config/beans.xml");
	
		ctx.close();
	}

}
