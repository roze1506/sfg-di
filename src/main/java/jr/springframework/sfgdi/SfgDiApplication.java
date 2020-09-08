package jr.springframework.sfgdi;

import jr.springframework.sfgdi.controllers.ConstructorInjectedController;
import jr.springframework.sfgdi.controllers.MyController;
import jr.springframework.sfgdi.controllers.PropertyInjectedController;
import jr.springframework.sfgdi.controllers.SetterBasedController;
import jr.springframework.sfgdi.examplebeans.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController)context.getBean("myController");

		DataSource dataSource = context.getBean(DataSource.class);

		System.out.println("Gebruikersnaam: " + dataSource.getGebruikersnaam());
		System.out.println("Wachtwoord: " + dataSource.getWachtwoord());
		System.out.println("Database URL: " + dataSource.getUrl());
	}

}
