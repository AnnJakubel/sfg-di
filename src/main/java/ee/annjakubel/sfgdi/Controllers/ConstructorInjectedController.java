package ee.annjakubel.sfgdi.Controllers;

import ee.annjakubel.sfgdi.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    //most preferred controller strategy
    //no need to autowire from Spring 4.2 version
    public ConstructorInjectedController(GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
