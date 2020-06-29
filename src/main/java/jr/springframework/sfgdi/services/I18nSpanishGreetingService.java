package jr.springframework.sfgdi.services;

public class I18nSpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nSpanishGreetingService (GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String groet() {
        return "Hola Mundo! - ES";
    }
}
