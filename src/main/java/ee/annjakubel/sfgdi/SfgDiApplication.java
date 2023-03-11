package ee.annjakubel.sfgdi;

import ee.annjakubel.sfgdi.Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		//ApplicationContext primary job is to manage beans

		MyController myController = (MyController) ctx.getBean("myController");
		//Spring is providing an instance of MyController object though context.
		//No need for new keyword.

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
