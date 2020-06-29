package jr.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String krijgDutchGroet() {
        return "Hallo! - Primaire Groet Service";
    }

    @Override
    public String krijgEnglishGroet() {
        return "Hello! - Primary Greeting Service";
    }

    @Override
    public String krijgSpanishGroet() {
        return "Servicio de Saludo Primario";
    }
}
