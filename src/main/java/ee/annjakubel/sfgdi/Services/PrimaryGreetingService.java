package ee.annjakubel.sfgdi.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


//Primary bean in a situation where there isn't a @Qualifier
//Then Spring knows to choose this bean
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY bean";
    }
}
