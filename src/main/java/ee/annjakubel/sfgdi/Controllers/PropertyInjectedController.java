package ee.annjakubel.sfgdi.Controllers;

import ee.annjakubel.sfgdi.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    //least preferred controller strategy

    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
