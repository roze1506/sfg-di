package jr.springframework.sfgdi;

import jr.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController)context.getBean("i18nController");
		System.out.println(i18nController.zegHallo());

		MyController myController = (MyController)context.getBean("myController");
		System.out.println("----------------- Primary Bean");
		System.out.println(myController.zegHallo());

		System.out.println("----------------- Property");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.krijgGroet());

		System.out.println("----------------- Setter");
		SetterBasedController setterBasedController =
				(SetterBasedController) context.getBean("setterBasedController");
		System.out.println(setterBasedController.krijgGroet());

		System.out.println("----------------- Constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.krijgGroet());
	}

}
