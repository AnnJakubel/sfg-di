package ee.annjakubel.sfgdi;

import ee.annjakubel.sfgdi.Controllers.ConstructorInjectedController;
import ee.annjakubel.sfgdi.Controllers.MyController;
import ee.annjakubel.sfgdi.Controllers.PropertyInjectedController;
import ee.annjakubel.sfgdi.Controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Constructor;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		//ApplicationContext primary job is to manage beans

		MyController myController = (MyController) ctx.getBean("myController");
		//Spring is providing an instance of MyController object though context container.
		//No need for new keyword.

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------- Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}