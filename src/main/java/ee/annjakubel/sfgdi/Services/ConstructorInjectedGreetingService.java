package ee.annjakubel.sfgdi.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - Constructor";
    }
}