package chris.springframework.sfgdi.services;

public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Holo Mundo - ES";
    }
}
