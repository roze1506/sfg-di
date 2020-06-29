package jr.springframework.sfgdi.services;

public class I18nEnglishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nEnglishGreetingService (GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String groet() {
        return "Hello World! - EN";
    }
}
