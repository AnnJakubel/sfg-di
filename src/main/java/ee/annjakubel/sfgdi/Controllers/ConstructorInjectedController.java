package ee.annjakubel.sfgdi.Controllers;

import ee.annjakubel.sfgdi.Services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    //most preferred controller strategy
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
